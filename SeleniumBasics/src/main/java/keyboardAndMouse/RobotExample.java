package keyboardAndMouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		//java-keyboard interaction
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);//to press down key on keyboard

	}

}
