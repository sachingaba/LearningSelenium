package com.thetestingacademy.ex_08_WebTables;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Static_WebTables extends CommonToALL {

    @Test
    public void staticTable(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/webtable.html");

        //xpath = //table[@id="customers"]/tbody/tr[2]/td[3]

        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        System.out.println(col);
        for (int i = 2; i <= row; i++) {

            for (int j = 1; j <= col; j++) {
                //System.out.println("xpath: " + first_part+i+second_part+j+third_part);
                String xpathtable = first_part+i+second_part+j+third_part;
                WebElement tableData = driver.findElement(By.xpath(xpathtable));
                String data = tableData.getText();
             //   System.out.print(tableData.getText() + "-");
                if(data.contains("Maria")){
                    String countryPath = xpathtable+"/following::td";
                    WebElement countrydata = driver.findElement(By.xpath(countryPath));
                    System.out.println(countrydata.getText());
                }

            }
            System.out.println(" ");

        }
driver.quit();
    }

}
