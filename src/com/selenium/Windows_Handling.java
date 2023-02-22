package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
	       		 "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");

              WebDriver driver = new ChromeDriver();	
            driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            
            Actions act = new Actions(driver);
             WebElement mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
            act.contextClick(mob).build().perform();
            Robot r = new Robot();
             r.keyPress(KeyEvent.VK_DOWN);
             r.keyRelease(KeyEvent.VK_DOWN);
             r.keyPress(KeyEvent.VK_ENTER);
             r.keyRelease(KeyEvent.VK_ENTER);
             Thread.sleep(3000);

             
             WebElement bs = driver.findElement(By.xpath("//a[text()='Best Sellers']"));
            act.contextClick(bs).build().perform();
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);

            
             WebElement b = driver.findElement(By.xpath("//a[text()='Books']"));
            act.contextClick(b).build().perform();
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
            r.keyPress(KeyEvent.VK_ENTER);
            r.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(3000);

            
                        //***this is used to get the parent window id***
            String windowHandle = driver.getWindowHandle();
            System.out.println(windowHandle);
            
            Set<String> wh = driver.getWindowHandles();
            for (String abc : wh) {
				String title = driver.switchTo().window(abc).getTitle();
				System.out.println(title);
			}
            Thread.sleep(5000);

            Set<String> ww = driver.getWindowHandles();

            for (String string : ww) {
				String url = driver.switchTo().window(string).getCurrentUrl();
				System.out.println(url);
			}
            Thread.sleep(3000);

            String st = "https://www.amazon.in/Books/b/?ie=UTF8&node=976389031&ref_=nav_cs_books";
            		
            for (String str: ww) {
				if (driver.switchTo().window(str).getCurrentUrl().equals(st)) {
					break;
				}
			    System.out.println("done");
			 
            }
            Thread.sleep(3000);

            
            String m = "https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";
            for (String ss : ww) {
            	if ((driver.switchTo().window(ss).getCurrentUrl().equals(m))) {
            		break;
				} 
				System.out.println("done1");
			}
            Thread.sleep(3000);

                  driver.navigate().to("https://www.amazon.in/");

	}

}
