package autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		
		Thread.sleep(3000);
		
		 List<WebElement> ele1 = driver.findElements(By.xpath("//li[@class='sbct']"));
		
		 System.out.println(ele1.size());
		
		for(WebElement text:ele1) {
			System.out.println(text.getText());
		}
		
		driver.close();

	}

}
