package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedIsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement button =driver.findElement(By.id("inlineRadio1"));
		boolean maleButton =button.isDisplayed();
		System.out.println(maleButton);
//		boolean maleButtonEnab = button.isSelected();
//		System.out.println(maleButtonEnab);
		
		WebElement button1 =driver.findElement(By.id("inlineRadio2"));
		boolean femaleButton =button1.isDisplayed();
		System.out.println(femaleButton);
		button1.click();
		boolean femaleButtonEnab = button1.isSelected();
		System.out.println(femaleButtonEnab);
		

	}

}
