package src;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import src.elementy;

public class KlasatestujacaTest {
	elementy obiekt;
	private WebDriver driver;
	private String base_url;
	
	
	@BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C://Users//Bartek//eclipse-workspace/chromedriver.exe");
			driver = new ChromeDriver();
			obiekt = new elementy(driver);
			base_url = "https://www.expedia.com/";
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		  
	  }
	
	
  @Test
  public void f() {
	  driver.get(base_url);
		
		obiekt.wpisz_skad("Krakow");
		obiekt.wpisz_dokad("Frankfurt");
		obiekt.data_wylot("09/09/2018");
		obiekt.data_przylot("09/09/2018");
		obiekt.kliknij_szukaj();
	  
  }
  
  @AfterClass
  public void afterClass() {
  }

}
