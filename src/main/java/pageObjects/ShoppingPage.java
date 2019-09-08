package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pageElement.Name;
import pageElement.PageElement;

public class ShoppingPage {

    @Name("random staff")
    @FindBy(xpath = "/html/body/app-root/div/div[1]/app-rz-main-page/div/main/main-page-content/goods-sections/div[2]/goods-section/ul/li[1]/div/a[2]ss")
    private PageElement randomStaff;

    @Name(" buy button")
    public void validateBuyButtonIsPresent(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("Perform buy");
        System.out.println( js.executeScript("document.querySelector(\"body > app-root > rz-main-app > pp-product-page > div > div > div > div > pp-tab-all > div.cust-wrap.clearfix > div.cust-content > div:nth-child(1) > pp-price-block > div > pp-price-block-label > pp-price-block-label-available > div > div > div.detail-buy-btn-wrap.ng-star-inserted > pp-cart-button > rz-cart-button > div > rz-cart-button-simple > div > form > span > span > button\") !== null" ) );
    }

    @Name(" buy button")
    public void buyStaff(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("Perform buy");
        js.executeScript("document.querySelector(\"body > app-root > rz-main-app > pp-product-page > div > div > div > div > pp-tab-all > div.cust-wrap.clearfix > div.cust-content > div:nth-child(1) > pp-price-block > div > pp-price-block-label > pp-price-block-label-available > div > div > div.detail-buy-btn-wrap.ng-star-inserted > pp-cart-button > rz-cart-button > div > rz-cart-button-simple > div > form > span > span > button\").click();" );
    }

    public void jsGetTextDescription(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        System.out.println("Perform with js");
        js.executeScript(
                "document.querySelector(\"body > app-root > div > div:nth-child(2) > app-rz-main-page > div > main > main-page-content > goods-sections > div:nth-child(2) > goods-section > ul > li:nth-child(1) > div > a.main-goods__picture\").click()"
        );
    }
}