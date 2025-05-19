package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type ='checkbox'])[1]"));
		//checkbox1.click();
		boolean checkbox1Status=checkbox1.isSelected();
		System.out.println(checkbox1Status);
		boolean checkbox1display=checkbox1.isDisplayed();
		System.out.println(checkbox1display);
		boolean checkbox1Enabled=checkbox1.isEnabled();
		System.out.println(checkbox1Enabled);
		

		WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']//input[@type ='checkbox'][2]"));
		boolean checkbox2Status=checkbox2.isSelected();
		System.out.println(checkbox2Status);
		boolean checkbox2display=checkbox2.isDisplayed();
		System.out.println(checkbox2display);
		boolean checkbox2Enabled=checkbox2.isEnabled();
		System.out.println(checkbox2Enabled);
		
		if(checkbox1.isSelected()==false)
		{
			checkbox1.click();
		}
		
		if(checkbox2.isSelected()==false)
		{
			checkbox2.click();
		}

	}

}
