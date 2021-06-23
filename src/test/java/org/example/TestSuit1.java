package org.example;

import org.testng.annotations.Test;

public class TestSuit1 extends BaseTest1{

    HomePage1 homePage = new HomePage1();
    RegisterPage1 registerPage = new RegisterPage1();
    LogIn loginpage = new LogIn();
    BuyCellPhonePage cellPhonespage = new BuyCellPhonePage();

    //ResultVerficationPage resultVerficationPage = new ResultVerficationPage();

    @Test
    public void userShouldBeAbleToRegisterSuccessfully() throws InterruptedException {
        homePage.clickOnRegisterButton();
        registerPage.enterRegisterationDetails();
        //resultVerfication.verifyRegisterMessage();
    }

    @Test
    public void userShouldBeAbleToLoginSuccessfully() {
        homePage.clinkOnLoginButton();
        loginpage.enterLoginDetails();
        }

       @Test
    public void userShouldBeAbleToBuyCellPhoneSuccessfully(){
        homePage.clickOnCellPhonesLink();
        cellPhonespage.entercellphonedetails();

       }
    }


