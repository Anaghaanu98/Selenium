package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		
		WebElement radioButton = driver.findElement(By.xpath("//div[contains(text(),'Radio Button Demo')]"));
		String value =radioButton.getText();
		System.out.println(value);
		
		WebElement radioButton1 = driver.findElement(By.cssSelector("#inlineRadio1"));
		radioButton1.click();
		
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
		
		WebElement text = driver.findElement(By.id("message-one"));
		String result =text.getText();
		System.out.println(result);
		

	}

}
