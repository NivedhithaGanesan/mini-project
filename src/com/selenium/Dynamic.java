package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {
	
   public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
	 
	    WebDriver driver = new ChromeDriver();
	               driver.get("https://www.myntra.com/women-kurtas-kurtis-suits");
	               
  List<WebElement> product = driver.findElements(By.xpath("(//span[@class='product-strike']//preceding::span[@class='product-discountedPrice'])[1]"));

	  for (WebElement prices : product) {
		String text = prices.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
