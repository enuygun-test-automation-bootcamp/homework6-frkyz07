package pageobjects;

import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

    WebDriver driver;
    Helper elementHelper;

    // element finders
    By searchInput = By.id("search-input");
    By searchIcon = By.cssSelector("button[type=submit]");
    By wishListIcon = By.cssSelector("a[data-tooltip=\"Add to Wishlist\"]");
    By imageBox = By.cssSelector(".tt-image-box");
    By favorites = By.cssSelector("div[data-tooltip=\"Favorites\"]");
    By titleOfWish = By.xpath("//*/h2[@class='tt-title']");
    By titleOfResWish = By.xpath("//*/h2[@class='tt-title']");

    By balloons = By.xpath("//div[text()='Balloons']");




    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }
    public WebElement searchInput(){
        return driver.findElement(searchInput);
    }
    public WebElement searchIcon(){
        return driver.findElement(searchIcon);
    }
    public WebElement wishListIcon(){
        return driver.findElement(wishListIcon);
    }
    public WebElement imageBox(){
        return driver.findElement(imageBox);
    }
    public WebElement favorites(){
        return driver.findElement(favorites);
    }
    public WebElement titleOfWish(){
        return driver.findElement(titleOfWish);
    }
    public WebElement titleOfResWish(){
        return driver.findElement(titleOfResWish);
    }


    public WebElement balloons(){
        return driver.findElement(balloons);
    }







/*
    This is the code that teacher wrote it i wanna change structure thats why i am commenting out the code
    public String addItemToWishList(){
        this.elementHelper.findElement(searchInput).click();
        this.elementHelper.typeForInput("rose",this.elementHelper.findElement(searchInput));
        this.elementHelper.findElement(searchIcon).click();
        this.elementHelper.hoverMover(this.elementHelper.findElement(imageBox));
        this.elementHelper.findElements(wishListIcon).get(0).click();
        return this.elementHelper.findElements(titleOfResWish).get(0).getText();
    }

    public void checkWishInFavorList(String expectedWish){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-250)");
        // in here there was an assertion problem I fixed
        // before this it was first taking the locator from the home page after adding line on of code
        // it started to taking in the favorites section
        String favoriteText = this.elementHelper.findElement(titleOfWish).getText();
        this.elementHelper.findElement(favorites).click();
        Assert.assertEquals(expectedWish, favoriteText);
    }*/


}
