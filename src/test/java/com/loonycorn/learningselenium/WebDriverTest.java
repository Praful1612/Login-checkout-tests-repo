package com.loonycorn.learningselenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverTest {

    @Test
    public void navigateToPageUsingChrome() {

        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized");
        //options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://omayo.blogspot.com/");
        delay(5000);
        driver.quit();
    }


    private void delay(long milliseconds){
try
    {
        Thread.sleep(milliseconds);
    }
    catch(
    InterruptedException e)
    {
        throw new RuntimeException(e);
    }
       
}

}