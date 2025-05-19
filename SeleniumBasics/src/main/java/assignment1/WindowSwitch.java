package assignment1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		//driver.manage().window().maximize();
		
		WebElement tab = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		tab.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String parentWindowId = driver.getWindowHandle();
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId.size());
		
		Iterator<String> it = windowId.iterator();
		
		while(it.hasNext())
		{
			String childWindow = it.next();
			if(!parentWindowId.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				break;
			}
		
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement newTabText = driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb']"));
		System.out.println(newTabText.getText());

	}

}
