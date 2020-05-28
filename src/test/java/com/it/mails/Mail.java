package com.it.mails;

import java.util.Objects;

public class Mail {
    public String to;
    public String subject;
    public String text;

    public Mail(String to, String subject, String text) {
        this.to = to;
        this.subject = subject;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Mail{" +
                  "to='" + to + '\'' +
                  ", subject='" + subject + '\'' +
                  ", text='" + text + '\'' +
                  '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail = (Mail) o;
        return Objects.equals(to, mail.to) &&
                  Objects.equals(subject, mail.subject) &&
                  Objects.equals(text, mail.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, subject, text);
    }
}
