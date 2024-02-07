package Pharma_Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Pharmabase_login {
	public WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
	}
@BeforeMethod
public void url()
{
	driver.get("https://zeelabpharmacy.com/");
	driver.manage().window().maximize();
}
}



