package pageObjects;

import Model.PageModel;
import PageElement.*;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends PageModel {

    @Name("login")
    @FindBy(xpath = "//body/div/div/div/div/div/form/div/input[@name=\"login\"]")
    private PageElement loginElement;

    @Name("password")
    @FindBy(xpath = "//body/div/div/div/div/div/form/div/input[@name=\"password\"]")
    private PageElement passwordElement;

    @Name("submit")
    @FindBy(xpath = "//body/div/div/div/div/div/form/div/button[@type=\"submit\"]")
    private PageElement loginSubmitButton;

    @Name("invalids password")
    @FindBy(xpath = "//div[@name=\"app-message\"]/div/a/img")
    private PageElement wrongPasswordMessage;

    @Name(" enter login")
    public void enterLogin(String login) {
        loginElement.sendKeys(login);
    }

    @Name(" enter pass")
    public void enterPassword(String password) {
        passwordElement.sendKeys(password);
    }

    @Name(" press submit")
    public void pressSubmitLogin() {
        loginSubmitButton.click();
    }

    public void validateLogin() {
        Assert.assertFalse(wrongPasswordMessage.exists());
    }
}