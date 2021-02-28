import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.cleartrip.com/");
		ArrayList<Integer> adults=new ArrayList<Integer>(6);
		adults.add(2);
		adults.add(3);
		adults.add(4);
		adults.add(5);
		
		for(Integer adultdropdown:adults)
		{
			System.out.println(adultdropdown);
		
		}
		
		System.out.println("Size" +adults.size());
		System.out.println(adults.set(2, 6));
		System.out.println("Updated Size" +adults);
	}

}
