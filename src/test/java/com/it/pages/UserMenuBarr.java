package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserMenuBarr extends BasePage {

    @FindBy(xpath = "//li[contains(*,'Создать')]")
    private WebElement createLetterButton;

    @FindBy(xpath = "//li[contains(*,'Проверить')]")
    private WebElement checkMailButton;

    protected void clickCreateLetter() {
        createLetterButton.click();
    }

    protected void clickCheckMail() {
        checkMailButton.click();
    }
}
