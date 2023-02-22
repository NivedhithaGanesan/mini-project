package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_login {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", 
    		  "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
      
      WebDriver driver =new ChromeDriver();
      
      driver.get("https://www.facebook.com/login/");
      Thread.sleep(1000);
      
      WebElement signup = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
         signup.click();
         
         WebElement name = driver.findElement(By.name("firstname"));
          name.sendKeys("nivedhitha");
          
          WebElement lname = driver.findElement(By.name("lastname"));
         lname.sendKeys("ganesan");
         
         WebElement num = driver.findElement(By.xpath("//input[@name='reg_email__']"));
          num.sendKeys("1234567890");
          
          WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
         pass.sendKeys("anhv@nvjnmk");
                                 //DROPDOWN STARTS//
         WebElement day = driver.findElement(By.id("day"));
          Select d = new Select(day);
          d.selectByValue("5");
           
          WebElement month = driver.findElement(By.id("month"));
           Select m = new Select(month);
           m.selectByVisibleText("Sep");
           
           WebElement year = driver.findElement(By.id("year"));
            Select y = new Select(year);
            y.selectByIndex(22);
                               //RADIO BUTTONS
            
            WebElement f = driver.findElement(By.xpath("//label[text()='Female']"));
             f.click();
            
//            WebElement custom = driver.findElement(By.xpath("//label[text()='Custom']"));
//             custom.click();
//         WebElement nn = driver.findElement(By.name("preferred_pronoun"));        
//             Select n =new Select(nn);
//             n.selectByValue("1");
     
	}

}
