package com.it.driver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.BASE_WAIT;

public class MyDriver implements WebDriver {
    private static MyDriver myDriver;
    private final WebDriver driver;
    public WebDriverWait wait;

    private MyDriver() {
        driver = DriverFactory.getDriver();
        wait = new WebDriverWait(driver, BASE_WAIT);
    }

    public static MyDriver getDriver() {
        if (myDriver == null) {
            myDriver = new MyDriver();
        }
        return myDriver;
    }

    public boolean isElementPresent(By locator) {
        boolean result = false;
        driver.manage().timeouts().
                  implicitlyWait(0, TimeUnit.SECONDS);
        try {
            List<WebElement> list = driver.findElements(locator);
            driver.manage().timeouts().
                      implicitlyWait(BASE_WAIT, TimeUnit.SECONDS);
            result = list.size() != 0 && list.get(0).isDisplayed();
        } catch (StaleElementReferenceException | NoSuchElementException ignore) {
        }
        return result;
    }

    public void scrollUp() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
    }

    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }
}
