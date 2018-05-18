package Demo;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class toolsqa {
	public static void main (String[] args) {

		WebDriver f= new FirefoxDriver();
		
		//f.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		//f.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//f.manage().window().maximize();
		
		//WebElement oselect= f.findElement(By.id("continents"));
		
		//Select m = new Select(oselect);
		
		//f.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Select iSelect = new Select(f.findElement(By.xpath("/html/body/div/div[5]/div[2]/div/div/form/fieldset/div[12]/div/select")));
		
		//iSelect.selectByVisibleText("Africa");
		//Select oSelect = new Select(f.findElement(By.id("continents")));
		
		
		 
		f.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		
		f.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		f.manage().window().maximize();
		
		String handle = f.getWindowHandle();
		
		System.out.println(handle); 
		
		f.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/p[3]/button")).click();
		
		Set<String> handles = f.getWindowHandles();		
		
		System.out.println(handles);
		
		for (String handle1: f.getWindowHandles()){
		
			System.out.println(handle1);
			
			f.switchTo().window(handle1);
			
			
			
		}
		f.close();
		
	}	
		
		
		
		
	}
	

