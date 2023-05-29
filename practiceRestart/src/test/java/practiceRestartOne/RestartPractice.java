package practiceRestartOne;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RestartPractice {
	
	
	public static void main(String[] aers)
	{
		System.out.println("this is Rushikesh");
		
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		opt.addArguments("start-maximized");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(opt);
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		String pathValue = System.getProperty("user.dir");
		System.out.println(pathValue);
		driver.close();
		
		
	
		
		
	}

}
