package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefenitions.Hooks;

import java.util.List;

public class SearchResultsPage {

    public List<WebElement> searchResultElement(){
        return Hooks.driver.findElements(By.cssSelector("h2[class = \"product-title\"]"));
    }

    public WebElement skUProduct(){
        return Hooks.driver.findElement(By.className("picture"));
    }
    public WebElement skU(){
        return Hooks.driver.findElement(By.cssSelector("span[id = \"sku-5\"]"));
    }
}
