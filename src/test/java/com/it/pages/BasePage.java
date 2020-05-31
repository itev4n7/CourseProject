package com.it.pages;

import com.it.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected static MyDriver driver = MyDriver.getDriver();
    protected static final Logger LOGGER = Logger.getLogger(BasePage.class);

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
