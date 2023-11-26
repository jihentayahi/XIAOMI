package Helper;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions action;
	public static void initializedriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", Utils.getProperty("TestDriverPatrh"));
		driver = new ChromeDriver();
	}
	
public static void maximisewindow() {
	driver.manage().window().maximize();
}
public static void navigate (String URL) {
	Config.driver.get(URL);
}
public static void driverQuit() {
	driver.quit();
}
	
	

}
