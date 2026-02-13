package com.thetestingacademy.ex_13_JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium40_js_ex {

    @Test
    public void verifyJS_ex(){

        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         driver.navigate().to("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
    //    js.executeScript("alert(8)");

        js.executeScript("window.location='https://www.intercellworld.com/home'");
        js.executeScript("window.scroll(0,document.body.scrollHeight);");

     String url =   js.executeScript("return document.URL;").toString();
       String title =  js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);

    }


}
