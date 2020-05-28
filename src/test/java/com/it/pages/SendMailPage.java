package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SendMailPage extends BasePage {

    @FindBy(xpath = "//*[@id='to']")
    private WebElement sendTo;

    @FindBy(xpath = "//span/input[@type='text']")
    private WebElement subject;

    @FindBy(xpath = "//*[@id='text']")
    private WebElement text;

    @FindBy(xpath = "//input[@tabindex='12']")
    private WebElement sendButton;

    protected void fillTo(String sendTo) {
        this.sendTo.sendKeys(sendTo);
    }

    protected void fillSubject(String subject) {
        this.subject.sendKeys(subject);
    }

    protected void fillText(String text) {
        this.text.sendKeys(text);
    }

    protected void clickSend() {
        sendButton.click();
    }
}
