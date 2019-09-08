package model;

import org.openqa.selenium.JavascriptExecutor;
import driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class PageModel {
    public WebDriver driver = WebDriverFactory.getDriver();

    public void clickWithJavasriptExecutor(WebDriver driver, String selector) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("click with JS Executor");
        js.executeScript("document.querySelector('" + selector + "').click();");
    }

    public void sendKeysWithJavasriptExecutor(WebDriver driver, String selector, String value) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("click with JS Executor");
        js.executeScript("document.querySelector('" + selector + "').value='" + value + "';");
    }
}