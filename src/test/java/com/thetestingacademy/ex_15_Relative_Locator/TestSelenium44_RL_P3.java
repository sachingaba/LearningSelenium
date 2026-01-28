package com.thetestingacademy.ex_15_Relative_Locator;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

import static com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers.waitJVM;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class TestSelenium44_RL_P3 {
    @Test
    public void verifyAqi() {
        ChromeOptions options = new ChromeOptions();


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aqi.in/real-time-most-polluted-city-ranking");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
        searchBox.sendKeys("India" + Keys.ENTER);
        waitJVM(5000);
        List<WebElement> locations = driver.findElements(By.xpath("//div[contains(@class,\"location-name\")]/p"));

        for (WebElement loca : locations) {
            //     System.out.println(loca.getText());

            String rank = driver.findElement(with(By.tagName("p")).toLeftOf(loca)).getText();
            String aqi = driver.findElement(with(By.tagName("span")).toRightOf(loca)).getText();
            if (rank.equals("7.")) {
                System.out.println(rank + " |" + loca.getText() + "|" + aqi);

            }
        }
            waitJVM(5000);
            driver.quit();


        }
    }

