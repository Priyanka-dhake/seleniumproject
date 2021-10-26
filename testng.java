Annontation

package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annontation {


	public String baseurl = "https://www.saucedemo.com/";
	String driverpath = "/usr/bin/chromedriver";
	public WebDriver driver;

	@BeforeTest
	public void HomepageTitle() {
		System.out.println("Launching chrome Browser");
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.get(baseurl);

	}
	@Test
	public void VerifyHomepageTitle() throws InterruptedException{
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,350)");

		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);

		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-350)");

		driver.findElement(By.id("shopping_cart_container")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("first-name")).sendKeys("Priyanka");
		driver.findElement(By.id("last-name")).sendKeys("Dhake");
		driver.findElement(By.id("postal-code")).sendKeys("411019");
		Thread.sleep(2000);
	
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("product_sort_container")).click();
		Thread.sleep(2000);

		Select obj = new Select(driver.findElement(By.className("product_sort_container")));
		obj.selectByVisibleText("Price (low to high)");


		driver.navigate().to("https://twitter.com/saucelabs");		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);


	}

	@AfterTest
	public void terminateHomepage() {
		driver.close();
	}
}





Data Provider


package swaglab;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class dataproviderexample {

	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		System.out.println("your username is::"+username);
		System.out.println("your password is::"+password);
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];


		data[0][0] ="standard_user";
		data[0][1] ="secret_sauce";

		data[1][0] ="problem_user";
		data[1][1] ="secret_sauce";

		data[2][0] ="locked_out_user";
		data[2][1] ="secret_sauce";
		return data;
	}

}


Example



package swaglab;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class example {
	public String baseurl = "https://www.saucedemo.com/";
	String driverpath = "/usr/bin/chromedriver";
	public WebDriver driver;
	@Test
	public void VerifyHomepageTitle() {
		System.out.println("Launching chrome Browser");
		System.setProperty("webdriver.chrome.driver",driverpath);
		driver = new ChromeDriver();
		driver.get(baseurl);
		String expectedTitle = "Instructor-Led Online Training with 24X7 Lifetime Support | Edureka";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();

	}
}




Test DDT


package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class testddt { 

	@Test(dataProvider="testdata")
	public void Testchrome(String username, String password)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver" );
		WebDriver driver = new ChromeDriver();


		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");


		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys(username);


		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password);

		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);


		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);

		driver.close();
	}
	@DataProvider(name="testdata")
	public Object[][] TestDataFeed(){


		Object[][] saucedemodata=new Object[1][2];

		saucedemodata[0][0]="standard_user";
		saucedemodata[0][1]="secret_sauce";

		return saucedemodata;
	}
}



