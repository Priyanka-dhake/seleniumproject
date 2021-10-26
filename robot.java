package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class democlass {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.findElement(By.linkText("Courses")).click();
		Robot robot= new Robot();
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_TAB);
		System.out.println("a");
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_TAB);		
		System.out.println("b");
		Thread.sleep(4000);
		robot.mouseMove(30,30);		
		System.out.println("d");																																																							
		driver.close();																																																 

	}

}



Swag Labs robotclass


package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.event.InputEvent;

public class sawgrobotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		Robot robot= new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);																																	 
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		
		/*System.out.println("a");
		robot.keyPress(KeyEvent.VK_UP);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_UP);
		System.out.println("b");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		System.out.println("c");*/
		driver.close();	

	}

}
 
