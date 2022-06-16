package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefenitions.Hooks;

public class LoginPage {

    public WebElement clickOnLoginTab(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement enterEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enterPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement clickOnLoginButton(){
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public void enterEmailAndPassword(String email, String password){
        enterEmail().sendKeys(email);
        enterPassword().sendKeys(password);
    }

}
