package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class BuyCellPhonePage extends Utils1 {
    LoadProperty1 loadProperty = new LoadProperty1();
    private By _electronics = By.linkText("Electronics");
    private By _cellphone = By.linkText("Cell phones");
    private By _htcphone = By.linkText("HTc One Mini Blue");
    private By _addtocart = By.id("Add to cart");
    private By _shoppingcart = By.linkText("Shopping cart");
    private By _termsofservice = By.id("termsofservice");
    private By _checkout = By.name(("Checkout"));

    public void entercellphonedetails (){

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        clickOnElement(By.linkText("Electronics"));
        clickOnElement(By.linkText("Cell phones"));
        clickOnElement(By.linkText("HTC One Mini Blue"));
        clickOnElement(By.id("add-to-cart-button-19"));
        clickOnElement(By.linkText("shopping cart"));
        clickOnElement(By.id("termsofservice"));
        clickOnElement(By.id("checkout"));
    }

}
