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
        String title1=driver.getTitle();
        StringUtility.verifyEquals(title1,driver.getTitle());
        driver.quit();
        driver.get("https://wayfair.com/");
        String title2=driver.getTitle();
        StringUtility.verifyEquals(title2,driver.getTitle());
        driver.quit();
        driver.get("https://walmart.com");
        String title3=driver.getTitle();
        StringUtility.verifyEquals(title3,driver.getTitle());
        driver.quit();
        driver.get("https://westelm.com/");
        String title4=driver.getTitle();
        StringUtility.verifyEquals(title4,driver.getTitle());
        driver.quit();
    }
}
