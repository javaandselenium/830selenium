package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//Step:1 typecasting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Step: 2 i can access method and photo will be stored in RAM
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//Step: 3 specify the required location
		File dest=new File("./photo/amazon.png");
		
		//Step: 4 copy the photo from RAM to requird location
		FileUtils.copyFile(src, dest);

		driver.close();
	}

}
