package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium35_PageUp_Down extends CommonToALL {


    @Test
    public void testUpDownKey() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();

        closeBrowser(driver);
    }

}