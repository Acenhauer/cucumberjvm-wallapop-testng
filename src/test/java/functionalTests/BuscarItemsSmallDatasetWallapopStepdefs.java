package functionalTests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

@CucumberOptions(format = "pretty", features = "src/test/resources/BuscarItemsSmallDatasetWallapop.feature")
public class BuscarItemsSmallDatasetWallapopStepdefs extends BaseCucumberTest {

    @Given("^dada la pagina inicial de Wallapop para dataset$")
    public void dada_la_pagina_inicial_de_Wallapop_para_dataset() throws Throwable {
    }

    @When("^busca un \"([^\"]*)\"$")
    public void busca_un(String search) throws Throwable {
        driver.findElement(By.id("main-search-input")).clear();
        driver.findElement(By.id("main-search-input")).sendKeys(search);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ico-search_normal.search-glass")).click();
        Thread.sleep(2000);
    }

    @Then("^me sale un pagina de resultados de buscado con el resultado \"([^\"]*)\"$")
    public void me_sale_un_pagina_de_resultados_de_buscado_con_el_resultado(String search) throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("(.//*[@class='product-info-title'])[1]")).getText().toLowerCase().contains(search));
    }
}
