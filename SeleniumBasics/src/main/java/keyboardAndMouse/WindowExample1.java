package keyboardAndMouse;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		driver.manage().window().maximize();

		WebElement tab = driver.findElement(By.id("new-tab-button"));
		tab.click();
		String parentWindowId = driver.getWindowHandle();// to get id of parent tab
		System.out.println(parentWindowId);

		Set<String> windowid = driver.getWindowHandles();// gives the id of all the windows

		for (String windowids : windowid) {
			if (!parentWindowId.equals(windowids))// to get the child window and not the parent
			{
				driver.switchTo().window(windowids);
				break;
			}
		}
		WebElement newWindow = driver.findElement(By.xpath("//h1[@class='display-3']"));// webelemnt of new tab
		String text = newWindow.getText();
		System.out.println(text);

	}

}
