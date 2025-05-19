package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anakh\\OneDrive\\Desktop\\Selenium Java Obsqura\\Chromedriver\\Chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");//to get the current url
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		driver.manage().window().maximize();//to maximize the window
		String title =driver.getTitle();//to get the title of the page
		System.out.println(title);//prints the title
		
		String url=driver.getCurrentUrl();//to get the url of page currently in use
		System.out.println(url);

	}

}
