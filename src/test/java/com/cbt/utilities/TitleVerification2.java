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
        String actualtitle1=driver.getTitle();
        String expectedtitle1=driver.getTitle();
        StringUtility.verifyEquals(actualtitle1,expectedtitle1);
        Thread.sleep(500);
        driver.navigate().to("https://wayfair.com/");
        String actualtitle2=driver.getTitle();
        String expectedtitle2=driver.getTitle();
        StringUtility.verifyEquals(actualtitle2,expectedtitle2);
        Thread.sleep(500);
        driver.navigate().to("https://walmart.com");
        String actualtitle3=driver.getTitle();
        String expectedtitle3=driver.getTitle();
        StringUtility.verifyEquals(actualtitle3,expectedtitle3);
        Thread.sleep(500);
        driver.navigate().to("https://westelm.com/");
        String actualtitle4=driver.getTitle();
        String expectedtitle4=driver.getTitle();
        StringUtility.verifyEquals(actualtitle4,expectedtitle4);
        driver.quit();


    }
}
