package maven.Bartek.projektMavenBartek;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class elementy {
	WebDriver driver;
	
	@FindBy(id="package-origin-hp-package")
	WebElement skad_przycisk;
	
	@FindBy(id="package-destination-hp-package")
	WebElement dokad_przycisk;
	
	@FindBy(id="package-departing-hp-package")
	WebElement wylot_data;
	
	@FindBy(id="package-returning-hp-package")
	WebElement przylot_data;
	
	@FindBy(id="search-button-hp-package")
	WebElement przycisk_szukaj;
	
	public void kliknij_szukaj () {
		przycisk_szukaj.click();
	}
	
	
	public elementy (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);//inicjalizacja element�w powy�ej
	}
	
	public void wpisz_skad (String wpisz) {
		skad_przycisk.sendKeys(wpisz);
	}
	
	public void wpisz_dokad (String wpisz) {
		dokad_przycisk.sendKeys(wpisz);
	}
	
	public void data_wylot (String wpisz) {
		wylot_data.sendKeys(wpisz);
	}
	
	public void data_przylot (String wpisz) {
		przylot_data.sendKeys(wpisz);
	}
	
	

}
