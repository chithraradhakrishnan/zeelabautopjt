package pharmapage;



import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Pharma_Purchase {
	
	WebDriver driver;
	By allproducts=By.xpath("//body/div[1]/div[5]/nav[1]/div[1]/div[2]/ul[1]/li[1]/a[1]");
	By tablet = By.xpath("//*[contains(text(),'Acivix 400') and contains(@class,'newProductName')]");
     By addcart = By.xpath("//*[contains(text(),'ADD TO CART')]") ;
     By Search=By.xpath("//input[@id='' and @type='text']");
 	By tab=By.xpath("(//*[@type='submit']//*[contains(@class,'search')])[2]");
	By add=By.xpath("(//*[@type='submit' and contains(text(),'Add')])[1]");
public Pharma_Purchase(WebDriver driver)
{
	this.driver=driver;
}
public void purchase() throws Exception
{
	driver.findElement(allproducts).click();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)","");
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("./Screenshot//Pharmas.png"));


	WebElement absorb = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(tablet));
	absorb.click();
	WebElement addition = new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(addcart));
    addition.click();
}
public void setvalues(String medical)
{
	
	driver.findElement(Search).sendKeys(medical);
	driver.findElement(tab).click();
driver.findElement(add).click();
}
}
	


