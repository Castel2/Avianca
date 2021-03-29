package com.Aviana.test.Avianca.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

import org.openqa.selenium.WebDriver;

import com.Aviana.test.Avianca.app.Calculator;
import com.Aviana.test.Avianca.page.Comprar;

public class MathsStepDefinitions {

    int a = 0;
    int b = 0;
    int total = 0;

    Comprar comprar;
    private WebDriver driver;

    Calculator calculator = new Calculator();

    @Given("se quiere comprar un vuelo")
    public void given() {
    	comprar = new Comprar(driver);
    	driver = comprar.ConnectionChrome();
    	comprar.web("https://www.avianca.com/");
    }


    @When("cuando se diligencia el formulario")
    public void when() {
    	comprar.diligenciar();
    }

    @Then("aparecen los vuelos relacionados")
    public void then() {
    }

}
