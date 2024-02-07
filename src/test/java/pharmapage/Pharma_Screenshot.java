package pharmapage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Pharma_Screenshot {
	
	
		WebDriver driver;

public Pharma_Screenshot(WebDriver driver)
{
	this.driver=driver;
}
public void screenshots() throws Exception
{	
		
		System.out.println("Webelement screenshot");
      WebElement bone =driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div[2]/div/div/div/div[1]/div/div[14]/div/a/div/img"));
	File src2=bone.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("./Screenshot//Pharmazeelab.png"));
		

	
		
	}
public void fullscreen() throws Exception
{
	System.out.println("fullscreen screenshot");
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("./Screenshot//Pharma.png"));
	
}
}


