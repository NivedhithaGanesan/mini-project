package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", 
	       		 "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
 
 WebDriver driver = new ChromeDriver();	
     driver.get("https://demo.automationtesting.in/Frames.html");
                              // THIS METHOD IS USED TO GET NO. OF FRAMES PRESENT IN THE FRAME.
     
//   int size = driver.findElements(By.tagName("iframe")).size();
//    System.out.println(size);  
 
     
     WebElement outter = driver.findElement(By.id("singleframe"));
     driver.switchTo().frame(outter);
     
        WebElement box = driver.findElement(By.xpath("//input[@type='text']"));
        box.sendKeys("NIVEDHITHA");

        Thread.sleep(3000);
   
         driver.switchTo().defaultContent(); 
         Thread.sleep(4000);
    
      WebElement aa = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
       aa.click();
      
     WebElement oo = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
      driver.switchTo().frame(oo);
         
     WebElement bb = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
       driver.switchTo().frame(bb);
       
      WebElement fill = driver.findElement(By.xpath("//input[@type='text']"));
      fill.sendKeys("HELLO");
       
	}

}
