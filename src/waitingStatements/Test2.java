package waitingStatements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("gjsgyfhgggsghg");
		driver.findElement(By.id("password")).sendKeys("sghjhgjhgssgjhg");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
