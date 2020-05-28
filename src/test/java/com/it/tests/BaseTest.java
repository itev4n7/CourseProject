package com.it.tests;

import com.it.App;
import com.it.mails.Mail;
import com.it.mails.MailFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected App app = new App();
    protected User validUser = UserFactory.getValidUser();
    protected Mail validMail = MailFactory.getValidMail();

    @BeforeSuite
    public void beforeSuite() {

    }

    @AfterSuite
    public void afterSuite() {
        app.common.appStop();
    }
}
