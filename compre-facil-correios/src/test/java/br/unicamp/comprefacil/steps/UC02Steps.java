package br.unicamp.comprefacil.steps;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

import org.assertj.core.api.Assertions;

import br.unicamp.comprefacil.model.Endereco;
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

public class UC02Steps {

	private Throwable throwable;
	private CorreiosServices correio;
	private Endereco endereco;

	@Before
	public void setUp() {
		correio = new CorreiosServices();
		throwable = null;
	}

	/**
	 * @MethodName: I_am_looking_for_an_address
	 * @Description: TODO
	 * @author: TODO
	 * @date: 2015-10-10 16:43:06 PM
	 * 
	 */
	@Given("^I am looking for an address$")
	public void I_am_looking_for_an_address() {
		// Write code here that turns the phrase above into concrete actions
		assertNotNull(correio);
	}

	/**
	 * @MethodName: the_result_should_be
	 * @Description: TODO
	 * @author: TODO
	 * @date: 2015-10-10 16:46:58 PM
	 * 
	 */
	
	@Then("^the result should be \"(.*)\"$")
	public void the_result_should_be(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals("Rua Conde de Iraja, Vila Mariana, Sao Paulo, SP",
				endereco.toStringEndereco());
	}

	
	
	@When("^my CEP is \"([^\"]*)\"$")
	public void my_CEP_is(String cep) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// Write code here that turns the phrase above into concrete actions
		try {
			endereco = correio.getEndereco(cep);
		}catch(Throwable t){
    		throwable = t;
    	}
	}
	

	/**
	* @MethodName: should_show_an_error_with_the_message
	* @Description: TODO
	* @author: TODO
	* @date: 2015-10-10 17:23:13 PM
	* 
	*/
	@Then("^should show an error with the message:$")
	public void should_show_an_error_with_the_message(String message){
	// Write code here that turns the phrase above into concrete actions
		Assertions.assertThat(throwable).isNotNull().hasMessage(message);
	}

}