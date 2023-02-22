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

public class Insta_Login {


	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver", 
       		 "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();	
		 
		 	 
    	 driver.get("https://www.instagram.com/");
        Thread.sleep(5000);
		 
        WebElement  userid= driver.findElement(By.name("username"));
        userid.click();
        userid.sendKeys("098765432");         
        WebElement pass = driver.findElement(By.name("password"));
        pass.click();
        pass.sendKeys("hi@!jklmop");         
        WebElement login = driver.findElement(By.xpath("//button[@ type='submit']"));
        login.click();     
        
        WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
       forgot.click();
       Thread.sleep(3000);
       
       WebElement create = driver.findElement(By.xpath("//a[text()='Create new account']")); 
       create.click();
       Thread.sleep(2000);  
       
       WebElement newid = driver.findElement(By.name("emailOrPhone"));
       newid.click();
       newid.sendKeys("123456789");
       WebElement newname = driver.findElement(By.name("fullName"));
       newname.sendKeys("nivi");
       WebElement newusername = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
       newusername.sendKeys("nivedhitha");       
       WebElement newpass = driver.findElement(By.name("password"));
       newpass.sendKeys("hsayugdjK@jh");       
       WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
       log.click();        
       Thread.sleep(2000);

       
//     TakesScreenshot s = (TakesScreenshot)driver; // narrow type casting
//       File src = s.getScreenshotAs(OutputType.FILE);
//            File dest = new File ("C:\\Users\\nivim\\eclipse-workspace\\Selenium\\screenshots\\01.png");
//           FileUtils.copyFile(src, dest);
       
         
	}

}
