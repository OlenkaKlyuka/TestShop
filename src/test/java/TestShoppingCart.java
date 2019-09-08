
import businessObjects.ShoppingBO;
import driver.WebDriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class TestShoppingCart {

    @Test
    public void testSignIn() {
        System.out.println("Perform shopping");
        ShoppingBO shoppingPage = new ShoppingBO();
        shoppingPage.doShopping();
    }


    @AfterClass
    public void tearDown() {
        WebDriverFactory.killDrivers();
    }
}
