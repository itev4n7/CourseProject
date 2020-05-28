package com.it.mails;

import java.util.ResourceBundle;

public class MailFactory {
    private static ResourceBundle mail = ResourceBundle.getBundle("mail");

    public static Mail getValidMail() {
        return new Mail(mail.getString("to"),
                  mail.getString("subject"),
                  mail.getString("text"));
    }
}
