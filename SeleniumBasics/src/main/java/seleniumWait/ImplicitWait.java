package seleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//implicit wait
		
		WebElement startButton =driver.findElement(By.xpath("//button[text()='Start']"));
		startButton.click();
		
		WebElement text =driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String value =text.getText();
		System.out.println(value);


	}

}
