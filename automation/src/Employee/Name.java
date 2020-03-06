package Employee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Name {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ca-oms.com/");	
			
		 
		WebElement radio=driver.findElement(By.id("rbAdmin"));
	    radio.click();
		 
	    driver.findElement(By.name("txtUserName")).sendKeys("superadmin");
		driver.findElement(By.name("txtPassword")).sendKeys("superadmin123");
		driver.findElement(By.name("btnSignIn")).click();
		driver.get("http://ca-oms.com/EmployeeMaster.aspx");
		
		//name Field
		//number
		driver.findElement(By.id("ContentPlaceHolder1_txtName")).sendKeys("1234");
		WebElement alertmessage=driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txtName\"]"));
		String alert =alertmessage.getText();
		if(alert.equals("warning"))
		{
			System.out.println("pass");

		}
		else 
		{
			System.out.println("fail");
		}
		//message
		driver.findElement(By.id("ContentPlaceHolder1_txtName")).clear();
		
		
		//specialChar
		driver.findElement(By.id("ContentPlaceHolder1_txtName")).sendKeys("!@#$");
		//message
		driver.findElement(By.id("ContentPlaceHolder1_txtName")).clear();
		//empty
		driver.findElement(By.id("ContentPlaceHolder1_txtName")).sendKeys(" ");
		//message
		driver.findElement(By.id("ContentPlaceHolder1_txtName")).clear();
		//valid
		driver.findElement(By.id("ContentPlaceHolder1_txtName")).sendKeys("Prachi Lokahnde");
		
		//Address
		driver.findElement(By.id("ContentPlaceHolder1_txtAddress")).sendKeys("as233$$ H");
		
		//Mobile No
		//more
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys("123456789098");
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).clear();
		//less
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys("1234");
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).clear();
		//characters
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys("gfds");
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).clear();
		//Special Characters
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys("!@$#");
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).clear();
		//empty
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys(" ");
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).clear();
		//valid
		driver.findElement(By.id("ContentPlaceHolder1_txtMobileNo")).sendKeys("9096600629");
		
		//Email ID
		driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).sendKeys("lokhandeprachie12@gmail.com");
		driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).clear();
		//invalid
		driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).sendKeys("lokhandeprachie12gmail.com");
		driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).clear();
		
		//empty
		driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).sendKeys(" ");
		driver.findElement(By.id("ContentPlaceHolder1_txtEmail")).clear();
		
		
		//Username
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).sendKeys("superadmin");
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).clear();
		//number
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).sendKeys("1234");
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).clear();
		//special characters
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).sendKeys("$%^^");
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).clear();
		//empty
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).sendKeys(" ");
		driver.findElement(By.id("ContentPlaceHolder1_txtUsername")).clear();
		
		//password
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys("superadmin123");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).clear();
		
		//empty
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).sendKeys(" ");
		driver.findElement(By.id("ContentPlaceHolder1_txtPassword")).clear();
		
		//Security questions
	   WebElement question=driver.findElement(By.id("ContentPlaceHolder1_ddlSecurityQuestion"));
	   question.clear();
		
		Select dropdown =new Select(question);
		dropdown.selectByVisibleText("");
		
		
		
		
		
		
		
		
		
		
		 
		
	}

}
