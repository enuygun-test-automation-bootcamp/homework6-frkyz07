package pageobjects;

import framework.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver driver;
    Helper elementHelper;

    By productName = By.xpath("//*/a[text()='Helium balloon']");

    public CartPage(WebDriver driver)
    {
        this.driver=driver;
        this.elementHelper=new Helper(driver);
    }
    public WebElement productName(){
        return driver.findElement(productName);
    }



}
