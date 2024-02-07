package pharmapage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pharma_Fileupload {

	WebDriver driver;
	By upload=By.xpath("//body/div[1]/div[4]/nav[1]/div[1]/div[3]/ul[1]/li[10]/a[1]/button[1]");
		By Yourfullname=By.name("name");
		By Phonenumber=By.name("contact");
		By email=By.xpath("/html/body/div[1]/section/div/div[1]/div[2]/div/div/form/div[3]/div/input");
		By address=By.xpath("/html/body/div[1]/section/div/div[1]/div[2]/div/div/form/div[4]/div/input");
		By city=By.name("city");
		By picadd=By.name("image");
		By submit=By.xpath("//*[@id=\"prescription_button\"]");
		

	

public Pharma_Fileupload(WebDriver driver)
{
	this.driver=driver;
}

public void prescription()
{
	driver.findElement(upload).click();
}

public void setvalues(String Name,String Contactno,String emailid,String Address,String City)
{
	driver.findElement(upload).click();
	driver.findElement(Yourfullname).sendKeys(Name);
	driver.findElement(Phonenumber).sendKeys(Contactno);
driver.findElement(email).sendKeys(emailid);
    driver.findElement(address).sendKeys(Address);
	driver.findElement(city).sendKeys(City);
	
	
}
public void fileupl() throws Exception
{
driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/div[2]/div/div/form/div[6]/div/label")).click();
fileUpload("D:\\prescriptionzeelab.pdf");
}
public void fileUpload(String p) throws AWTException

{
	
	//to copy path to clipboard
	StringSelection strSelection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	
	
	//to paste into sysmwindow
	Robot robot=new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);

	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_ENTER);
	//Thread.sleep(5000);
	robot.keyRelease(KeyEvent.VK_ENTER);

	
	
}
public void submitbutton()
{
	driver.findElement(submit).click();
}
}

