package pageobjects;

import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductPage {
    WebDriver driver;
    Helper elementHelper;
    By firstBalloon = By.xpath("//div[@id='products']//div[@class='col-6 col-md-4 tt-col-item'][1]");
    By plusButton = By.className("plus-btn");
    By addToCard = By.id("addToCart");
    By address = By.name("address");
    By addressDesc = By.name("address_description");
    By receiverName = By.name("receiver_name");
    By receiverPhone = By.name("receiver_phone");
    By addToCardOrder = By.xpath("//div/button[@class='btn add-to-cart']");
    By bucketIcon = By.xpath("//div/button/i[@class='icon-f-39 search-icon']");
    By goToBucket = By.className("btn-link-02 tt-hidden-mobile");


    public ProductPage(WebDriver driver)
    {
        this.driver= driver;
        this.elementHelper=new Helper(driver);
    }
    public WebElement firstBalloon(){
        return driver.findElement(firstBalloon);
    }
    public WebElement plusButton(){
        return driver.findElement(plusButton);
    }
    public WebElement addToCard(){
        return driver.findElement(addToCard);
    }
    public WebElement address(){
        return driver.findElement(address);
    }
    public WebElement addressDesc(){
        return driver.findElement(addressDesc);
    }
    public WebElement receiverName(){
        return driver.findElement(receiverName);
    }
    public WebElement receiverPhone(){
        return driver.findElement(receiverPhone);
    }
    public WebElement addToCardOrder(){
        return driver.findElement(addToCardOrder);
    }
    public WebElement bucketIcon(){
        return driver.findElement(bucketIcon);
    }
    public WebElement goToBucket(){
        return driver.findElement(goToBucket);
    }
}
