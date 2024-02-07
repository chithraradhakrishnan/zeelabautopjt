package pharmatest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pharma_Base.Pharmabase_login;
import Pharma_utility.PharmaUtility_login;

import pharmapage.Pharma_Fileupload;
import pharmapage.Pharma_Purchase;
import pharmapage.Pharma_Screenshot;
import pharmapage.Pharma_Verificationpage;
import pharmapage.Pharma_register;
import pharmapage.Pharmapjt_page;






/*public class Pharma_testdata   {
	WebDriver driver;
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
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@Test
public void registration()
{
driver.navigate().refresh();
	 Pharma_register ob=new Pharma_register(driver);
	 ob.signinpage();
	
	ob.setvalues("jogar","jhon","8946532589","jagranjogar4@gmail.com","jan12345");
	ob.createaccount();
}
}*/
public class Pharma_testdata extends Pharmabase_login
{
	@Test(priority=1)
	public void verifylogin() throws  Exception
	{
		driver.navigate().refresh();
		Pharmapjt_page obj= new Pharmapjt_page(driver);
		obj.signinpage();
		String xl="D:\\zeelabdata.xlsx";
		String sheet="Sheet1";
		int rowcount=PharmaUtility_login.getRowCount(xl,sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String emailid=PharmaUtility_login.getCellValue(xl,sheet,i,0);
			System.out.println("email :" +emailid);
			String Password=PharmaUtility_login.getCellValue(xl,sheet,i,1);
			System.out.println("password :"+Password);
			
			obj.setvalues(emailid,Password);
			obj.login();
		}
		
	}


@Test(enabled=false)
public void Verifications()
{
	Pharma_Verificationpage obje=new Pharma_Verificationpage(driver);
	obje.titleverification();
	obje.logoverification();
	obje.contentverification();
	obje.Linkcount();
obje.Linkvalid();
}




@Test(enabled=false)
public void Screenshot() throws Exception


{
	Pharma_Screenshot st=new  Pharma_Screenshot(driver);
	st.screenshots();
	st.fullscreen();
}

@Test(priority=2)

public void uploads() throws Exception 
{
	driver.navigate().refresh();
	Pharma_Fileupload fp=new Pharma_Fileupload(driver);
	fp.prescription();
	fp.setvalues("jogar", "8946532589", "jagranjogar4@gmail.com", "kambarath house", "thiroor");
	fp.fileupl();
	fp.fileUpload("Prescriptiondata");
	fp.submitbutton();
}

@Test(priority=3)
public void purchaseproducts() throws Exception 
{
	
Pharma_Purchase pj=new Pharma_Purchase(driver);
pj.purchase();
pj.setvalues("MuscleTech Hydroxycut Hardcore");


}

}