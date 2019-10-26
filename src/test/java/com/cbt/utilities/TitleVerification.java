package com.cbt.utilities;


import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.Arrays;


public class TitleVerification {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> urls = new ArrayList<>(Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login"));


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        String title1 = driver.getTitle();
        StringUtility.verifyEquals(title1, driver.getTitle());
        Thread.sleep(500);
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        StringUtility.verifyEquals(title2, driver.getTitle());
        Thread.sleep(500);
        driver.navigate().to("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        StringUtility.verifyEquals(title3, driver.getTitle());
        Thread.sleep(500);


String check= Arrays.toString(urls.toArray());

if(check.startsWith("http://practice.cybertekschool.com")){
    System.out.println("Passed");
}else{
    System.out.println("Failed");
}

   driver.quit();





    }


}
