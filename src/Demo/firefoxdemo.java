package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxdemo {
	
	public static void main(String[] args) {
		
		WebDriver f= new FirefoxDriver();
		
		f.manage().window().maximize();
		
		f.get("http://www.gmail.com/");
		
		f.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		f.quit();
	}

}
