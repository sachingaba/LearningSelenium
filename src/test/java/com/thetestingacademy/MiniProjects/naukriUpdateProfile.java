package com.thetestingacademy.MiniProjects;

import com.thetestingacademy.ex_07_Wait_Helper.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class naukriUpdateProfile {

    @Test
    public void verifyElements() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.naukri.com/");

        WebElement login = driver.findElement(By.xpath("//a[@id=\"login_Layer\"]"));
        login.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")));

        WebElement username = driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]"));
        username.sendKeys("sachin.gaba07192@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("sachin7192");

        WebElement submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        submit.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href=\"/mnjuser/profile\" and contains(text(),'View')]")));

        WebElement viewProfile = driver.findElement(By.xpath("//a[@href=\"/mnjuser/profile\" and contains(text(),'View')]"));
viewProfile.click();
        WaitHelpers.checkVisibilityByFluentWait(driver,By.xpath("//div[@class=\"dashboard\"]/div/div/div/div[2]/div/div/div[1]/em"));

WebElement editIcon = driver.findElement(By.xpath("//div[@class=\"dashboard\"]/div/div/div/div[2]/div/div/div[1]/em"));
editIcon.click();

//div[@class="dashboard"]/div/div/div/div[2]/div/div/div/span[@class="fullname"]
        WaitHelpers.checkVisibilityByFluentWait(driver,By.xpath("//button[@id=\"saveBasicDetailsBtn\"]"));

        WebElement saveProfile = driver.findElement(By.xpath("//button[@id=\"saveBasicDetailsBtn\"]"));
        saveProfile.click();





        driver.quit();

    }
}
