import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by joao on 10/10/2015.
 */
public class UC01_CalcularFrete {


    @Given("^the product weighs <peso> g$")
    public void the_product_weighs_peso_g() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^product is <largura> cm$")
    public void product_is_largura_cm() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^shipping type is <tipoEntrega>$")
    public void shipping_type_is_tipoEntrega() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^zipcode is <cep>$")
    public void zipcode_is_cep() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I ask to calculate the shipping$")
    public void I_ask_to_calculate_the_shipping() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^the shipping cost should be <valor>$")
    public void the_shipping_cost_should_be_valor() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^shipping time should be <tempoEntrega>$")
    public void shipping_time_should_be_tempoEntrega() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Given("^the product weighs (\\d+) g$")
    public void the_product_weighs_g(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^product width is (\\d+) cm$")
    public void product_width_is_cm(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^product height is (\\d+) cm$")
    public void product_height_is_cm(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^product length is (\\d+) cm$")
    public void product_length_is_cm(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^shipping type is PAC$")
    public void shipping_type_is_PAC() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^zipcode is (\\d+)dasi(\\d+)s$")
    public void zipcode_is_dasi_s(int arg1, int arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^the shipping cost should be -(\\d+)$")
    public void the_shipping_cost_should_be_(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^shipping time should be -(\\d+)$")
    public void shipping_time_should_be_(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^zipcode is (\\d+)$")
    public void zipcode_is(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
