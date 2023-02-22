package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
    		         "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
           driver.get("https://www.ironspider.ca/forms/dropdowns.htm#example2");
    
           // single dropdown 
           
//           WebElement sd = driver.findElement(By.name("coffee"));
//           Select s = new Select(sd);
//           s.selectByVisibleText("With cream & sugar");
           
           // Multiple dropdown
           
           WebElement cof = driver.findElement(By.name("coffee2"));
           Select ss = new Select(cof);
           ss.isMultiple();
            
//          WebElement d = driver.findElement(By.name("Dairy"));
//          Select s1 = new Select(d);
//		s1.
	}

}
