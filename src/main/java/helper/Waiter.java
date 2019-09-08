package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.NoSuchElementException;
import java.util.function.Function;

import static helper.Constants.DEFAULT_TIME_OUT;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Waiter {

    public void waitForPersonalAccountPage(WebDriver driver) {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(10, SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.className("profile-m-edit-signout"));
            }
        });
    }

    public void waitForProduct(WebDriver driver) {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(30, SECONDS)
                .pollingEvery(10, SECONDS)
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-rz-main-page/div/main/main-page-content/goods-sections/div[2]/goods-section/ul/li[1]/div/a[2]"));
            }
        });
    }

    public void waitForIt(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(DEFAULT_TIME_OUT, SECONDS);
    }
}

