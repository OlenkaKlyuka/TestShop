package pageObjects;

import model.PageModel;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage {

    private PageModel pageModel = new PageModel();

    public void signOut(WebDriver driver) {
        String signOutSelector = "#profile_signout";
        pageModel.clickWithJavasriptExecutor(driver, signOutSelector);
    }
}
