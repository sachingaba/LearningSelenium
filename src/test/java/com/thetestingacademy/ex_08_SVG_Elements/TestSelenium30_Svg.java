package com.thetestingacademy.ex_08_SVG_Elements;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium30_Svg {

    @Test
    public void Test_svg(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
        searchBox.sendKeys("avvatar Protein");

        List<WebElement> svgs = driver.findElements(By.xpath("//*[local-name()=\"svg\"]"));
        svgs.get(0).click();


        WebElement nextBtn = driver.findElement(By.xpath("//a[@class=\"jgg0SZ\"]"));
        while(nextBtn.isDisplayed()) {
            nextBtn = driver.findElement(By.xpath("//a[.//span[contains(text(), 'Next')]]"));
            List<WebElement> tiles = driver.findElements(By.xpath("//div[contains(@data-id,\"PS\")]"));
            System.out.println("check elements: ----------------------->");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
            int count = 1;

            for (WebElement tile : tiles) {

               // wait.until(ExpectedConditions.visibilityOf(tiles.get(6)));
                System.out.println(tile.getText());
                System.out.println("Tile end"+ count );
                count++;

            }
            if(nextBtn.isEnabled()) {
                nextBtn.click();

                wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.//span[contains(text(), 'Next')]]")));
            }else {
                driver.quit();
            }



        }

       /* WebElement page2 = driver.findElement(By.xpath("//a[@class=\"i2eZXn\" and text()=\"2\"]"));
        System.out.println("----------------------------Page2------------------------------------");
        page2.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        for(WebElement tile:tiles){
            System.out.println(tile.getText());
        }*/
        //driver.quit();
    }
}
