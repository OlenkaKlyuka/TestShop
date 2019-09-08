package Model;

import PageElement.PageDecorator;
import driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class PageModel {
    public WebDriver driver = WebDriverFactory.getDriver();

    public PageModel() {
        PageFactory.initElements(
                new PageDecorator(
                        new DefaultElementLocatorFactory(driver)), this);
    }
}
