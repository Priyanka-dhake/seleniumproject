Action Swaglabs

package action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsawglabs {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		((JavascriptExecutor) driver).executeScript("scroll(0,300)");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		
		
		Actions ac = new Actions(driver);


		WebElement automate= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		automate.click();
		
		Thread.sleep(2000);
		driver.quit();  
	}

}


Mouse Click

package action;
	

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class click {

			public static void main(String[] args) throws InterruptedException {

			
				System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				
				Actions action = new Actions(driver);
				WebElement elementToType = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
				Thread.sleep(2000);
				action.sendKeys(elementToType, "watch").build().perform();
				Thread.sleep(2000);
				
			
				WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
				Thread.sleep(2000);
			
				action.click(elementToClick).build().perform();
				Thread.sleep(2000);

				driver.quit();
			}

		}
		
		

Edureka Action class

		
package action;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class edurekaction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("body:nth-child(2) "
				+ "nav.navbar.navbar-default.nav_category:nth-child(9) > div.dropdown.dropdown_category_list"
			))).build().perform();
		Thread.sleep(5000);
	    WebElement element1=driver.findElement(By.cssSelector("nav.navbar.navbar-default.nav_category:nth-child(9)"
	    		+ " div.dropdown.dropdown_category_list "
	    		+ "ul.dropdown-menu.dropdown_menu_multi_level.hidden-xs.hidden-sm li.dropdown-submenu.dropdown_submenu_multi:nth-child(9) > "
	    		+ "a.dropdown-toggle.ga_top_category"));
	    		
	    action.moveToElement(element1).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(text(),'Software Testing')]")).click();
	    Thread.sleep(3000);
        driver.quit();
        		}
	
}


Google search

package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keydemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		
		Actions action = new Actions(driver);
		
		action.keyDown(element,Keys.SHIFT).sendKeys("swaglabs").build().perform();
		Thread.sleep(2000);
		
	driver.quit();
		
	}

}



Login Swag labs ActionClass


package action;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
 import org.openqa.selenium.interactions.ClickAction;
	public class logindemo {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
			Actions builder = new Actions(driver);
			
			WebElement un = driver.findElement(By.id("user-name"));
			builder.moveToElement(un).build().perform();
			
			
			WebElement pass = driver.findElement(By.id("password"));
			builder.moveToElement(pass).build().perform();
		
			WebElement login =driver.findElement(By.id("login-button"));
			builder.moveToElement(login).build().perform();
			
			
			WebElement drop =driver.findElement(By.id("login-button"));
			builder.moveToElement(login).build().perform();

			Action SeriesOfActions;
		
			SeriesOfActions = (Action) builder
					
					.sendKeys(un,"standard_user")
					.sendKeys(pass,"secret_sauce")
					.keyDown(login, Keys.SHIFT)
					.keyUp(login, Keys.SHIFT)
					.build();
			SeriesOfActions.perform();
						
}
	}
	
	
Ebay search click
	
package action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ebayclick {

	public static void main(String[] args) throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement elementToType = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
		Thread.sleep(2000);
		action.sendKeys(elementToType, "watch").build().perform();
		Thread.sleep(2000);
		
	
		WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		Thread.sleep(2000);
	
		action.click(elementToClick).build().perform();
		Thread.sleep(2000);

		//driver.quit();
	}

}

Select Side Pannel


package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class swaglabsaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"))).build().perform();
		WebElement elementToClick = driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		action.click(elementToClick).build().perform();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
	    Thread.sleep(3000);
        driver.quit();
        		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


	


