package br.unicamp.comprefacil.steps;

import static org.junit.Assert.assertEquals;

import org.assertj.core.api.Assertions;
import org.mockito.Mockito;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

import br.unicamp.comprefacil.dao.DadosDeEntregaDAO;
import br.unicamp.comprefacil.model.Frete;
import br.unicamp.comprefacil.model.Pedido;
import br.unicamp.comprefacil.services.CorreiosServices;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UC01Steps {

	private Throwable throwable;
	private CorreiosServices correio;
	private Pedido pedido;
	private Frete frete;
	private DadosDeEntregaDAO mock_dao;
	private boolean correioServicesStatus;
	
	@Before
	public void setUp() {
		mock_dao = Mockito.mock(DadosDeEntregaDAO.class);
		correio = new CorreiosServices(mock_dao);
		pedido = new Pedido();
		throwable = null;
	}

	@Given("^product weight is (\\d+) g$")
	public void product_weight_is__g(int param1){
		pedido.setPeso(param1);
	}

	@Given("^product width is (\\d+) cm$")
	public void product_width_is__cm(int param1){
		pedido.setLargura(param1);
	}

	@Given("^product height is (\\d+) cm$")
	public void product_height_is__cm(int param1){
		pedido.setAltura(param1);
	}

	@Given("^product length is (\\d+) cm$")
	public void product_length_is__cm(int param1){
		pedido.setComprimento(param1);
	}
	
	@Given("^shipping type is \"(.*)\"$")
	public void shipping_type_is(String arg1){
		pedido.setTipoEntrega(arg1);
	}

	@Given("^zipcode is \"(.*)\"$")
	public void zipcode_is(String arg1){
		pedido.setCep(arg1);
	}

	@Given("^correio is \"(.*)\"$")
	public void correio_is(String arg1){
		if(arg1.equalsIgnoreCase("on"))
			correioServicesStatus = true;
		else
			correioServicesStatus = false;
	}
	
	@When("^I ask to calculate shipping$")
	public void I_ask_to_calculate_shipping(){
		int valor = 0;
		int tempoEntrega = 0;
		
		if(correioServicesStatus) {
			if(correio.validaCep(pedido.getCep())) {
				if(pedido.getTipoEntrega().equals("PAC")){
					valor = 5;
					tempoEntrega = 5;
				} else if(pedido.getTipoEntrega().equals("SEDEX")){
					valor = 20;
					tempoEntrega = 3;
				} else if(pedido.getTipoEntrega().equals("SEDEX10")){
					valor = 100;
					tempoEntrega = 1;
				}
				
				stubFor(get(urlEqualTo("/calcularFrete?peso="+pedido.getPeso()+"&largura="+pedido.getLargura()+
						"&comprimento="+pedido.getComprimento()+"&tipoEntrega="+pedido.getTipoEntrega()+"&cep="+pedido.getCep()))
						.willReturn(aResponse()
								.withHeader("Content-Type", "text/plain")
								.withBody("{\"Valor\":\""+valor+"\",\"PrazoEntrega\":\""+tempoEntrega+"\"}")));
			} else {
				stubFor(get(urlEqualTo("/calcularFrete?peso="+pedido.getPeso()+"&largura="+pedido.getLargura()+
						"&comprimento="+pedido.getComprimento()+"&tipoEntrega="+pedido.getTipoEntrega()+"&cep="+pedido.getCep()))
						.willReturn(aResponse()
								.withStatus(400)));
			}
		} else {
			stubFor(get(urlEqualTo("/calcularFrete?peso="+pedido.getPeso()+"&largura="+pedido.getLargura()+
					"&comprimento="+pedido.getComprimento()+"&tipoEntrega="+pedido.getTipoEntrega()+"&cep="+pedido.getCep()))
					.willReturn(aResponse()
							.withStatus(500)));
		}
		try {
			frete = correio.calculaFrete(pedido);
		} catch (Throwable e) {
			throwable = e;
		}
	}
	
	@Then("^CorreioServices should return an error with the message:$")
	public void CorreioServices_should_return_an_error_with_the_message(String arg1){
		Assertions.assertThat(throwable).isNotNull().hasMessage(arg1);
	}

	@Then("^the shipping cost should be (\\d+)$")
	public void the_shipping_cost_should_be__valor(double param1){
		assertEquals(Double.valueOf(param1), frete.getValor());
	}

	@And("^shipping time should be (\\d+)$")
	public void shipping_time_should_be__tempoEntrega(int param1){
		assertEquals(param1, frete.getTempoEntrega());
	}
	
	@And("^the data returned is saved$")
	public void the_data_returned_is_saved(){
		Mockito.verify(mock_dao, Mockito.times(1)).saveDadosDeEntrega(Mockito.anyDouble(), Mockito.anyInt());
	}

}