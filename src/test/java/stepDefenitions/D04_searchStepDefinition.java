package stepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.SearchResultsPage;

public class D04_searchStepDefinition {
    HomePage homePage = new HomePage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Given("user type {string} in search box")
        public void userSearchWithKeyword(String keyword){
        homePage.searchBox().clear();
        homePage.searchBox().sendKeys(keyword);
    }

    @When("user press on search button")
        public void userPressOnSearchButton(){
        homePage.searchButton().click();
    }

    @Then("user get results match with {string}")
        public void checkResults(String keyword){
        int resultsCount = searchResultsPage.searchResultElement().size();
        System.out.println(keyword);
        for (int i =0; i<resultsCount; i++){
            String resultTitle = searchResultsPage.searchResultElement().get(i).getText().toLowerCase();
            Assert.assertTrue(resultTitle.contains(keyword));

        }

    }

//    Second Scenario "Search with SKU"

    @Given("user type sku on search box")
        public void searchWithSKU(){
        homePage.searchBox().clear();
        homePage.searchBox().sendKeys("AS_551_LP");
    }
    @And("user click on search button")
        public void clickOnSearchButton(){
        homePage.searchButton().click();
    }

    @When("user click on product")
        public void clickOnProduct(){
        searchResultsPage.skUProduct().click();
    }


    @Then("user got product of sku")
        public void checkProductSKU(){
        String actualResult = searchResultsPage.skU().getText();
        String expectedResult = "AS_551_LP";
        Assert.assertEquals(expectedResult, actualResult);
    }
}
