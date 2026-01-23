package com.thetestingacademy.ex_12_Windows;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium38_Windows {

    @Test
    public void verifyHandles(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parentId = driver.getWindowHandle();
        System.out.println(parentId);

        WaitHelpers.waitJVM(5000);

        WebElement clickParent = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickParent.click();

        Set<String> windowHandleIds = driver.getWindowHandles();

        for(String window: windowHandleIds){
            System.out.println(window);
            driver.switchTo().window(window);

            if(driver.getPageSource().contains("New Window")){
                System.out.println("Test Passed");
            }
        }

        driver.switchTo().window(parentId);
        WaitHelpers.waitJVM(5000);

        driver.quit();
    }
}
