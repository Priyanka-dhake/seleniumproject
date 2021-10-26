package user;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class logout {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
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

		//driver.findElement(By.xpath("//a[@href='https://www.facebook.com/saucelabs']")).click();
		//Thread.sleep(2000);

		driver.navigate().to("https://twitter.com/saucelabs");		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);



		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(2000);

	}
}
