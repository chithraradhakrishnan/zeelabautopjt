package pharmapage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pharma_register {
	WebDriver driver;
   
	By createacc=By.xpath("/html/body/div[1]/div[3]/div/div/div[2]/div/div[2]/div/div[4]/div/a/i");
	By signup=By.xpath("/html/body/div[1]/section/div/div/div[2]/div[2]/div[2]/div/p/a");
	


	By firstname=By.name("first_name");
	By lastname=By.name("last_name");
	By contact=By.name("contact");
	By email=By.name("signup_email");
	By password=By.id("signup_password");
	
	By signin=By.xpath("/html/body/div[1]/section/div/div/div[2]/div[1]/form/div[8]/div/button");
	
	
	
		
public Pharma_register(WebDriver driver)
{
	this.driver=driver;
}

public void signinpage()
{

	driver.findElement(createacc).click();

driver.findElement(signup).click();
	
}


public void setvalues(String Firstname,String Lastname,String mobileno,String Email,String Password)
{
	
	driver.findElement(firstname).sendKeys(Firstname);
	driver.findElement(lastname).sendKeys(Lastname);
driver.findElement(contact).sendKeys(mobileno);
    driver.findElement(email).sendKeys(Email);
	driver.findElement(password).sendKeys(Password);
	
	
}
public void createaccount()
{
	
	
	driver.findElement(signin).click();

	
}
}






