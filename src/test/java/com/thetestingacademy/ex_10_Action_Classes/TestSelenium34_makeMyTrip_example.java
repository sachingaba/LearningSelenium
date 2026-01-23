package com.thetestingacademy.ex_10_Action_Classes;

import com.thetestingacademy.CommonToALL;
import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium34_makeMyTrip_example extends CommonToALL {

    @Test
    public void verifyMMT(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.makemytrip.com/");

        WebElement close_modal = driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"commonModal__close\"]")));
close_modal.click();

        WebElement ai_modal = driver.findElement(By.xpath("//img[@alt=\"minimize\"]"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"minimize\"]")));
        ai_modal.click();

        WebElement background_click = driver.findElement(By.tagName("body"));
        background_click.click();

        WebElement from_id= driver.findElement(By.id("fromCity"));
        from_id.click();

        WebElement from_inp = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
               Actions actions = new Actions(driver);
        actions.moveToElement(from_inp).click().sendKeys("ixc").build().perform();

      List<  WebElement> from_sugg = driver.findElements(By.xpath("//li[@role=\"option\"]"));
//      for(WebElement city: from_sugg) {
//          System.out.println(city.getText());
//          WaitHelpers.waitJVM(5000);
          // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@role=\"option\"]")));
          //   if(city.getText().contains("Chandigarh, India")){
     //     city.click();
      //}
      //}
      from_sugg.get(1).click();


        WebElement to_inp = driver.findElement(By.xpath("//input[@id=\"toCity\"]"));
        actions
                .moveToElement(to_inp).click().keyDown(Keys.ARROW_DOWN).sendKeys("del")
                .build().perform();

        List<  WebElement> to_sugg = driver.findElements(By.xpath("//li[@role=\"option\"]"));
        to_sugg.get(1).click();

closeBrowser(driver);
    }

}
