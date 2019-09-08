package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static helper.Constants.DEFAULT_TIME_OUT;

public class Waiter {

    public void waitForPersonalAccountPage(WebDriver driver) {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(10, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("profile-m-edit-signout"));
            }
        });
    }

    public void waitForIt(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIME_OUT, TimeUnit.SECONDS);
    }
}

