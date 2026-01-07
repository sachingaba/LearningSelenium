package com.thetestingacademy;

import org.openqa.selenium.WebDriver;

public class CommonToALL {

    public void openBrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();

    }
    public void closeBrowser(WebDriver driver){

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.quit();
    }
}
