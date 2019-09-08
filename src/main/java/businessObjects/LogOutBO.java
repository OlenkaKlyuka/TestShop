package businessObjects;

import driver.WebDriverFactory;
import helper.Waiter;
import org.openqa.selenium.WebDriver;
import pageObjects.PersonalAccountPage;

public class LogOutBO {

    private WebDriver driver = WebDriverFactory.getDriver();
    private Waiter waiter = new Waiter();
    private PersonalAccountPage accountPage = new PersonalAccountPage();

    public void logOut() {
        waiter.waitForIt(driver);
        accountPage.signOut(driver);
    }
}
