package PracaDomowa2402.zadanie1.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PersonDemo {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.gecko.driver", "src/PracaDomowa2402/zadanie1/main/resources/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://bogus.000webhostapp.com/generatory/all.html");
		Thread.sleep(2000);	
		
		WebElement elementText 		= driver.findElement(By.xpath("//div[@id='gen_pesel']/p/input"));
		WebElement elementButton 	= driver.findElement(By.xpath("//div[@id='gen_pesel']/p/button"));
		
		Person[] persons = new Person[5];
		for (int i = 0; i < persons.length; i++) {
			elementButton.click();
			System.out.println("Klik " + (i + 1));
			Thread.sleep(200);
			persons[i] = new Person(elementText.getAttribute("value"));
		}
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i].getPesel());
		}
	}
}
