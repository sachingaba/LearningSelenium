package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium36_Drag_Drop extends CommonToALL {

    @Test
    public void verifyMMT() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/drag_and_drop");

        WebElement from = driver.findElement(By.xpath("//div[@id=\"column-a\"]"));
        WebElement to = driver.findElement(By.xpath("//div[@id=\"column-b\"]"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(from,to).build().perform();

        closeBrowser(driver);


    }

}
