import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableExerciseFromLecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table1=driver.findElement(By.id("product"));

		System.out.println(table1.findElements(By.tagName("tr")).size());

		System.out.println(table1.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrowvalue=table1.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrowvalue.get(0).getText());

		System.out.println(secondrowvalue.get(1).getText());

		System.out.println(secondrowvalue.get(2).getText());

		}

	
	}


