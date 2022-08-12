import framework.ConfigReader;
import framework.DriverSetup;
import framework.Helper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobjects.CartPage;
import pageobjects.HomePage;
import pageobjects.ProductPage;

import static framework.Helper.*;


public class FavoritesTest {

    static WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    String savedWishTitle = "";

    @BeforeClass
    public void setup(){
        driver = DriverSetup.initialize_Driver(ConfigReader.initialize_Properties().get("browser").toString());
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }
/*
    @Test(priority = 1)
    public void checkAddToWishListSuccessfully(){
        savedWishTitle = homePage.addItemToWishList();
    }

    @Test(priority = 2)
    public void checkWishList(){
        homePage.checkWishInFavorList(savedWishTitle);
    }*/

    // wrote a test to check product in the bucket list
    @Test
    public void checkBucketList() {
        // page down code
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,-250)");
        homePage.balloons().click();  // clicking ballons section
        productPage.firstBalloon().click();  // clicking the first balloon
        for (int i = 0; i < 6; i++) {
            productPage.plusButton().click(); // adding same product 5 times
        }
        productPage.addToCard().click(); // clicking the add to card button
        productPage.address().sendKeys("Some address");  // dummy address input
        productPage.addressDesc().sendKeys("Good address");  // dummy address description
        productPage.receiverName().sendKeys("Faruk");  // dummy name
        productPage.receiverPhone().sendKeys("123123123"); // dummy phone number
        clickForWebElement(productPage.addToCardOrder()); // add to card button
        clickForWebElement(productPage.bucketIcon());  // clicking the bucket icon
        productPage.goToBucket().click(); // clicking the go to bucket button
        Assert.assertEquals(cartPage.productName().getText(),"Helium balloon");  // checking product name
    }


}
