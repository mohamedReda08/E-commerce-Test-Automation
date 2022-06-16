package stepDefenitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.SubCategoryPage;


public class D05_hoverCategoriesStepDefinition {

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Hooks.driver);
    SubCategoryPage subCategoryPage = new SubCategoryPage();

    @When("user hover on category")
        public  String hoverOnCategory()  {
        WebElement computers =homePage.topMenu();
        actions.moveToElement(computers).perform();
        String subCategoryText =  homePage.subCategoryElement().getText();
        homePage.subCategoryElement().click();
        return subCategoryText;
    }



    @Then("user move to sub-category page")
        public void moveToSubCategoryPage(){
        String currentURL = Hooks.driver.getCurrentUrl();
        String actualPageTitle = subCategoryPage.pageTitle().getText().toLowerCase().trim();
        String expectedResult = hoverOnCategory().toLowerCase();

        Assert.assertTrue(currentURL.contains(expectedResult));
        Assert.assertEquals(expectedResult, actualPageTitle);
    }
}
