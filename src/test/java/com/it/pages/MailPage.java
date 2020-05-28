package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MailPage extends BasePage {

    @FindBy(xpath = "//div[@class='field_value']//a")
    private WebElement fromUser;

    protected String from() {
        return fromUser.getText();
    }
}
