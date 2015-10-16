package br.unicamp.comprefacil.steps;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.assertj.core.api.Assertions;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import br.unicamp.comprefacil.dao.DadosDeEntregaDAO;
import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.services.CorreiosServices;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UC02Steps {

	private Throwable throwable;
	private CorreiosServices correio;
	private Endereco endereco;
	private DadosDeEntregaDAO mock_dao;

	@Before
	public void setUp() {
		mock_dao = Mockito.mock(DadosDeEntregaDAO.class);
		correio = new CorreiosServices(mock_dao);
		throwable = null;
	}

	@Given("^I am looking for an address$")
	public void I_am_looking_for_an_address() {
		assertNotNull(correio);
	}

	@Then("^the address should be \"(.*)\"$")
	public void the_address_should_be(String arg1) {
		assertEquals(arg1, endereco.getLogradouro());
	}
	
	@Then("^the neighborhood should be \"(.*)\"$")
	public void the_neighborhood_should_be(String arg1) {
		assertEquals(arg1, endereco.getBairro());
	}
	
	@Then("^the city should be \"(.*)\"$")
	public void the_city_should_be(String arg1) {
		assertEquals(arg1, endereco.getCidade());
	}
	
	@Then("^the province should be \"(.*)\"$")
	public void the_province_should_be(String arg1) {
		assertEquals(arg1, endereco.getEstado());
	}
	
	@When("^my CEP is \"([^\"]*)\"$")
	public void my_CEP_is(String cep) {
		Endereco enderecoMock = new Endereco();
		enderecoMock.setLogradouro("Rua Conde de Iraja");
		enderecoMock.setBairro("Vila Mariana");
		enderecoMock.setCidade("Sao Paulo");
		enderecoMock.setEstado("SP");
		when(mock_dao.getEnderecoEntrega("04119010")).thenReturn(enderecoMock);
		try {
			endereco = correio.getEndereco(cep);
		}catch(Throwable t){
    		throwable = t;
    	}
	}
	
	@Then("^should show an error with the message:$")
	public void should_show_an_error_with_the_message(String message){
		Assertions.assertThat(throwable).isNotNull().hasMessage(message);
	}
}