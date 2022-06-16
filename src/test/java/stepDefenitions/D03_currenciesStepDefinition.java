package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;


public class D03_currenciesStepDefinition {
HomePage homePage = new HomePage();
    @Given("user change to euro")
    public void changeToEuro(){
        WebElement currency = homePage.currencyMenu();
        Select selectEuro = new Select(currency);
        selectEuro.selectByVisibleText("Euro");

    }

    @Then("currencies changed to euro")
    public void currencyChanged(){
       int productNum =  homePage.products().size();

        for (int i = 0; i < productNum; i++) {
            String price =  homePage.products().get(i).getText();
            Assert.assertTrue(price.contains("€"));
        }

    }
}
