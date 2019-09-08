import model.UserModel;
import businessObjects.LogOutBO;
import businessObjects.LoginBO;
import dataProvider.UserData;
import dataProvider.UserUnmarshal;
import driver.WebDriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static helper.Constants.PATH_TO_USERS;

public class TestUserLoginAndLogout {

    @DataProvider(parallel = false)
    public Object[][] getUsersData() {
        return new UserUnmarshal().createObjectsUserData(PATH_TO_USERS)
                .stream().map(i -> new Object[]{i})
                .toArray(Object[][]::new);
    }

    @Test(dataProvider = "getUsersData")
    public void testSignIn(UserData user) {
        System.out.println("\n\nDo login with login: " + user.getLogin() + " password: " + user.getPassword());
        LoginBO loginPage = new LoginBO();
        loginPage.login(new UserModel(user.getLogin(), user.getPassword()));
    }

    @Test
    public void testSignOut() {
        LogOutBO logOutBO = new LogOutBO();
        logOutBO.logOut();
    }

    @AfterClass
    public void tearDown() {
        WebDriverFactory.killDrivers();
    }
}
