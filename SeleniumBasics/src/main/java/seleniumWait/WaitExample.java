package seleniumWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
		WebElement startButton =driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click();
		Thread.sleep(6000);//used in java
		WebElement text =driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String value =text.getText();
		System.out.println(value);


	}

}
