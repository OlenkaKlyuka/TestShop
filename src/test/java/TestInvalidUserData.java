import model.UserModel;
import businessObjects.LoginBO;
import dataProvider.UserData;
import dataProvider.UserUnmarshal;
import driver.WebDriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.InvalidElementStateException;

import static helper.Constants.PATH_TO_INVALID_USERS;

public class TestInvalidUserData {

    @DataProvider(parallel = true)
    public Object[][] getInvalidUsersData() {
        return new UserUnmarshal().createObjectsUserData(PATH_TO_INVALID_USERS)
                .stream().map(i -> new Object[]{i})
                .toArray(Object[][]::new);
    }

    @Test(dataProvider = "getInvalidUsersData")
    public void testSignInFailed(UserData user) {
        System.out.println("\n\nDo login with " + user.getLogin() + "   " + user.getPassword());
        LoginBO loginPage = new LoginBO();
        try {
            loginPage.login(new UserModel(user.getLogin(), user.getPassword()));
            throw new InvalidElementStateException();
        } catch (org.openqa.selenium.TimeoutException e) {
            System.out.println("Incorrect password failed. Login is not performed.");
        }
    }

    @AfterClass
    public void tearDown() {
        WebDriverFactory.killDrivers();
    }
}
