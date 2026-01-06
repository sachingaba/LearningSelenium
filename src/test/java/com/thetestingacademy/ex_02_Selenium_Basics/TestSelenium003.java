package com.thetestingacademy.ex_02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium003 {
    public static void main(String[] args) {
        FirefoxDriver f1 =new FirefoxDriver();
// start of the session
        //fresh copy of browser will open or started
        //Post request to the server - firefox driver


        f1.get("https://sdet.live");
    }

}
