package stepDefenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import java.time.Duration;

public class D08_wishlistStepDefinition {
    HomePage homePage = new HomePage();

    @When("user add product to wishlist")
        public void addProductToWishlist(){
        homePage.productWishlistButton().click();
    }

    @Then("wishlist success notification is displayed")
        public void notificationCheck(){
        SoftAssertions softAssert = new SoftAssertions();
        String actualMessage = homePage.notification().getText();

        String expectedMessage = "The product has been added to your";

        String actualBackgroundColor = Color.fromString(homePage.notification().getCssValue("background-color")).asHex();
        String expectedBackgroundColor = "#4bb07a";
        softAssert.assertThat(homePage.notification().isDisplayed());

        softAssert.assertThat(actualMessage.contains(expectedMessage));
        softAssert.assertThat(actualBackgroundColor.equals(expectedBackgroundColor));

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(homePage.notification()));

        softAssert.assertThat(homePage.wishListItem().isDisplayed());
        homePage.wishListItem().click();

        String actualURL = Hooks.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/wishlist";

        softAssert.assertThat(actualURL.equals(expectedURL));
        softAssert.assertAll();

    }


}
