package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 extends Utils1{

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void openBrowser(){
        //open the browser
        browserSelector.openBrowser();

        // open url
        driver.get("https://demo.nopcommerce.com/");

    }
    @AfterMethod
    public void closeBrowser(){

        //close the browser
        driver.quit();
    }
}
