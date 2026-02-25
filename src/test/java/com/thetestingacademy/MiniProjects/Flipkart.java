package com.thetestingacademy.MiniProjects;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Flipkart {

    @Test
    public void VerifyNokia(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WaitHelpers.checkVisibility(driver,By.className("b3wTlE"));

        driver.findElement(By.className("b3wTlE")).click();

        WebElement search = driver.findElement(By.name("q"));
        //search.sendKeys("mobiles");

        Actions action = new Actions(driver);



        action.moveToElement(search).click().sendKeys("mobile").sendKeys(Keys.ENTER).build().perform();
        System.out.println("here");
        //WebElement button = driver.findElement(By.xpath("//button[@class=\"XFwMiH\" and @type=\"submit\"]"));
       // button.click();
String parent = driver.getWindowHandle();

        List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class=\"RG5Slk\"]"));

        for(WebElement mobile: mobiles){
            System.out.println(mobile.getText());
            if(mobile.getText().contains("POCO")){
                mobile.click();
            }
        }
        Set<String> handles = driver.getWindowHandles();

        driver.switchTo().window(parent);


    }
}
