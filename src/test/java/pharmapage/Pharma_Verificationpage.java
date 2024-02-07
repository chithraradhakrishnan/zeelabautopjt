package pharmapage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pharma_Verificationpage {
	WebDriver driver;
	By logo=By.xpath("//*[@id=\"fixNav\"]/nav/div/div[1]/a[2]/img");
	
	public Pharma_Verificationpage (WebDriver driver)
	{
		this.driver=driver;
	}
	public void titleverification()
	{
	
		
	String actual=driver.getTitle();
		System.out.println("Actual titile is:"+actual);
		String expected="Buy Affordable Generic Medicines, Online Generic Pharmacy Store India - ZEELAB Pharmacy";

		
		if(actual.equals(expected))
				{
					System.out.println("TITLE VERIFICATION PASSED");
				}
				else
				{System.out.println("TITLE VERIFICATION FAILED");
	}
	}
public void  logoverification() {
	if(driver.findElement(logo).isDisplayed())
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}
}
public void contentverification()
{
	if(driver.getPageSource().contains("QUICK BUY!"))
	{
		System.out.println("content verification passed");
	}
	else{
	
		System.out.println("content verification failed");
	}
}
public void Linkcount() 
	
	
		{
			List<WebElement>li=driver.findElements(By.tagName("a"));
			System.out.println("link count :" +li.size());


		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			String text=s.getText();
			System.out.println(link+"-------"+text);
		}
		}
public  void Linkvalid()
{
	
	
List<WebElement>li=driver.findElements(By.tagName("a"));
System.out.println("total no of links="+li.size());
for(WebElement s:li)
{
	String link=s.getAttribute("href");
	verify(link);
	
	
}

}

private void verify(String link)
{
	try
	{
		
		URL ob=new URL(link);
		
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		//HttpUrlConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("valid---"+link);
		}

		else if(con.getResponseCode()==404)
		{
			System.out.println("broken link---"+link);
		}
	}

	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
}




	








