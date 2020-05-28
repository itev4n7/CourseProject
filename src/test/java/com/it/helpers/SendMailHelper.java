package com.it.helpers;

import com.it.mails.Mail;
import com.it.pages.SendMailPage;

public class SendMailHelper extends SendMailPage {
    public void sendMail(String to, String subject, String text) {
        fillTo(to);
        fillSubject(subject);
        fillText(text);
        clickSend();
    }

    public void sendMail(Mail mail) {
        fillTo(mail.to);
        fillSubject(mail.subject);
        fillText(mail.text);
        clickSend();
    }
}
