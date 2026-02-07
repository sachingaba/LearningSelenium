package com.thetestingacademy.MiniProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ebayTest {

    @Test
    public void verifyElements() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\"vl-flyout-nav\"]/ul/li"));
        for (WebElement link : elements) {

            if(link.getText().equals("Electronics")){
                System.out.println(link.getText());
                link.click();
                break;

            }

        }
driver.quit();

    }
}

