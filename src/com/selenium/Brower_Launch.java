package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brower_Launch {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", 
	            	"C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
 
                 WebDriver launch = new ChromeDriver(); // WebDriver refname = new ChromeDriver();
  
      launch.manage().window().maximize(); // refname.manage().window().maximize(); for maximize the window screen.
      
            launch.get("https://www.google.com/"); // refname.get("url");
 
 
	}

}
