package com.cbt.utilities;

import org.openqa.selenium.WebDriver;



import java.util.ArrayList;
import java.util.Arrays;

public class TitleVerification3 {
    public static void main(String[] args) {
        ArrayList<String> urls= new ArrayList <> (Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/",
                "https://walmart.com", "https://westelm.com/"));

        WebDriver driver1 = BrowserFactory.getDriver("chrome");
        driver1.get(urls.get(0));
        String title1 = driver1.getTitle();
        String t1 = title1.toLowerCase().replace(" ","");
        String Url1 = driver1.getCurrentUrl();
        if(Url1.contains(t1)){
            System.out.println("Test1 passed");
        }else{
            System.out.println("Test1 failed");
        }
        driver1.close();

        WebDriver driver2 = BrowserFactory.getDriver("chrome");
        driver2.get(urls.get(1));
        String title2 = driver2.getTitle();
        String t2 = title2.toLowerCase().replace(" ","");
        String Url2 = driver2.getCurrentUrl();
        if(Url2.contains(t2)){
            System.out.println("Test2 passed");
        }else{
            System.out.println("Test2 failed");
        }
        driver2.close();

        WebDriver driver3 = BrowserFactory.getDriver("chrome");
        driver3.get(urls.get(2));
        String title3 = driver3.getTitle();
        String t3= title3.toLowerCase().replace(" ","");
        String Url3 = driver3.getCurrentUrl();
        if(Url3.contains(t3)){
            System.out.println("Test3 passed");
        }else{
            System.out.println("Test3 failed");
        }
        driver3.close();

        WebDriver driver4 = BrowserFactory.getDriver("chrome");
        driver4.get(urls.get(3));
        String title4 = driver4.getTitle();
        String t4=title4.toLowerCase().replace(" ","");
        String Url4 = driver4.getCurrentUrl();
        if(Url4.contains(t4)){
            System.out.println("Test4 passed");
        }else{
            System.out.println("Test4 failed");
        }
        driver4.close();

    }
    /*
    WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://lulugandgeorgia.com");
        String title1=driver.getTitle().toLowerCase().replace(" ","");
        String URL1=driver.getCurrentUrl();
        System.out.println(URL1.contains(title1)? "Test Passed": "Test Failed");
        driver.close();
        driver.get("https://wayfair.com/");
        String title2=driver.getTitle().toLowerCase().replace(" ","");
        String URL2=driver.getCurrentUrl();
        System.out.println(URL2.contains(title2)? "Test Passed": "Test Failed");
        driver.close();
        driver.get("https://walmart.com");
        String title3=driver.getTitle().toLowerCase().replace(" ", "");
        String URL3=driver.getCurrentUrl();
        System.out.println(URL3.contains(title3)? "Test Passed": "Test Failed");
        driver.close();
        driver.get("https://westelm.com/");
        String title4=driver.getTitle();
        String URL4=driver.getCurrentUrl();
        System.out.println(URL4.contains(title4)? "Test Passed": "Test Failed");
        driver.close();
     */
}
