package com.thetestingacademy.MiniProjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Random;

public class BookingDotCom {

    @Test
    public void getPricesHotel(ITestContext context) throws IOException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.booking.com/searchresults.html?ss=Ahmedabad%2C+Gujarat%2C+India&ssne=Man%C4%81li&ssne_untouched=Man%C4%81li&label=gen173nr-10CAEoggI46AdIM1gEaGyIAQGYATO4ARfIAQzYAQPoAQH4AQGIAgGoAgG4AunIrcwGwAIB0gIkN2Y4M2IxMzAtMWZiNi00ZWMyLWJiZWItZjQxZWM4MWQwZWM52AIB4AIB&aid=304142&lang=en-us&sb=1&src_elem=sb&src=index&dest_id=-2088270&dest_type=city&ac_position=0&ac_click_type=b&ac_langcode=en&ac_suggestion_list_length=5&search_selected=true&search_pageview_id=947b77b4b61901b5&ac_meta=GhA5NDdiNzdiNGI2MTkwMWI1IAAoATICZW46A2FobUAASgBQAA%3D%3D&checkin=2026-02-10&checkout=2026-02-11&group_adults=2&no_rooms=1&group_children=0");
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Random random = new Random(100);
        String path = ".screenshot/Screenshot_failed_" + random.nextInt(50) + "_Test.png";
        FileUtils.copyFile(srcFile, new File(path));
       WebElement hotel= driver.findElement(By.xpath("//div[@role=\"list\"]/div[@role=\"listitem\"][3]/div/div[2]/div/div[2]/div[2]/div/div/div[2]"));
        System.out.println(hotel.getText());
        List<WebElement> hotels = driver.findElements(By.xpath("//div[@data-testid=\"availability-rate-information\"]"));
        int records = hotels.size();
        System.out.println("Second Way: ");
        System.out.println(hotels.get(2).getText());


driver.quit();
    }
}
