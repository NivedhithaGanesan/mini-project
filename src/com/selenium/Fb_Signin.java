package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Signin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");

	      WebDriver driver = new ChromeDriver();
	      //driver.manage().window().maximize();
	      
	      driver.get("https://www.facebook.com/");
	   
	         WebElement email = driver.findElement(By.name("email"));
	         email.click();
	         email.sendKeys("xyz@gmail.com");
	        	         
	         WebElement pass = driver.findElement(By.id("pass"));
	        pass.sendKeys("Ab1234567");
	      	        
	        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	          button.click();
	          Thread.sleep(1000);
	          
	          TakesScreenshot ts= (TakesScreenshot)driver; // Narrow Type Casting coz screenshot memory is bigger than driver so this is done.
	          File src = ts.getScreenshotAs(OutputType.FILE);
	          File des = new File("C:\\Users\\nivim\\eclipse-workspace\\Selenium\\screenshots\\02.png");
	          FileUtils.copyFile(src,des);
	          
	          
	}

}
