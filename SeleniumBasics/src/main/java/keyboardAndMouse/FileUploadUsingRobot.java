package keyboardAndMouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadUsingRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement file = driver.findElement(By.id("file-upload"));
		String path = "C:\\Users\\anakh\\OneDrive\\Documents\\sign.jpg";
		
		Actions action = new Actions(driver);
		Robot robot=new Robot();
		action.click(file).build().perform();
		StringSelection selection = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.delay(1000);
	
     	robot.keyPress(KeyEvent.VK_CONTROL);//key_press will click the button
		robot.keyPress(KeyEvent.VK_V); //to select
		robot.delay(1000);
 		robot.keyRelease(KeyEvent.VK_CONTROL);//key release will release the button
		robot.keyRelease(KeyEvent.VK_V);
    	robot.delay(1000); 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
