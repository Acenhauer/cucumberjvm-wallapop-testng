package functionalTests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionalTests.pages.home.HomePage;
import functionalTests.pages.results.ResultsPage;
import org.junit.Assert;
import org.openqa.selenium.By;

@CucumberOptions(format = "pretty", features = "src/test/resources/BuscarItemWallapop.feature")
public class BuscarItemWallapopStepdefs extends BaseCucumberTest {

    HomePage homePage = new HomePage(driver);
    ResultsPage resultsPage = new ResultsPage(driver);

    @Given("^dada la pagina inicial de Wallapop$")
    public void dada_la_pagina_inicial_de_Wallapop() throws Throwable {
        Assert.assertTrue(homePage.checkIfLogoIsPresent());
    }

    @When("^busca un Apple Trackpad$")
    public void busca_un_Apple_Trackpad() throws Throwable {
        homePage.inputTextToSearch("Apple Trackpad");
        Thread.sleep(2000);
        homePage.clickOnSearchButton();
        Thread.sleep(2000);
    }

    @Then("^me sale un pagina de resultados de buscado con el resultado Apple Trackpad$")
    public void me_sale_un_pagina_de_resultados_de_buscado_con_el_resultado_Apple_Trackpad() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='product-info-title'])[1]")).getText().toLowerCase().contains("trackpad"));
    }
}
