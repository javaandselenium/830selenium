package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
	
		driver.findElement(By.id("email")).sendKeys("jhghzfvjhgffgjhgfhjgj");
	
	    driver.findElement(By.name("password")).sendKeys("gjghfghffghghfgh");
		
	    driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.partialLinkText("Forgot")).click();
	
	
	}

}
