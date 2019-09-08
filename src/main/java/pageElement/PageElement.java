package pageElement;

import org.openqa.selenium.*;

import java.util.List;

public class PageElement implements WebElement {

    private WebElement webElement;
    private String name;

    PageElement(WebElement webElement) {
        this.webElement = webElement;
    }

    @Override
    public void click() {
        System.out.println("Do " + name);
        webElement.click();
    }

    @Override
    public void submit() {
        System.out.println("Submit " + name);
        webElement.submit();
    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        System.out.println("Write " + name);
        webElement.sendKeys(charSequences);
    }

    @Override
    public void clear() {
        System.out.println("Clear " + name);
        webElement.clear();
    }

    @Override
    public String getTagName() {
        return webElement.getTagName();
    }

    @Override
    public String getAttribute(String s) {
        return webElement.getAttribute(s);
    }

    @Override
    public boolean isSelected() {
        System.out.println("Select " + name);
        return webElement.isSelected();
    }

    @Override
    public boolean isEnabled() {
        return webElement.isEnabled();
    }

    @Override
    public String getText() {
        return webElement.getText();
    }

    @Override
    public List<WebElement> findElements(By by) {
        System.out.println("Select " + name);
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        System.out.println("Element " + name);
        return new PageElement(webElement.findElement(by));
    }

    @Override
    public boolean isDisplayed() {
        return webElement.isDisplayed();
    }

    @Override
    public Point getLocation() {
        return webElement.getLocation();
    }

    @Override
    public Dimension getSize() {
        return webElement.getSize();
    }

    @Override
    public Rectangle getRect() {
        return webElement.getRect();
    }

    @Override
    public String getCssValue(String s) {
        return webElement.getCssValue(s);
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return webElement.getScreenshotAs(outputType);
    }

    public boolean exists() {
        System.out.println("Check for " + name);
        try {
            String innerHTML = webElement.getAttribute("innerHTML");
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    void setName(String name) {
        this.name = name;
    }

    public boolean check() {
        return this.exists();
    }
}