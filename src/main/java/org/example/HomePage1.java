package org.example;

import org.openqa.selenium.By;

public class HomePage1 extends Utils1{
    LoadProperty1 loadProperty = new LoadProperty1();
    private By _waitOnRegister = By.linkText("Register");
    private By _clickOnRegister = By.linkText("Register");
    private By _waitOnLogin = By.linkText("Log in");
    private By _clickOnLogin = By.linkText("Log in");
    private By _clickOnElectronics = By.linkText("Electronics");




    public void clickOnRegisterButton()
    {
        // to wait before clicking on Register
        waitForClickable(_waitOnRegister,6000);

        //click on Register button
        clickOnElement(_clickOnRegister);
    }

    public void clinkOnLoginButton(){
        waitForClickable(_waitOnLogin, 6000);
        clickOnElement(_clickOnLogin);
    }

    public void clickOnCellPhonesLink(){
        clickOnElement(_clickOnElectronics);
    }
}
