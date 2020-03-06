package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class forgetPassword 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ca-oms.com/");	
		
		String title1=driver.getTitle();
		System.out.println("page 1: "+title1);
		
		 WebElement radio1=driver.findElement(By.id("rbAdmin"));
		 radio1.click();
		 
		 driver.findElement(By.name("txtUserName")).sendKeys("superadmin");
		 driver.findElement(By.name("txtPassword")).sendKeys(" ");
		 WebElement ForGetPasword =driver.findElement(By.id("lnkbtnForgetPassword"));
		 ForGetPasword.click();
		 
		 String title2=driver.getTitle();
		 System.out.println("page 2: "+title2);
			
		 WebElement radio2 =driver.findElement(By.id("rbAdmin"));
		 radio2.click();
		
		 driver.findElement(By.name("txtUserName")).sendKeys("superadmin");	 
		 
		 WebElement question = driver.findElement(By.id("ddlSecurityQuestion"));
		 question.click();
		 
		 Select dropdown =new Select(question);
		 int a=1;
		 switch (a)
		 {
		 case 1:
		 {
			 dropdown.selectByVisibleText("What is Your Pet Name?");
			 break;
		 }
		 case 2:
		 {
			 dropdown.selectByVisibleText("What is Your Favourite Color?");
			 break;
		 }
		 case 3:
		 {
			 dropdown.selectByVisibleText("What is Your School Name?");
			 break;
		 }
		
		 }
		 
		 
		



	}

}
