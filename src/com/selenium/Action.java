package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Throwable {
             System.setProperty("webdriver.chrome.driver", 
            		 "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             driver.get("https://www.amazon.in/");
             
//             driver.switchTo().frame(0);
//             WebElement drag = driver.findElement(By.id("draggable"));
//             WebElement drop = driver.findElement(By.id("droppable"));
//             
//             Actions act =  new Actions(driver); 
//             act.dragAndDrop(drag, drop)build().perform();
             
             Actions a = new Actions(driver);
             WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
             a.contextClick(mob).build().perform();
             
             
              Robot rob = new Robot();
              rob.keyPress(KeyEvent.VK_DOWN);
              rob.keyRelease(KeyEvent.VK_DOWN);
              
              rob.keyPress(KeyEvent.VK_ENTER);
              rob.keyRelease(KeyEvent.VK_ENTER);
             
	}
	

} 