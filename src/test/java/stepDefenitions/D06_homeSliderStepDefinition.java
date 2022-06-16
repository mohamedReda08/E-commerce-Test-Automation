package stepDefenitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;


public class D06_homeSliderStepDefinition {
HomePage homePage = new HomePage();
    @Given("slider 1 is displayed")
        public void userPressOnFirstBox(){
        homePage.firstSlider().click();
    }

    @When("user click on first slider")
        public void userPressOnFirstSlider(){
        homePage.activeSlider().click();
    }

    @Then("user navigate to nokia url")
        public void checkFirstURL(){
        String expectedURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualURL = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

    }

//    Second Scenario steps "IPHONE"

    @Given("slider 2 is displayed")
    public void userPressOnSecondBox(){
    homePage.secondSlider().click();
    }

    @When("user click on second slider")
    public void userPressOnSecondSlider(){
        homePage.activeSlider().click();
    }

    @Then("user navigate to iphone url")
    public void checkSecondURL(){
        String expectedURL = "https://demo.nopcommerce.com/iphone";
        String actualURL = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);

    }

}
