package stepDefenitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import pages.RegisterPage;

public class D01_registerStepDefinition {

    RegisterPage registerPage  = new RegisterPage();



    @Given("user press on register tab")
    public void userOpenRegisterPage() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
    }

    @And("user select gender")
    public void userChooseGender() {
        registerPage.gender().click();
    }


    @And("^user enter \"(.*)\" and \"(.*)\"$")
    public void userEnterFirstLastName(String firstName, String lastName) {
        registerPage.enterFirstLastName(firstName, lastName);
    }

    @And("user press submit")
    public void userSubmitData() {
        Hooks.driver.findElement(By.id("register-button")).click();
    }

    @And("^user choose birthDate \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void userChooseBirthDate(String day, String month, String year) {
        WebElement birthDay = registerPage.birthDay();
        Select selectDay = new Select(birthDay);
        selectDay.selectByIndex(Integer.parseInt(day));

        WebElement birthMonth = registerPage.birthMonth();
        Select selectMonth = new Select(birthMonth);
        selectMonth.selectByVisibleText(month);

        WebElement birthYear = registerPage.birthYear();
        Select selectYear = new Select(birthYear);
        selectYear.selectByValue(year);
    }

    @And("^user enter email and company \"(.*)\" and \"(.*)\"$")
    public void emailAndCompany(String email, String company) {
        registerPage.enterEmailAndCompany(email, company);
    }

    @And("^user enter password and confirm \"(.*)\" and \"(.*)\"$")
    public void passwordAndConfirm(String password, String confirmPassword) {
        registerPage.enterPasswordAndConfirm(password, confirmPassword);
    }

    @Then("user register successfully")
    public void userRegisterSuccessfully() throws InterruptedException {
        Thread.sleep(3000);
        String actualResult = Hooks.driver.getCurrentUrl();
        System.out.println(actualResult);
        String ExpectedResult = "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
        Assert.assertTrue(actualResult.contains(ExpectedResult));

        String actualColor = Color.fromString(registerPage.actualResult().getCssValue("color")).asHex();
        String expectedColor = "#4cb17c";

        String actualText = registerPage.actualResult().getText();
        String expectedText = "Your registration completed";

        Assert.assertEquals(expectedText, actualText);
        Assert.assertEquals(expectedColor, actualColor);

    }
}