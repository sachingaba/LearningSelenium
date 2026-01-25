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
//------------------------------------------------------Normal Form-----

        WebElement user_form = driver.findElement(By.xpath("//input[@name=\"email\"]"));
        WebElement pass_form = driver.findElement(By.xpath("//input[@id=\"pass\"]"));

        WebElement company_form = driver.findElement(By.xpath("//input[@name=\"company\"]"));
        WebElement mobile_form = driver.findElement(By.xpath("//input[@name=\"mobile number\"]"));
        WebElement country_form = driver.findElement(By.xpath("//label[text()=\"Country\"]/input"));
        WebElement submit_form = driver.findElement(By.xpath("//button[text()='Submit']"));

        //Search Icon: document.querySelector("div#userName").shadowRoot.querySelector("svg")

        user_form.sendKeys("Sachingaba@gcm.com");

        pass_form.sendKeys("kdljfh@kd2");

        company_form.sendKeys("Intercell");

        mobile_form.sendKeys("89297942");

        country_form.sendKeys("India");
        JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,900)");
        System.out.println("Scroll done");
        //submit_form.click();

      //------------------------------------------------------------------------------------------Shadow DOM--------------------


      WebElement user_shad =(WebElement)  js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"input#kils\")");

        WebElement pizza_shad = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#app2\").shadowRoot.querySelector(\"input#pizza\")") ;

        WebElement concept_shad = (WebElement) js.executeScript("return document.querySelector(\"div#userName\").shadowRoot.querySelector(\"div#concepts\")");

        user_shad.sendKeys("Hello");

       pizza_shad.sendKeys("farmhouse");

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

        WebElement close_modal = driver.findElement(By.tagName("body"));
        close_modal.click();

        /// ----------------------------------------------------------------------payment form

        WebElement payment_form = driver.findElement(By.xpath("//div[@data-id=\"c723110\"]"));

        WebElement payment_Name = driver.findElement(By.xpath("//input[@id=\"cardName\"]"));
        payment_Name.sendKeys("Sachin Gaba");

        WebElement card = driver.findElement(By.id("cardNumber"));
        card.sendKeys("5465456456465456");

        WebElement expiry = driver.findElement(By.id("expiry"));
        expiry.sendKeys("0222");

        WebElement cvv = driver.findElement(By.id("cvv"));
        cvv.sendKeys("546");

        WebElement submitPay = driver.findElement(By.xpath("//button[contains(text(),\"Pay\")]"));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),\"Pay\")]")));
        action.moveToElement(submitPay).build().perform();
        submitPay.click();
Assert.assertEquals(driver.getCurrentUrl(),"https://selectorshub.com/xpath-practice-page/?");

        closeBrowser(driver);


    }

}
