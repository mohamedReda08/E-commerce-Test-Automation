package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefenitions.Hooks;

import java.util.List;

public class HomePage {

    public WebElement currencyMenu(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> products(){
        return Hooks.driver.findElements(By.cssSelector("span[class = \"price actual price\"]"));
    }

    public WebElement searchBox(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton(){
        return  Hooks.driver.findElement(By.className("search-box-button"));
    }



    public WebElement topMenu(){

        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
    }

    public  WebElement subCategoryElement(){

        return  Hooks.driver.findElement(By.cssSelector(" ul[class =\"sublist first-level\"] li  a[href=\"/desktops\"]"));
    }
//Home Slider Functions
    public WebElement firstSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[rel = \"0\"]"));
    }


    public WebElement secondSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[rel = \"1\"]"));
    }

    public WebElement activeSlider(){
        return Hooks.driver.findElement(By.id("nivo-slider"));
    }

// Social icons

    public WebElement fbIcon(){
        return Hooks.driver.findElement(By.className("facebook"));
    }
    public WebElement twitterIcon(){
        return Hooks.driver.findElement(By.className("twitter"));
    }
    public WebElement rssIcon(){
        return Hooks.driver.findElement(By.className("rss"));
    }
    public WebElement youtubeIcon(){
        return Hooks.driver.findElement(By.cssSelector("li[class = \"youtube\"] a"));
    }

//    Wishlist Elements

    public WebElement productWishlistButton(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }
    public WebElement notification(){
        return Hooks.driver.findElement(By.className("bar-notification"));
    }

    public WebElement wishListItem(){
        return Hooks.driver.findElement(By.className("ico-wishlist"));
    }
}
