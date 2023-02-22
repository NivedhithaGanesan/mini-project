 package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MiniProject {

	public static void main(String[] args) throws Throwable {
           System.setProperty("webdriver.chrome.driver",
        		   "C:\\Users\\nivim\\eclipse-workspace\\Selenium\\DRIVER(108v)\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.get("https://adactinhotelapp.com/");
//           WebElement newuser = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
//           newuser.click();
//            WebElement id = driver.findElement(By.id("username"));
//           id.sendKeys("nivi20000");
//            WebElement pass = driver.findElement(By.name("password"));
//		   pass.sendKeys("Nivi@123456");
//		   WebElement repass = driver.findElement(By.name("re_password"));
//		   repass.sendKeys("Nivi@123456");
//		   WebElement name = driver.findElement(By.id("full_name"));
//		   name.sendKeys("Nivedhitha");
//		   WebElement email = driver.findElement(By.id("email_add"));
//		   email.sendKeys("korangu07@gmail.com");
		
		WebElement userid = driver.findElement(By.id("username"));
		userid.sendKeys("nivi20000");
		
		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys("Nivi@123456");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		//pg.no.1		
		
		WebElement loc = driver.findElement(By.id("location"));
		loc.click();
		Select l = new Select(loc);
		l.selectByVisibleText("Los Angeles");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		     Select h = new Select(hotel);
		      h.selectByValue("Hotel Sunshine");
		
		WebElement rooms = driver.findElement(By.id("room_type"));
				Select r = new Select(rooms);
				r.selectByVisibleText("Super Deluxe");
				
		WebElement rrr = driver.findElement(By.id("room_nos"));		
				Select rr = new Select(rrr);
				rr.selectByVisibleText("1 - One");
				
	WebElement in = driver.findElement(By.xpath("(//input[@type='text'])[2]"));			
		in.clear();
		in.sendKeys("25/10/2022");
		
	WebElement out = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		 out.clear();
		 out.sendKeys("26/10/2022");
		 
		 WebElement members = driver.findElement(By.id("adult_room"));
		Select mm = new Select(members);
		mm.selectByVisibleText("1 - One");
		
		WebElement children = driver.findElement(By.name("child_room"));
		Select c = new Select(children);
		c.selectByIndex(1);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		//pg.no.2
		
		WebElement radiob = driver.findElement(By.name("radiobutton_0"));
		radiob.click();
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		//pg.no.3
		
		WebElement fn = driver.findElement(By.name("first_name"));
		fn.sendKeys("Nivedhitha");
		
		WebElement ln = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		ln.sendKeys("Ganesan");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("44/3,somewhere on earth st,la-03");
		
		WebElement cn = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		cn.sendKeys("1234567890123456");
		
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		Select cc = new Select(cardtype);
		cc.selectByVisibleText("VISA");
		
		WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
		Select exp = new Select(ccexp);
		exp.selectByVisibleText("December");
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select yy = new Select(expyear);
		yy.selectByVisibleText("2022");
		
		WebElement ccv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
              ccv.sendKeys("321");
         
        WebElement booknow = driver.findElement(By.name("book_now"));
		booknow.click();
		 Thread.sleep(6000);
		 
		WebElement fuck = driver.findElement(By.name("my_itinerary"));
		fuck.click();
		
	                     	// if you want you can cancel it.
		
		WebElement venna = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		venna.click();
//		
//		WebElement venna1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
//		venna1.click();
//		
//		WebElement venna2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
//		venna2.click();
//		
		WebElement poda = driver.findElement(By.name("cancelall"));
		poda.click();
		
	}

}
