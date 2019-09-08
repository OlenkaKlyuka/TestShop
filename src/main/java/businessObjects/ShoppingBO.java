package businessObjects;

import driver.WebDriverFactory;
import helper.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.InvalidElementStateException;
import pageObjects.ShoppingPage;

import static helper.Constants.PATH_TO_SHOP_PAGE;

public class ShoppingBO {
    public void doShopping() {

        WebDriver driver = WebDriverFactory.getDriver();
        Waiter waiter = new Waiter();
        driver.get(PATH_TO_SHOP_PAGE);

        ShoppingPage shoppingPage = new ShoppingPage();
        waiter.waitForProduct(driver);
        shoppingPage.pressOnItem(driver);
        waiter.waitForIt(driver);
        shoppingPage.pressBuyButton(driver);
        waiter.waitForIt(driver);

        try {
            shoppingPage.pressBuyButton(driver);
            throw new InvalidElementStateException("Product was not previously added to bucket");
        } catch (org.openqa.selenium.WebDriverException e) {
            System.out.println("Button is not present");
        }
    }
}