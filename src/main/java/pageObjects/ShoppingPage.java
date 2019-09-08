package pageObjects;

import model.PageModel;
import org.openqa.selenium.WebDriver;

public class ShoppingPage {

    private PageModel pageModel = new PageModel();
    private String addToBucketButtonSelector = "body > app-root > rz-main-app > pp-product-page > div > div > div > div >" +
            " pp-tab-all > div.cust-wrap.clearfix > div.cust-content > div:nth-child(1) > pp-price-block > div >" +
            " pp-price-block-label > pp-price-block-label-available > div > div > div.detail-buy-btn-wrap.ng-star-inserted " +
            "> pp-cart-button > rz-cart-button > div > rz-cart-button-simple > div > form > span > span > button";

    private String itemDescriptionButton = "body > app-root > div > div:nth-child(2) > app-rz-main-page > div > main > " +
            "main-page-content > goods-sections > div:nth-child(2) > goods-section > ul > li:nth-child(1) > div > " +
            "a.main-goods__picture";

    public void pressBuyButton(WebDriver driver) {
        System.out.println("Add item to bucket");
        pageModel.clickWithJavasriptExecutor(driver, addToBucketButtonSelector);
    }

    public void pressOnItem(WebDriver driver) {
        System.out.println("Press on item to get description");
        pageModel.clickWithJavasriptExecutor(driver, itemDescriptionButton);
    }
}
