package com.thetestingacademy.MiniProjects;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import com.thetestingacademy.resources.PropertiesReader;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class ebayTest {

    @Test
    public void verifyElements() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.ebay.com/");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();


        List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\"vl-flyout-nav\"]/ul/li"));
        for (WebElement link : elements) {

            if(link.getText().equals(PropertiesReader.readKey("category"))){
                System.out.println(link.getText());
                link.click();
                break;

            }

        }
        driver.switchTo().newWindow(WindowType.TAB);
        actions.contextClick().build().perform();
        WaitHelpers.waitJVM(3000);
        driver.navigate().to("https://www.google.com");
driver.quit();

    }
}

