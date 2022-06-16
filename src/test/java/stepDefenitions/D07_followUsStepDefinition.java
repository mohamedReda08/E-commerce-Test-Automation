package stepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class D07_followUsStepDefinition {

    HomePage homePage = new HomePage();
//    FB
    @Given("user click on fb icon")
        public void clickOnFbIcon(){
        homePage.fbIcon().click();
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    }

    @Then("navigate to facebook page")
        public void openFbPage(){

        String expectedUrl = "https://web.facebook.com/nopCommerce?_rdc=1&_rdr";
        assertURL(expectedUrl);
    }
//    Twitter
    @Given("user click on twitter icon")
        public void clickOnTwitterIcon(){
        homePage.twitterIcon().click();
    }

    @Then("navigate to twitter page")
        public void openTwitterPage(){
        String expectedUrl = "https://twitter.com/nopCommerce";
        assertURL(expectedUrl);
    }
//RSS

    @Given("user click on rss icon")
        public void clickOnRssIcon(){
        homePage.rssIcon().click();
    }

    @Then("navigate to rss page")
        public void openRssPage(){
        String expectedUrl = "https://demo.nopcommerce.com/new-online-store-is-open";
        assertURL(expectedUrl);
    }

//    Youtube

    @Given("user click on youtube icon")
    public void clickOnYoutubeIcon(){
        homePage.youtubeIcon().click();
    }

    @Then("navigate to youtube page")
    public void openYoutubePage(){
        String expectedUrl = "http://www.youtube.com/user/nopCommerce";
        assertURL(expectedUrl);
    }

    public void assertURL(String expectedURL){
        Hooks.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        String actualURL =  Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(0));
    }
}
