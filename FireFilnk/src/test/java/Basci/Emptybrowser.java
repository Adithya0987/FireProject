package Basci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emptybrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.fb.com");
		String windowp = driver.getWindowHandle();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http:www.ducati.com");
		driver.switchTo().window(windowp);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		

	}

}
