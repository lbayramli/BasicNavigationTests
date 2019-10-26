package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.WebDriver;


public class NavigationTests {

    public static void main(String[] args) {
test("chrome");
test("safari");
test("firefox");
    }

public static void test(String browser){

        WebDriver driver= BrowserFactory.getDriver(browser);
        driver.get("http://google.com");
        String title=driver.getTitle();
        driver.navigate().to("http://etsy.com");
        String title2=driver.getTitle();
        driver.navigate().back();
        StringUtility.verifyEquals(title, driver.getTitle());
        driver.navigate().forward();
        StringUtility.verifyEquals(title2, driver.getTitle());
        driver.close();



}





}
