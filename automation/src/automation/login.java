package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class login 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ca-oms.com/");
		
		String title=driver.getTitle();
		System.out.println("page : "+title);
		
		WebElement radio1= driver.findElement(By.id("rbAdmin"));
		radio1.click();
		
		//invalid
		driver.findElement(By.name("txtUserName")).sendKeys("superadminnn");
		driver.findElement(By.name("txtPassword")).sendKeys("superadmi1234");
		
		WebElement SignInButton= driver.findElement(By.name("btnSignIn"));
		SignInButton.click();
		
		
		if(title.equals(title))
		{
			System.out.println("fail invalid data");
			
			WebElement alertWebelement = driver.findElement(By.xpath("//button[@class='close']/following-sibling::b"));
			
			
			String alert =alertWebelement.getText();
			System.out.println(alert);
			
			if(alertWebelement.equals("Warning"));
			{
				System.out.println("please select admin/super admin or employee before entering username and password");
			}
			
		}
		else
		{
			System.out.println("pass");
		}
		
		
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtPassword")).clear();
		
/*	//empty
	     
	     String title2=driver.getTitle();
	     System.out.println("page 1:"+title2);
	     
	     WebElement radio2= driver.findElement(By.id("rbAdmin"));
	     radio2.click();
	     
	     driver.findElement(By.name("txtUserName")).sendKeys(" ");
		 driver.findElement(By.name("txtPassword")).sendKeys(" ");
		 
		 WebElement SignInButton2=driver.findElement(By.name("btnSignIn"));
		 SignInButton2.click();
		
			if(title.equals(title))
			{
				System.out.println("fail empty data");
				
				WebElement alertWebelement = driver.findElement(By.xpath("//button[@class='close']/following-sibling::b"));
				
				String alert=  alertWebelement.getText();
				
				if( alert.equals("Warning2"));
				{
					System.out.println("please select admin/super admin or employee before entering username and password");
				}
				
			}
			else
			{
				System.out.println("pass");
			}
			
			
			driver.findElement(By.name("txtUserName")).clear();
			driver.findElement(By.name("txtPassword")).clear();
		
		//valid
		String title1=driver.getTitle();
		System.out.println("page 2: "+title1);
		
		 WebElement radio3=driver.findElement(By.id("rbAdmin"));
		 radio3.click();
		 
		 driver.findElement(By.name("txtUserName")).sendKeys("superadmin");
		 driver.findElement(By.name("txtPassword")).sendKeys("superadmin123");
		 
		 WebElement SignInButton3 =driver.findElement(By.name("btnSignIn"));
		 SignInButton3.click();
		 
	     String title3=driver.getTitle();
	     System.out.println(title3);
	     
	     if(title1.equals(title3))
	     {
	    	System.out.println(" fail3");
	    	WebElement alertWebelement = driver.findElement(By.xpath("//button[@class='close']/following-sibling::b"));
			
			String warningMessage=  alertWebelement.getText();
			
			if( warningMessage.equals("Warning"));
			{
				System.out.println("please select admin/super admin or employee before entering username and password");
			}
			
	     }
	     else 
	     {
	    	 System.out.println("pass");
	     }
	     driver.findElement(By.name("txtUserName")).clear();
		 driver.findElement(By.name("txtPassword")).clear();*///
	     
	    
		
		
		
		
	}
}