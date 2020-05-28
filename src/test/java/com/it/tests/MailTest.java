package com.it.tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MailTest extends BaseTest {

    @Test
    public void testMail() {
        app.login.login(validUser);
        app.menuBarr.goToSendMail();
        app.sendMail.sendLetter(validMail);
        app.menuBarr.goToCheckMail();
        app.checkMail.openNewMail();
        assertEquals(app.mail.mailFrom(), validMail.to);
    }
}
