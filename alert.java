package Alert.actionclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		
		
		Alert alert = driver.switchTo().alert();
		 
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if (text.equals("Please enter a valid user name")) {
			System.out.println("correct massage");
			
		}
		else {
			System.out.println("wrong massage");
		}
		

		alert.accept();
		
		driver.quit();

	}

}


Change to differnt window(add external file)

package Alert.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileactionclass {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("/home/am-pc-46/file.html");
	
	
	
	
	}
}

	

