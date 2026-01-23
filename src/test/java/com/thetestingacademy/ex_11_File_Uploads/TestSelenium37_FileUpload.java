package com.thetestingacademy.ex_11_File_Uploads;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium37_FileUpload extends CommonToALL {

    @Test
    public void fileUpload (){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/selenium/upload.html");

        WebElement file = driver.findElement(By.id("fileToUpload"));
       //Creating path for file
        String user_dir = System.getProperty("user.dir");
        System.out.println(user_dir);
        String path = user_dir+"/src/test/java/com/thetestingacademy/ex_11_File_Uploads/textupload";

       //send path to webElement with file name
        file.sendKeys(path);

       WebElement submit = driver.findElement(By.name("submit"));
       submit.click();


   closeBrowser(driver);



    }

}
