package com.thetestingacademy.MiniProjects.SelectorsHub;

import com.thetestingacademy.CommonToALL;
import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsHub_Practise extends CommonToALL {

    @Test
    public void verifyForm(){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://selectorshub.com/xpath-practice-page/");

        WebElement user_form = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        user_form.sendKeys("Sachingaba@gcm.com");

        WebElement pass_form = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
        pass_form.sendKeys("kdljfh@kd2");

        WebElement company_form = driver.findElement(By.xpath("//input[@name=\"company\"]"));
        company_form.sendKeys("Intercell");

        WebElement mobile_form = driver.findElement(By.xpath("//input[@name=\"mobile number\"]"));
        mobile_form.sendKeys("89297942");

        WebElement country_form = driver.findElement(By.xpath("//label[text()=\"Country\"]/input"));
        country_form.sendKeys("India");

        WebElement submit_form = driver.findElement(By.xpath("//button[@value=\"Submit\"]"));
        //submit_form.click();

      //-----------------------------------------------------------------------------------------------------------------

        JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement user_shad =(WebElement)  js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"input#kils\")");

      user_shad.sendKeys("Hello");

      WebElement pizza_shad = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\")") ;
      pizza_shad.sendKeys("farmhouse");

      WebElement concept_shad = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#concepts\")");
      //concept_shad.click();


        Actions action = new Actions(driver);
        action.sendKeys(Keys.TAB).perform();
        action.sendKeys("DevTools cltr+f ").perform();


       action.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("dummy").build().perform();



       ///-----------------------------------------------------------------------------MODAL

        WebElement modalBtn = driver.findElement(By.xpath("//button[@id=\"myBtn\"]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id=\"myBtn\"]")));
        action.moveToElement(modalBtn).build().perform();
        modalBtn.click();


        WebElement modalContent = driver.findElement(By.xpath("//div[@class=\"modal-content\"]"));

        System.out.println(modalContent.getText());
        Assert.assertTrue(modalContent.getText().contains("Testing Daily - Free App To Get The Latest Testing Feed."));









        closeBrowser(driver);


    }

}
