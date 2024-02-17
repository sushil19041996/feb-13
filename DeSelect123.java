package chromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelect123 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","G:\\SeleniumWebDrive4\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/select-menu");
	
	WebElement s=driver.findElement(By.xpath("//select[@name='cars']"));
	Select a=new Select(s);
	a.selectByVisibleText("Saab");
	
	Thread.sleep(5000);
	
	a.deselectByVisibleText("Saab");
	
	Thread.sleep(5000);
	driver.quit();
	}

}
