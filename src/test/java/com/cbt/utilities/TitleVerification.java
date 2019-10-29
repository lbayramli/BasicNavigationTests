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
        String currentUrl=driver.getCurrentUrl();
        Thread.sleep(500);
        driver.navigate().to("http://practice.cybertekschool.com/dropdown");
        String title2 = driver.getTitle();
        String currentUrl2=driver.getCurrentUrl();
        Thread.sleep(500);
        driver.navigate().to("http://practice.cybertekschool.com/login");
        String title3 = driver.getTitle();
        String currentUrl3=driver.getCurrentUrl();
        StringUtility.verifyEquals(title1, title2);
        StringUtility.verifyEquals(title1,title3);
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
