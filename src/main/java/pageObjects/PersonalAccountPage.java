package pageObjects;

import pageElement.Name;
import pageElement.PageElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PersonalAccountPage {

    @Name("user menu")
    @FindBy(xpath = "//header[@role=\"banner\"]//div[@id=\"user_menu\"]/span/a[@name=\"profile\"]")
    private PageElement userMenu;

    @Name("personalInfo")
    @FindBy(xpath = "//div[@id=\"personal_information\"]")
    private PageElement personalInformationSection;

    @Name(" go to user menu")
    public void goToUserMenu() {
        userMenu.click();
    }

    @Name(" sign out")
    public void signOut(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("Perform log out");
        js.executeScript("document.querySelector('#profile_signout').click();" );
        //signOutButton.click();
    }
}
