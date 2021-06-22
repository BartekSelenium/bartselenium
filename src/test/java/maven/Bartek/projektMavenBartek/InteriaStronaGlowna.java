package maven.Bartek.projektMavenBartek;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class InteriaStronaGlowna {
	
	WebDriver driver;
	String baseUrl;
		
		
		@BeforeClass
		 public void beforeClass() {
	
		
			System.setProperty("webdriver.chrome.driver", "C://Users//Bartek//eclipse-workspace/chromedriver.exe");
			driver = new ChromeDriver();
			baseUrl = "https://www.interia.pl/";
			driver.manage().window().maximize();
			
		}
		
			@Test
			public void testuj() throws InterruptedException {
			driver.get(baseUrl);
			//WebElement loginLink = driver.findElement(By.xpath("//div[@class='calendar-image']"));
			
			Thread.sleep(6000);
			WebElement przejdzDoSerwisu = driver.findElement(By.xpath("//button[@class='rodo-popup-agree']"));
			przejdzDoSerwisu.click();
			
			Thread.sleep(3000);
			//List<WebElement> moja_lista = driver.findElements(By.xpath("//a[@class='portal-menu-a']"));
			 //Actions najedz = new Actions(driver);
			 //najedz.clickAndHold(loginLink).perform();
			 //Thread.sleep(3000);
			 //WebElement tekst = driver.findElement(By.xpath("//p[@class='calendar-details-desc']"));
			  //String toolTipText = tekst.getText();
			  //System.out.println(toolTipText);
			  
			  //if (toolTipText.contains("wystrzelona")) {
			//	  System.out.println("megaa");
			  //}
		
			  
			  WebElement motoryzacja = driver.findElement(By.xpath("//a[@title='Moto']"));
			  Actions actions = new Actions(driver);
			  actions.moveToElement(motoryzacja);
			  actions.perform();
			  motoryzacja.click();
			}
			 
	
			@AfterClass
			  public void afterClass() throws InterruptedException {
				Thread.sleep(2000);
			}
			  
}
			
		


