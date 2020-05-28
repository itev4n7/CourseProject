package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckMailPage extends BasePage {

    @FindBy(xpath = "//div[@class='row new']")
    private WebElement unreadForm;

    protected void openMail() {
        unreadForm.click();
    }
}
