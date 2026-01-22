package com.thetestingacademy.ex_08_SVG_Elements;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium31_Svg_Map extends CommonToALL {

    @Test
    public void test_map(){
        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://amcharts.com/svg-maps/?map=india");

       List<WebElement> states = driver.findElements(By.xpath("//*[name()=\"svg\"]/*[name()=\"g\"][7]//*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]"));

       for(WebElement state:states){
           System.out.println(state.getDomAttribute("aria-label"));
           if(state.getDomAttribute("aria-label").contains("Tripura")){
               state.click();
           }
       }
       customWait(5000);
driver.quit();


    }
}
