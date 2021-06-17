package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.PreencherFormularioAppObjects;

public class PreencherFormularioActions {
	
	WebDriver driver;
	WebDriverWait wait;

	public PreencherFormularioActions(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		
	}
	
	private void selectByValue (By by, String valor) {
		
        Select select	=	new	Select(driver.findElement(by));
        select.selectByValue(valor);
		
	}
	public void PreencherFomularioEnterVehicleDate(String Make, String Engine, String dateofmanufacture,
			String Number, String Fuel, String List, String License, String Annual ) {
		
		driver.findElement(PreencherFormularioAppObjects.Vehitle).click();
		wait.until(ExpectedConditions.elementToBeClickable(PreencherFormularioAppObjects.Make));
		selectByValue(PreencherFormularioAppObjects.Make, Make);
		driver.findElement(PreencherFormularioAppObjects.Engine).sendKeys(Engine);
		driver.findElement(PreencherFormularioAppObjects.dateofmanufacture).sendKeys(dateofmanufacture);
		selectByValue(PreencherFormularioAppObjects.NumberOfSeats , Number);
		selectByValue(PreencherFormularioAppObjects.Fuel, Fuel);
		driver.findElement(PreencherFormularioAppObjects.List).sendKeys(List);
		driver.findElement(PreencherFormularioAppObjects.License).sendKeys(License);
		driver.findElement(PreencherFormularioAppObjects.Annual).sendKeys(Annual);	
		
	}
	
	public void clicarBotaoNext() {
	
	driver.findElement(PreencherFormularioAppObjects.next).click();
}
	
	public void PreencherFormularioEnterInsurantDate(String FistName, String LastName, String Birthdate,
			String StreetAddress, String Country, String ZipCode, String City, String Occupation ) {
		
		driver.findElement(PreencherFormularioAppObjects.FistName).sendKeys(FistName);
		driver.findElement(PreencherFormularioAppObjects.LastName).sendKeys(LastName);
		driver.findElement(PreencherFormularioAppObjects.Birthdate).sendKeys(Birthdate);
		driver.findElement(PreencherFormularioAppObjects.GenderFemale).click();
		driver.findElement(PreencherFormularioAppObjects.StreetAddress).sendKeys(StreetAddress);
		selectByValue(PreencherFormularioAppObjects.Country, Country);
		driver.findElement(PreencherFormularioAppObjects.ZipCode).sendKeys(ZipCode);
		driver.findElement(PreencherFormularioAppObjects.City).sendKeys(City);
		selectByValue(PreencherFormularioAppObjects.Occupation, Occupation);	
		driver.findElement(PreencherFormularioAppObjects.BungeeJumping).click();
		driver.findElement(PreencherFormularioAppObjects.nextProduct).click();
		
	}
	
	public void PreencherFormularioEnterProductDate(String StartDate, String InsuranceSum, String meritrating, String damageinsurance, 
			String courtesycar) {
		
		driver.findElement(PreencherFormularioAppObjects.StartDate).sendKeys(StartDate);
		selectByValue(PreencherFormularioAppObjects.InsuranceSum, InsuranceSum);
		selectByValue(PreencherFormularioAppObjects.meritrating, meritrating);
		selectByValue(PreencherFormularioAppObjects.damageinsurance, damageinsurance);
		driver.findElement(PreencherFormularioAppObjects.EuroProtection).click();
		selectByValue(PreencherFormularioAppObjects.courtesycar, courtesycar);
		driver.findElement(PreencherFormularioAppObjects.nextSelect).click();
		driver.findElement(PreencherFormularioAppObjects.SelectSilver).click();
		driver.findElement(PreencherFormularioAppObjects.nextSend).click();
		
	}
	
	public void PreencherFormularioPriceOption() {
		driver.findElement(PreencherFormularioAppObjects.SelectSilver).click();
		driver.findElement(PreencherFormularioAppObjects.nextSend).click();	
		
	}
	
	public void PreencherFormularioSendQuote(String email, String phone, String username, String password, String confirmpassword) {
		driver.findElement(PreencherFormularioAppObjects.email).sendKeys(email);
		driver.findElement(PreencherFormularioAppObjects.phone).sendKeys(phone);
		driver.findElement(PreencherFormularioAppObjects.username).sendKeys(username);
		driver.findElement(PreencherFormularioAppObjects.password).sendKeys(password);
		driver.findElement(PreencherFormularioAppObjects.confirmpassword).sendKeys(confirmpassword);
		driver.findElement(PreencherFormularioAppObjects.sendemail).click();
		
	}
}