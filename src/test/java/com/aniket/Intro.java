package com.aniket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intro {
     public WebDriver driver;
     @BeforeMethod
     public void SetUp()
     {
    	 WebDriverManager.chromedriver().setup();
    	 driver = new ChromeDriver();
     }
     @Test
     public void OpenUrl()
     {
    	 driver.manage().window().maximize();
    	 driver.get("https://www.facebook.com");
    	 System.out.println("Aniket");
     }
     @AfterMethod
     public void TearDown()
     {
    	 driver.quit();
     }
}
