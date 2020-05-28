package com.it;

import com.it.helpers.*;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public CheckMailHelper checkMail;
    public SendMailHelper sendMail;
    public UserMenuHelper menuBarr;
    public MailHelper mail;

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        checkMail = new CheckMailHelper();
        sendMail = new SendMailHelper();
        menuBarr = new UserMenuHelper();
        mail = new MailHelper();
    }
}
