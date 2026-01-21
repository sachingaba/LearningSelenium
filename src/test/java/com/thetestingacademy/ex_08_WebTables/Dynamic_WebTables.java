package com.thetestingacademy.ex_08_WebTables;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Dynamic_WebTables extends CommonToALL {

    @Test
    public void staticTable() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/webtable1.html");

        WebElement table = driver.findElement(By.xpath("//table[@summary=\"Sample Table\"]/tbody"));
        List<WebElement> rows_table = table.findElements(By.tagName("tr"));

        for (int i = 0; i < rows_table.size(); i++) {
            List<WebElement> col_table = rows_table.get(i).findElements(By.tagName("td"));
            for(WebElement col:col_table){
                System.out.println(col.getText());
            }

        }

    }
}
