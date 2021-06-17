package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageobjects.PreencherFormularioAppObjects;
import actions.PreencherFormularioActions;


public class PreencherFomularioSteps {
	
	WebDriver driver;
	String msgValidacao;
	PreencherFormularioActions actions;
	String Url = "http://sampleapp.tricentis.com/101/app.php";


 @Before

public void iniciar() {
	 
	System.setProperty("webdriver.chrome.driver",
	System.getProperty("user.dir") + "/src/main/resources/chromedriver");
	driver = new ChromeDriver();
    driver.manage().window().maximize();
	actions = new PreencherFormularioActions(driver);
	
 }
  @After
  
  public void finaliza() {
	  
	 driver.quit();
  }
 
 @Dado("que estou no site da trisentes")
 public void que_estou_no_site_da_trisentes() {
     
	 driver.get(Url);
 }

 @Quando("preencho todos os campos da aba enter vehicle data")
 public void preencho_todos_os_campos_da_aba_enter_vehicle_data() {
     
	 actions.PreencherFomularioEnterVehicleDate("Honda", "100", "09/09/2020", "5", "Petrol", "1000", "ABC-0909", "200");
 }

 @Entao("aperto o botão next")
 public void aperto_o_botão_next() {
     
	 actions.clicarBotaoNext();
 }

 @Quando("que estou na aba enter insurant data")
 public void que_estou_na_aba_enter_insurant_data() {
     
	 actions.PreencherFormularioEnterInsurantDate("Carla", "Gomes", "01/01/2000", "Rua ABC, 01", "Brazil", "53012000", 
    		 "Recife", "Public Official");
 }

 @Quando("preencho todos os campos da aba enter")
 public void preencho_todos_os_campos_da_aba_enter() {
	 
	 actions.PreencherFormularioEnterProductDate("12/30/2022", "3000000", "Super Bonus", "Partial Coverage", "Yes");

 }

 @Quando("marco o botão gold")
 public void marco_o_botão_gold() {
	 
	 driver.findElement(PreencherFormularioAppObjects.SelectSilver).click();
	 driver.findElement(PreencherFormularioAppObjects.nextSelect).click();

 }

 @Quando("que estou na aba send quote")
 public void que_estou_na_aba_send_quote() {
    actions.PreencherFormularioSendQuote("teste@teste.com.br", "81999999999", "carlagomes", "123456Ab", "123456Ab"); 

 }

 @Entao("recebo a mensagem “Sending e-mail success!”")
 public void recebo_a_mensagem_sending_e_mail_success() {
	 msgValidacao = driver.findElement(By.className("/html/body/div[4]/h2")).getText();
		assertEquals("ending e-mail success!:", msgValidacao);
 }
 
}
