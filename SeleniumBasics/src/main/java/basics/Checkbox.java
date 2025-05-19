package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    WebDriver driver = new ChromeDriver();
		//driver.get("https://selenium.qabible.in/check-box-demo.php");
		
	    //syntax = //tagname[@attribute ='attribute value']
		//WebElement open = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		//open.click();
		
		driver.get("https://www.facebook.com/");
		
		//WebElement open1 = driver.findElement(By.xpath("//button[text()='Log in']"));
		//open1.click();
		
		//syntax -//tagname[text()='visible text']
		//WebElement open2 = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		//open2.click();
		
		//syntax- //tagname[contains(text(),'visible text')]
		//driver.get("https://www.amazon.in/");
		//WebElement open3 = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		//open3.click();
		
		//syntax-//tagname[starts-with(text(),'value')]
		
		
		//syntax-//tagname[contains(@attribute,'value')]
		//WebElement open4 = driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten ')]"));
		//open4.click();
		
		//driver.get("https://www.facebook.com/");
		WebElement open5 = driver.findElement(By.xpath("//a[contains(@href,'recover/initiate/?privacy_mutation_token')]"));
		open5.click();
		
	

	}

}
