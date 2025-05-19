package assignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		WebElement button =driver.findElement(By.id("save"));
		button.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card text-center']//img")));
		
		WebElement image = driver.findElement(By.xpath("//div[@class='card text-center']//img"));
		boolean imageDisplay= image.isDisplayed();
		System.out.println(imageDisplay);
		
		WebElement name =driver.findElement(By.xpath("//h5[@class='card-title']"));
		String getName =name.getText();
		System.out.println(getName);
		WebElement email =driver.findElement(By.xpath("//P[@class='card-text text-center p-3']"));
		String getEmail = email.getText();
		System.out.println(getEmail);

	}

}
