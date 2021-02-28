import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exerciseOnMultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//ul//li[33]/a")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set <String> one=driver.getWindowHandles();
		Iterator <String> two=one.iterator();
		String parent=two.next();
		String child=two.next();
		
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
		
	}

}
