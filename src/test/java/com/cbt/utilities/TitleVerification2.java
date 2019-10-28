package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {


        ArrayList <String> urls= new ArrayList <> (Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com", "https://westelm.com/"));
        
        WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.get("https://lulugandgeorgia.com");
        String title1=driver.getTitle();
        StringUtility.verifyEquals(title1,driver.getTitle());
        Thread.sleep(500);
        driver.navigate().to("https://wayfair.com/");
        String title2=driver.getTitle();
        StringUtility.verifyEquals(title2,driver.getTitle());
        Thread.sleep(500);
        driver.navigate().to("https://walmart.com");
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title3,driver.getTitle());
        Thread.sleep(500);
        driver.navigate().to("https://westelm.com/");
        String title4=driver.getTitle();
        StringUtility.verifyEquals(title4,driver.getTitle());
        driver.quit();


    }
}
