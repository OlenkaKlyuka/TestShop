package businessObjects;

import driver.WebDriverFactory;
import helper.Waiter;
import org.openqa.selenium.WebDriver;
import pageObjects.ShoppingPage;

import static helper.Constants.PATH_TO_SHOP_PAGE;

public class ShoppingBO {
    public void doShopping() {

        WebDriver driver = WebDriverFactory.getDriver();
        Waiter waiter = new Waiter();
        driver.get(PATH_TO_SHOP_PAGE);

        ShoppingPage shoppingPage = new ShoppingPage();
        waiter.waitForProduct(driver);
        shoppingPage.jsGetTextDescription(driver);
        waiter.waitForIt(driver);
        //System.out.println("TRY: " + shoppingPage.getStaffDescription(driver));
        shoppingPage.buyStaff(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            shoppingPage.buyStaff(driver);
            System.out.println("Button is present");
        } catch (org.openqa.selenium.WebDriverException e) {
            e.printStackTrace();
            System.out.println("Button is not present");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}