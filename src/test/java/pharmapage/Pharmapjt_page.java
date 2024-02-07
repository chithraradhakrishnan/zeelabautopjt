package pharmapage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pharmapjt_page {
	WebDriver driver;

		By createacc=By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div[2]/div/div[4]/div/a/i");
		By email=By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div[1]/form/div[3]/div/input");
		By password=By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div[1]/form/div[4]/div/input");
		
		By login=By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div[1]/form/div[6]/div/button");

public Pharmapjt_page(WebDriver driver)
{
	this.driver=driver;
}
public void signinpage()
{
	//driver.findElement(popup).click();
	driver.findElement(createacc).click();
}

public void setvalues(String emailid,String Password)
{
	driver.findElement(email).clear();
	driver.findElement(email).sendKeys(emailid);

	driver.findElement(password).clear();
	driver.findElement(password).sendKeys(Password);
}
public void login()
{
	driver.findElement(login).click();
}


}



