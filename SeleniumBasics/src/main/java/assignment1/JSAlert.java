package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		//JavascriptExecutor js =(JavascriptExecutor) driver;
		
		WebElement button= driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		button.click();
		driver.switchTo().alert().accept();
		WebElement button1 =driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		button1.click();
		String text =driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		
		//js.executeScript("window.scrollBy(0,6000)");
		WebElement button2 =driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		//js.executeScript("arguments[0].click();",button2);
		button2.click();
		driver.switchTo().alert().sendKeys("sample text");
		driver.switchTo().alert().accept();
	}

}
