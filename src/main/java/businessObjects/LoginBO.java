package businessObjects;

import model.UserModel;
import driver.WebDriverFactory;
import helper.Waiter;
import org.openqa.selenium.WebDriver;
import pageObjects.LoginPage;

public class LoginBO {

    public void login(UserModel user) {

        WebDriver driver = WebDriverFactory.getDriver();
        Waiter waiter = new Waiter();

        LoginPage loginPage = new LoginPage();
        driver.get(user.getUrl());
        loginPage.enterLogin(user.getLogin());
        loginPage.enterPassword(user.getPassword());
        loginPage.pressSubmitLogin();
        loginPage.validateLogin();
        waiter.waitForPersonalAccountPage(driver);
    }
}