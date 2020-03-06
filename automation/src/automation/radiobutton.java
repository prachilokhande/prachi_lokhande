package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ca-oms.com/");	
		//find radio button
		WebElement radio1=driver.findElement(By.id("rbAdmin"));
		//check radion button is display
		boolean radioBtnIsDisplay=radio1.isDisplayed();
		System.out.println(radioBtnIsDisplay);
		
		//check radio button is enable
		boolean radioBtnIsEnable=radio1.isEnabled();
		System.out.println(radioBtnIsEnable);
		
		//check radio button is selected
		boolean radioBtnIsSelected=radio1.isSelected();
		System.out.println(radioBtnIsSelected);
		
		//select
		 radio1.click();
		 //after selecting check again
		// boolean radioBtnNew=
		
		
		
		
		
		
	}

}
