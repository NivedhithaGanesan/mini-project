package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_lascript_executor {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", 
		          "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,9000), ");
		js.executeScript("window.scrollby(0,-9000), ");
		
		WebElement dyh = driver.findElement(By.xpath("//h2[text()='Discover your home']"));
		
		js.executeScript("arguments[0].scrollintoview();", dyh);
		
		
	}

}
