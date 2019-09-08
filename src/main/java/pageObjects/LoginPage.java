package pageObjects;

import model.PageModel;
import pageElement.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends PageModel {

    private String loginInputField = "#signin_form > div:nth-child(1) > input";
    private String passwordInpitField = "#signin_form > div:nth-child(2) > input";
    private String submitButton = "#signin_form > div.signup-submit > button > span";
    private PageModel pageModel = new PageModel();

    public void enterLogin(String login) {
        System.out.println("Input login");
        pageModel.sendKeysWithJavasriptExecutor(driver, loginInputField, login);
    }

    public void enterPassword(String password) {
        System.out.println("Input password");
        pageModel.sendKeysWithJavasriptExecutor(driver, passwordInpitField, password);
    }

    public void pressSubmitLogin() {
        System.out.println("Submit user credentials");
        pageModel.clickWithJavasriptExecutor(driver, submitButton);
    }
}