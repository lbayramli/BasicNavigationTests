package com.cbt.utilities;

import org.openqa.selenium.WebDriver;



import java.util.ArrayList;
import java.util.Arrays;

public class TitleVerification3 {
    public static void main(String[] args) {
        ArrayList<String> urls= new ArrayList <> (Arrays.asList("https://lulugandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com", "https://westelm.com/"));

        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://lulugandgeorgia.com");
        String Actualtitle1=driver.getTitle();
        String expectedTitle1=driver.getTitle();
        StringUtility.verifyEquals(Actualtitle1,expectedTitle1);
        driver.quit();
        driver.get("https://wayfair.com/");
        String ActualTitle2=driver.getTitle();
        String expectedTitle2=driver.getTitle();
        StringUtility.verifyEquals(ActualTitle2,expectedTitle2);
        driver.quit();
        driver.get("https://walmart.com");
        String ActualTitle3=driver.getTitle();
        String expectedTitle3=driver.getTitle();
        StringUtility.verifyEquals(ActualTitle3,expectedTitle3);
        driver.quit();
        driver.get("https://westelm.com/");
        String ActualTitle4=driver.getTitle();
        String expectedTitle4=driver.getTitle();
        StringUtility.verifyEquals(ActualTitle4,expectedTitle4);
        driver.quit();
    }
}
/*
WebDriver driver=BrowserFactory.getDriver("chrome");
        driver.navigate().to("https://lulugandgeorgia.com");
        String Actualtitle1=driver.getTitle();
        String expectedTitle1=driver.getTitle();
        StringUtility.verifyEquals(Actualtitle1,expectedTitle1);
        driver.close();
      //  Thread.sleep(500);

        driver.navigate.to("https://wayfair.com/");
        String ActualTitle2=driver.getTitle();
        String expectedTitle2=driver.getTitle();
        StringUtility.verifyEquals(ActualTitle2,expectedTitle2);
        driver.close();
      //  Thread.sleep(500);
        chromeDriver.get("https://walmart.com");
        String ActualTitle3=driver.getTitle();
        String expectedTitle3=driver.getTitle();
        StringUtility.verifyEquals(ActualTitle3,expectedTitle3);
        driver.close();
     //   Thread.sleep(500);
       driver.navigate.to("https://westelm.com/");
        String ActualTitle4=driver.getTitle();
        String expectedTitle4=driver.getTitle();
        StringUtility.verifyEquals(ActualTitle4,expectedTitle4);
        driver.close();
 */