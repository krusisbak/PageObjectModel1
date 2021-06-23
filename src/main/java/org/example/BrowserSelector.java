package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage1{

    LoadProperty1 loadProperty = new LoadProperty1();

    String browserName =loadProperty.getProperty("browser");

    public void openBrowser(){

        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","D:\\Software\\PageModel1Test\\src\\test\\resources\\Browserdriver\\chromedriver.exe");

            // initialing the object
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","D:\\Software\\PageModel1Test\\src\\test\\resources\\Browserdriver\\msedgedriver.exe");

            // initialing the object
            driver = new EdgeDriver();
        }else
        {
            System.out.println("In correct browser name or empty...:"+browserName);
        }



        // maximize the browser window
        driver.manage().window().maximize();
        // applying implicit wait to driver object
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}



