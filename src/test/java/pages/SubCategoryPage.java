package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefenitions.Hooks;

public class SubCategoryPage {

    public WebElement pageTitle(){
        return Hooks.driver.findElement(By.className("page-title"));
    }
}
