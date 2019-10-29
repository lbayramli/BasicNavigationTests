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
        for (int i=0; i<urls.size(); i++){
            driver.get(urls.get(i));
            String URL=driver.getCurrentUrl().toLowerCase();
            String Title=driver.getTitle().toLowerCase().replace(" ", "");

            System.out.println("Actual Title: "+ Title);
            System.out.println("Actual Url: " + URL);
            System.out.println(URL.contains(Title)? "Test Passed": "Test Failed");
        }
        driver.close();





        /*

        driver.get("https://lulugandgeorgia.com");
        String title1=driver.getTitle();
        String currentUrl1=driver.getCurrentUrl();
        //StringUtility.verifyEquals(title1,driver.getTitle());
        Thread.sleep(500);
        driver.navigate().to("https://wayfair.com/");
        String title2=driver.getTitle();
        String currentUrl2=driver.getCurrentUrl();
        Thread.sleep(500);
        driver.navigate().to("https://walmart.com");
        String title3=driver.getTitle();
        String currentUrl3=driver.getCurrentUrl();
      //  StringUtility.verifyEquals(title3,driver.getTitle());
        Thread.sleep(500);
        driver.navigate().to("https://westelm.com/");
        String title4=driver.getTitle();
        String currentUrl4=driver.getCurrentUrl();
        StringUtility.verifyEquals(title1,title2 );
        StringUtility.verifyEquals(title3, title4);
        driver.quit();

*/
    }
}
