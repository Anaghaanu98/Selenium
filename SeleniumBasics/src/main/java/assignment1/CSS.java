package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		
		WebElement attribute1=driver.findElement(By.id("normal-btn-success"));
		String backgroundColor =attribute1.getCssValue("background-color");
		System.out.println(backgroundColor);
		
		String fontColor = attribute1.getCssValue("color");
		System.out.println(fontColor);
		
		String fontStyle = attribute1.getCssValue("font-style");
		System.out.println(fontStyle);
		
		System.out.println("*************************************");
		
		WebElement attribute2 = driver.findElement(By.id("autoclosable-btn-warning"));
		String backgroundColor1 =attribute2.getCssValue("background-color");
		System.out.println(backgroundColor1);
		
		String fontColor1 = attribute2.getCssValue("color");
		System.out.println(fontColor1);
		
		String fontStyle1 = attribute2.getCssValue("font-style");
		System.out.println(fontStyle1);
		
		System.out.println("*************************************");
		
		WebElement attribute3 = driver.findElement(By.id("autoclosable-btn-danger"));
		String backgroundColor2 =attribute3.getCssValue("background-color");
		System.out.println(backgroundColor2);
		
		String fontColor2 = attribute3.getCssValue("color");
		System.out.println(fontColor2);
		
		String fontStyle2 = attribute3.getCssValue("font-style");
		System.out.println(fontStyle2);

	}

}
