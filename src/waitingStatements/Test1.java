package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebDriverWait w=new WebDriverWait(driver,10);
		
		
	WebElement ele = driver.findElement(By.id("username"));
		
	w.until(ExpectedConditions.visibilityOf(ele)).sendKeys("admin");
	
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		WebElement btn = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		w.until(ExpectedConditions.elementToBeClickable(btn)).click();
		
		
		String title = driver.getTitle();
		System.out.println(title);
		
		w.until(ExpectedConditions.titleContains("login"));
	}

}
