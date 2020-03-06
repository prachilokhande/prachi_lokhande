package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class userName
{

	public static void main(String[] args)
	{
		String name="A-Z a-z";
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ca-oms.com/");	
		
		WebElement radio1=driver.findElement(By.id("rbAdmin"));
		radio1.click();
		
		WebElement UserName=driver.findElement(By.name("txtUserName"));
		UserName.sendKeys("prachi");
		UserName.clear();
		
	if(name.matches("prachi"))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("Fail");
	}
		
	}

}
