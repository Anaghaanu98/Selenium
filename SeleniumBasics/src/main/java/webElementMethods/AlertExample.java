package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

//		WebElement button1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//		button1.click();
		
//		driver.switchTo().alert().accept();--to click ok on alert
		WebElement button2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		//button2.click();
		
		WebElement button3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		button3.click();
		driver.switchTo().alert().dismiss();//to click cancel button on alert
		button3.click();
		String text =driver.switchTo().alert().getText();//to get the text on the alert
		System.out.println(text);
		driver.switchTo().alert().sendKeys("title");//to give input value in the alert
		driver.switchTo().alert().accept();
	

	}

}
