package stepDefenitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LoginPage;

public class D02_loginStepDefinition {

LoginPage loginPage = new LoginPage();

    @Given("Click on login tab")
        public void clickOnlLoginTab(){
      loginPage.clickOnLoginTab().click();
    }

    @And("^Enter valid Email & Password \"(.*)\" and \"(.*)\"$")
    public void EnterValidEmailAndPassword(String email, String password){
        loginPage.enterEmailAndPassword(email, password);

    }
    @And("Click on login button")
        public void clickOnLoginButton(){
        loginPage.clickOnLoginButton().click();
    }

    @Then("User Logged in successfully")
     public void userLoggedIn(){
        String actualURL = Hooks.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/";

        Assert.assertTrue(actualURL.equalsIgnoreCase(expectedURL));




    }

}
