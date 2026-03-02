package com.thetestingacademy.MiniProjects;

import com.thetestingacademy.CommonToALL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Dynamic_WebTables extends CommonToALL {

    @Test
    public void DynamicTable() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/webtable1.html");

            WebElement table = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/thead"));

        List<WebElement> rows_table = table.findElements(By.tagName("tr"));

        for (int i = 0; i < rows_table.size(); i++) {
            List<WebElement> col_table = rows_table.get(i).findElements(By.tagName("th"));
            for(WebElement col:col_table){
                System.out.print(col.getText()+ " | ");
            }

        }
        WebElement table_body = driver.findElement(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody"));

        List<WebElement> rowsBody_table = table_body.findElements(By.tagName("tr"));
        System.out.println("\n");
        for (WebElement webElement : rowsBody_table) {
            List<WebElement> col_table = webElement.findElements(By.tagName("td"));
            for (WebElement col : col_table) {
                System.out.print(col.getText() + " | ");
            }
            System.out.println("\n");

        }
driver.quit();
    }
}
