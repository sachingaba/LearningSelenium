package com.thetestingacademy.MiniProjects;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import com.thetestingacademy.resources.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

public class ebayTest2 {

    @Test
    public void verifyElements() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();

       WebElement search = driver.findElement(By.id("gh-ac"));
       search.sendKeys("Hello");
        actions.moveToElement(search).click();

        WaitHelpers.checkVisibility(driver,By.xpath("//ul[@id=\"ebay-autocomplete\"]"));

        List<WebElement> elements = driver.findElements(By.xpath("//ul[@id=\"ebay-autocomplete\"]/li"));
        elements.get(5).click();
        for (WebElement link : elements) {
            if (link.getText().contains("Hello Kitty")) {
                System.out.println(link.getText());
                link.click();
                break;

            }
        }


driver.quit();

    }
}

