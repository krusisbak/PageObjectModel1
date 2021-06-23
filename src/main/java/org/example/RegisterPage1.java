package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class RegisterPage1 extends Utils1{

    LoadProperty1 loadProperty = new LoadProperty1();
    private By _register = By.linkText("Register");
    private By _gender = By.id("gender-male");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirth = By.name("DateOfBirthDay");
    private By _monthOfBirth = By.name("DateOfBirthMonth");
    private By _yearOfBirth = By.name("DateOfBirthYear");
    private By _emailId = By.id("Email");
    private By _companyName = By.id("Company");
    private By _newsletter = By.id("Newsletter");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.name("register-button");

    public void enterRegisterationDetails() {

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        waitForClickable(_register, 6000);
        //select gender
        clickOnElement(By.xpath("//*[@id=\"gender-male\"]"));
        // type first name
        enterText(_firstName, loadProperty.getProperty("firstname"));
        // type last name
        enterText(_lastName, loadProperty.getProperty("lastname"));
        // select date of birth
        selectFromDropDownByValue(_dateOfBirth, loadProperty.getProperty("dateofbirth"));
        // select month of birth
        selectFromDropdownByVisibleText(_monthOfBirth, loadProperty.getProperty("monthofbirth"));
        // select year of birth
        selectFromDropDownByValue(_yearOfBirth, loadProperty.getProperty("yearofbirth"));
        // type email id
        enterText(_emailId, loadProperty.getProperty("emailId") );
        // type company name
        enterText(_companyName, loadProperty.getProperty("companyName"));
        // click on the checkbox of Newsletter
        clickOnElement(By.xpath("//*[@id=\"Newsletter\"]"));
        // type password
        enterText(_password, loadProperty.getProperty("password"));
        // retype password
        enterText(_confirmPassword, loadProperty.getProperty("confirmpassword"));
        // click on Register Button
        clickOnElement(By.name("register-button"));
    }

}
