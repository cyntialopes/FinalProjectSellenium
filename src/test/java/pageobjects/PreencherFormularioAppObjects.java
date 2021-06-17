package pageobjects;

import org.openqa.selenium.By;


public class PreencherFormularioAppObjects {
	
	String msgValidacao;
	
	public static final By Make = By.id("make");
	
	public static final By Model = By.id("model");
	
	public static final By Cylinder = By.id("cylindercapacity");
	
	public static final By Engine = By.id("engineperformance");
	
	public static final By NumberOfSeats = By.id("numberofseats");
	
	public static final By Right = By.id("righthanddriveyes");
	
	public static final By NumberOfseatsMotorcycle = By.id("numberofseatsmotorcycle");
	
	public static final By Payload = By.id("payload");
	
	public static final By Total = By.id("total");
	
	public static final By List = By.id("listprice");
	
	public static final By License = By.id("licenseplatenumber");
	
	public static final By Annual = By.id("annualmileage");

	public static final By Yes = By.xpath("//label[text()='Yes']");
	
	public static final By No= By.xpath("//label[text()='No']");
	
	public static final By FistName = By.id("firstname");
	
	public static final By LastName = By.id("lastname");
	
	public static final By Birthdate = By.id("birthdate");
	
	public static final By GenderMale = By.id("gendermale");
	
	//public static final By GenderFemale = By.id("genderfemale");
	
	public static final By GenderFemale = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span");
	
	public static final By Female= By.xpath("//label[text()='Female']");
	
	public static final By StreetAddress = By.id("streetaddress");
	
	public static final By Country = By.id("country");
	
	public static final By ZipCode = By.id("zipcode");
	
	public static final By City = By.id("city");
	
	public static final By Occupation = By.id("occupation");
	
	public static final By BungeeJumping= By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
	
	public static final By StartDate = By.id("startdate");
	
	public static final By InsuranceSum = By.id("insurancesum");
	
	public static final By SelectSilver = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
	
	public static final By meritrating = By.id("meritrating");
	
	public static final By damageinsurance = By.id("damageinsurance");
	
	public static final By EuroProtection = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	
	public static final By courtesycar = By.id("courtesycar");
	
	public static final By email = By.id("email");
	
	public static final By phone = By.id("phone");
	
	public static final By username = By.id("username");
	
	public static final By password = By.id("password");
	
	public static final By confirmpassword = By.id("confirmpassword");
	
	public static final By sendemail = By.id("sendemail");
	 
	public static final By next = By.xpath("//button[text()='Next »']");
	
	public static final By dateofmanufacture = By.id("dateofmanufacture");
	
	public static final By Vehitle = By.id("nav_automobile");

	public static final By Fuel = By.id("fuel");
	
	public static final By nextProduct = By.id("nextenterproductdata");
	
	public static final By nextSelect = By.id("nextselectpriceoption");

	public static final By nextSend = By.xpath("//*[@id=\"nextsendquote\"]");
}
