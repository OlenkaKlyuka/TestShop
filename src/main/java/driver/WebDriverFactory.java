package driver;

import helper.PropertyProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class WebDriverFactory {

    private static Map<Long, WebDriver> drivers = new HashMap<>();

    static {
        PropertyProvider property = new PropertyProvider();
        System.setProperty(property.getDriver(), property.getPath());
    }

    public static WebDriver getDriver() {
        Long currentThread = Thread.currentThread().getId();

        if (!drivers.containsKey(currentThread)) {
            WebDriver driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            drivers.put(currentThread, driver);
            return driver;
        }
        return drivers.get(currentThread);
    }

    public static void killDrivers() {
        drivers.values().forEach(WebDriver::quit);
    }
}