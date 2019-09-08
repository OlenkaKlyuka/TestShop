package model;

import org.openqa.selenium.JavascriptExecutor;
import driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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

    public void checkTextWithJavasriptExecutor(WebDriver driver, String selector, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("check text with JS Executor");
        String actualText = js.executeScript("return document.querySelector('" + selector + "').innerHTML").toString();
        Assert.assertEquals(text, actualText);
    }

}