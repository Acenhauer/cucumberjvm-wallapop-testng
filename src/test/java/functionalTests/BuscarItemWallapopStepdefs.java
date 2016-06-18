package functionalTests;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

@CucumberOptions(format = "pretty", features = "src/test/resources/BuscarItemWallapop.feature")
public class BuscarItemWallapopStepdefs extends BaseCucumberTest {


    @Given("^dada la pagina inicial de Wallapop$")
    public void dada_la_pagina_inicial_de_Wallapop() throws Throwable {
    }

    @When("^busca un Apple Trackpad$")
    public void busca_un_Apple_Trackpad() throws Throwable {
        driver.findElement(By.id("main-search-input")).sendKeys("Apple Trackpad");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ico-search_normal.search-glass")).click();
        Thread.sleep(2000);
    }

    @Then("^me sale un pagina de resultados de buscado con el resultado Apple Trackpad$")
    public void me_sale_un_pagina_de_resultados_de_buscado_con_el_resultado_Apple_Trackpad() throws Throwable {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div[2]/div/a[1]")).getText().toLowerCase().contains("trackpad"));
        Assert.assertTrue(driver.findElement(By.xpath("html/body/div[2]/div/div[4]/div[2]/div/a[1]")).getText().toLowerCase().contains("apple"));
    }
}
