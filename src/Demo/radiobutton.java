package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobutton {
	
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		WebElement radioButton = driver.findElement(By.id("sex-1"));
		
		radioButton.click();
		
		radioButton = driver.findElement(By.id("exp-2"));
		
		radioButton.click();
		
		radioButton = driver.findElement(By.id("profession-1"));
		
		radioButton.click();
	}

}
