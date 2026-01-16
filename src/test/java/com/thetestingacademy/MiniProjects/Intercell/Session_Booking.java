package com.thetestingacademy.MiniProjects.Intercell;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Session_Booking extends CommonToALL {

    @Test
    public void createSession(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://test.intercellworld.com/");

        //Email
        WebElement email_Input_Box = driver.findElement(By.xpath("//*[@id=\"myAnchor\"]/div/div[1]/div/div[2]/form/div/div[1]/input"));
        email_Input_Box.sendKeys("iamsachingaba@gmail.com");
        // Password
        WebElement password_Input_Box = driver.findElement(By.xpath("//*[@id=\"show_hide_password\"]/input"));
        password_Input_Box.sendKeys("intercell@123");
        //Click Sign-In
        WebElement clickSignIn = driver.findElement(By.id("confim_login"));
        clickSignIn.click();
customWait(3000);
        //Speak to a Mentor
        WebElement book_level1 = driver.findElement(By.xpath("//a[@href=\"/account/book-session\"]"));
        book_level1.click();

        customWait(3000);

        WebElement book_level2 = driver.findElement(By.xpath("//*[@id=\"step1\"]/div/div[2]/div/div[9]/div/div[2]/div/div/button"));
        book_level2.click();

        customWait(3000);

        WebElement dropSpec = driver.findElement(By.xpath("//span[text()=\"Choose Specialization in Entrepreneur\"]"));
        dropSpec.click();

       //WebElement selectSpec = driver.findElement(By.xpath("//*[@id=\"Grid\"]/div[1]/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div/text()"));
        WebElement selectSpec = driver.findElement(By.xpath("//div[text()=\"Select All\"]"));
        selectSpec.click();

        WebElement saveSelect = driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]"));
        saveSelect.click();

    }
}
