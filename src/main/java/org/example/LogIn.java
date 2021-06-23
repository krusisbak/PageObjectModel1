package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class LogIn extends Utils1 {
    LoadProperty1 loadProperty = new LoadProperty1();
    private By _waitforlogin = By.linkText("Log in");
    private By _login = By.linkText("Log in");
    private By _emailId = By.id("Email");
    private By _password = By.id("Password");
    private By _loginButton = By.name("login-button");

    public void enterLoginDetails() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        waitForClickable(_waitforlogin,6000);

      // clickOnElement(_login);

        enterText(_emailId, loadProperty.getProperty("emailId") );

        enterText(_password, loadProperty.getProperty("password"));

        clickOnElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        //waitForClickable(_loginButton,6000);
    }
}
