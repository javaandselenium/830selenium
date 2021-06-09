package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		//to back
		driver.navigate().back();
		
		//to forward
		driver.navigate().forward();
	
		//to refresh
		driver.navigate().refresh();
		
		//to close
		driver.close();

	}

}
