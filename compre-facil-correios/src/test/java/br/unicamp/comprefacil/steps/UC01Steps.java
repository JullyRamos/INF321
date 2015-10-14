package br.unicamp.comprefacil.steps;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.assertj.core.api.Assertions;

import br.unicamp.comprefacil.model.Endereco;
import br.unicamp.comprefacil.model.Frete;
import br.unicamp.comprefacil.model.Pedido;
import br.unicamp.comprefacil.services.CorreiosServices;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @ClassName: UC02Steps
 * @Description: TODO
 * @author: TODO
 * @date: 2015-10-10 16:43:57 PM
 * 
 */

public class UC01Steps {

	private Throwable throwable;
	private CorreiosServices correio;
	private Pedido pedido;
	private Frete frete;

	@Before
	public void setUp() {
		correio = new CorreiosServices();
		pedido = new Pedido();
		throwable = null;
	}

	/**
	* @MethodName: product_weight_is__g
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:37:15 PM
	* 
	*/
	@Given("^product weight is (\\d+) g$")
	public void product_weight_is__g(int param1){
	// Write code here that turns the phrase above into concrete actions
		pedido.setPeso(param1);

	}

	/**
	* @MethodName: product_width_is__cm
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:37:23 PM
	* 
	*/
	@Given("^product width is (\\d+) cm$")
	public void product_width_is__cm(int param1){
	// Write code here that turns the phrase above into concrete actions
		pedido.setLargura(param1);
	}

	/**
	* @MethodName: product_height_is__cm
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:37:44 PM
	* 
	*/
	@Given("^product height is (\\d+) cm$")
	public void product_height_is__cm(int param1){
	// Write code here that turns the phrase above into concrete actions
		pedido.setAltura(param1);
	}

	/**
	* @MethodName: product_length_is__cm
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:38:10 PM
	* 
	*/
	@Given("^product length is (\\d+) cm$")
	public void product_length_is__cm(int param1){
	// Write code here that turns the phrase above into concrete actions
		pedido.setComprimento(param1);
	}
	
	/**
	* @MethodName: shipping_type_is
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:37:53 PM
	* 
	*/
	@Given("^shipping type is \"(.*)\"$")
	public void shipping_type_is(String arg1){
	// Write code here that turns the phrase above into concrete actions
		pedido.setTipoEntrega(arg1);
	}

	/**
	* @MethodName: zipcode_is
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:38:30 PM
	* 
	*/
	@Given("^zipcode is \"(.*)\"$")
	public void zipcode_is(String arg1){
	// Write code here that turns the phrase above into concrete actions
		pedido.setCep(arg1);
	}


	/**
	* @MethodName: correio_is
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 17:00:35 PM
	* 
	*/
	@Given("^correio is \"(.*)\"$")
	public void correio_is(String arg1){
	// Write code here that turns the phrase above into concrete actions
		if(arg1.equalsIgnoreCase("on"))
			correio.setOn(true);
		else
			correio.setOn(false);
	}
	
	/**
	* @MethodName: I_ask_to_calculate_shipping
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:38:35 PM
	* 
	*/
	@When("^I ask to calculate shipping$")
	public void I_ask_to_calculate_shipping(){
	// Write code here that turns the phrase above into concrete actions
		try {
			frete = correio.calculaFrete(pedido.getPeso(), pedido.getLargura(), pedido.getAltura(), pedido.getComprimento(), pedido.getTipoEntrega(), pedido.getCep());
		}catch(Throwable t){
    		throwable = t;
    	}
	}
	/**
	* @MethodName: CorreioServices_should_return_an_error_with_the_message
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 16:54:26 PM
	* 
	*/
	@Then("^CorreioServices should return an error with the message:$")
	public void CorreioServices_should_return_an_error_with_the_message(String arg1){
	// Write code here that turns the phrase above into concrete actions
		Assertions.assertThat(throwable).isNotNull().hasMessage(arg1);
	}

	/**
	* @MethodName: the_shipping_cost_should_be__valor
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 17:08:13 PM
	* 
	*/
	@Then("^the shipping cost should be (\\d+)$")
	public void the_shipping_cost_should_be__valor(int param1){
	// Write code here that turns the phrase above into concrete actions
		assertEquals(new BigDecimal(param1), frete.getValor());
	}

	/**
	* @MethodName: shipping_time_should_be__tempoEntrega
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-13 17:08:18 PM
	* 
	*/
	@Then("^shipping time should be (\\d+)$")
	public void shipping_time_should_be__tempoEntrega(int param1){
	// Write code here that turns the phrase above into concrete actions
		assertEquals(param1, frete.getTempoEntrega());
	}

}