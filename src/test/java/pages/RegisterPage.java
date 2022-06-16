package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefenitions.Hooks;

public class RegisterPage {

    public WebElement gender (){
        return Hooks.driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastName(){
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay (){
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement birthMonth(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement company(){
        return Hooks.driver.findElement(By.id("Company"));
    }

    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword (){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    public void enterFirstLastName(String firstName, String lastName){
        firstName().sendKeys(firstName);
        lastName().sendKeys(lastName);
    }

    public void enterEmailAndCompany(String email, String company){
        email().sendKeys(email);
        company().sendKeys(company);
    }

    public void enterPasswordAndConfirm(String password, String confirmPassword ){
        password().sendKeys(password);
        confirmPassword().sendKeys(confirmPassword);
    }


    public WebElement actualResult(){
        return Hooks.driver.findElement(By.className("result"));
    }
}
