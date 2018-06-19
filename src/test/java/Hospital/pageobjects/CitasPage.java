package Hospital.pageobjects;

import static org.junit.Assert.assertTrue;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import Hospital.model.CargarDatos;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/eagudelo/")

public class CitasPage extends PageObject {	
	
		//Objetos del menu
		//@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[1]")
		//@FindBy(xpath="//A[@href='addDoctor']")
		@FindBy(xpath="(//I[@class='fa fa-arrow-circle-right pull-right text-success'])[1]")
		public WebElement MenuDoctor;

		
		//@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[2]")
		//@FindBy(xpath="//A[@href='addPatient']")
		@FindBy(xpath="(//I[@class='fa fa-arrow-circle-right pull-right text-success'])[2]")
		public WebElement MenuPaciente;

		
		//@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[6]")
		//@FindBy(xpath="//A[@href='appointmentScheduling']")
		@FindBy(xpath="(//I[@class='fa fa-arrow-circle-right pull-right text-success'])[6]")
		public WebElement MenuCita;

		
		//Objetos del doctor
		@FindBy(id="name")
		public WebElementFacade txtNombreDoc;
		
		@FindBy(id="last_name")
		public WebElementFacade txtApellidoDoc;
		
		@FindBy(id="telephone")
		public WebElementFacade txtTelefonoDoc;
		
		@FindBy(id="identification_type")
		public WebElementFacade txtTipoDocDoc;
		
		@FindBy(id="identification")
		public WebElementFacade txtNumDocDoc;
		
		//Objetos del paciente
		@FindBy(name="name")
		public WebElementFacade txtNombrePac;
		
		@FindBy(name="last_name")
		public WebElementFacade txtApellidoPac;
		
		@FindBy(name="telephone")
		public WebElementFacade txtTelefonoPac;
		
		@FindBy(name="identification_type")
		public WebElementFacade txtTipoDocPac;
		
		@FindBy(name="identification")
		public WebElementFacade txtNumoDocPac;
		
		//Objetos de la cita
		@FindBy(xpath="//*[@id='datepicker']")
		public WebElementFacade txtDiaCita;
		
		@FindBy(xpath="//*[@id='page-wrapper']/div/div[3]/div/div[2]/input")
		public WebElementFacade txtDocumentoPaciente;
		
		@FindBy(xpath="//*[@id='page-wrapper']/div/div[3]/div/div[3]/input")
		public WebElementFacade txtDocumentoDoctor;
		
		@FindBy(xpath="//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea")
		public WebElementFacade txtObservacion;
		
		//Objetos de los botones
		@FindBy(xpath="//*[@id='page-wrapper']/div/div[3]/div/a")
		public WebElementFacade btnGuardar;
		
		@FindBy(xpath="//*[@id='wrapper']/nav/div/a")
		public WebElementFacade btnInicio;
		
		//mensajes de acierto y error
		@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]/div[2]/p")
		public WebElementFacade msgAcierto;
		
		@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]/div[2]/p/span[1]")
		public WebElementFacade msgError;
		
		
		
		public void NombreDoctor(String datoPrueba) {
			txtNombreDoc.click();
			txtNombreDoc.clear();
			txtNombreDoc.sendKeys(datoPrueba);
		}
		public void ApellidoDoctor(String datoPrueba) {
			txtApellidoDoc.click();
			txtApellidoDoc.clear();
			txtApellidoDoc.sendKeys(datoPrueba);
		}
		public void TelefonoDoctor(String datoPrueba) {
			txtTelefonoDoc.click();
			txtTelefonoDoc.clear();
			txtTelefonoDoc.sendKeys(datoPrueba);
		}
		public void TipoDocDoctor(String datoPrueba) {
			txtTipoDocDoc.click();
			txtTipoDocDoc.selectByVisibleText(datoPrueba);
		}
		public void NumeroDocDoctor(String datoPrueba) {
			txtNumDocDoc.click();
			txtNumDocDoc.clear();
			txtNumDocDoc.sendKeys(datoPrueba);
		}
		//********************************************************************************
		public void NombrePaciente(String datoPrueba) {
			txtNombrePac.click();
			txtNombrePac.clear();
			txtNombrePac.sendKeys(datoPrueba);
		}
		public void ApellidoPaciente(String datoPrueba) {
			txtApellidoPac.click();
			txtApellidoPac.clear();
			txtApellidoPac.sendKeys(datoPrueba);
		}
		public void TelefonoPaciente(String datoPrueba) {
			txtTelefonoPac.click();
			txtTelefonoPac.clear();
			txtTelefonoPac.sendKeys(datoPrueba);
		}
		public void TipoDocPaciente(String datoPrueba) {
			txtTipoDocPac.click();
			txtTipoDocPac.selectByVisibleText(datoPrueba);
		}
		public void NumeroDocPaciente(String datoPrueba) {
			txtNumoDocPac.click();
			txtNumoDocPac.clear();
			txtNumoDocPac.sendKeys(datoPrueba);
		}
		//********************************************************************************	
		public void DiaCita(String datoPrueba) {
			txtDiaCita.click();
			txtDiaCita.sendKeys(datoPrueba);
			txtDiaCita.sendKeys(Keys.ENTER);
		}
		public void DocumentoPaciente(String datoPrueba) {
			txtDocumentoPaciente.click();
			txtDocumentoPaciente.clear();
			txtDocumentoPaciente.sendKeys(datoPrueba);
		}
		public void DocumentoDoctor(String datoPrueba) {
			txtDocumentoDoctor.click();
			txtDocumentoDoctor.clear();
			txtDocumentoDoctor.sendKeys(datoPrueba);
		}
		public void Observacion(String datoPrueba) {
			txtObservacion.click();
			txtObservacion.clear();
			txtObservacion.sendKeys(datoPrueba);
		}
		
		public void Guardar() {
			btnGuardar.click();
		}
		
		public void Inicio() {
			btnInicio.click();
		}
		
		public void MenuDoctor() {
			MenuDoctor.click();
		}
		
		public void MenuPaciente() {
			MenuPaciente.click();
		}
		
		public void MenuCita() {
			MenuCita.click();
		}

		public void verificarAcierto() {
			CargarDatos data;
			data = Serenity.sessionVariableCalled("datos");
			boolean result = false;
			String mensajeOK = msgAcierto.getText();
			String mensajeDataOk = data.getResultadoEsperado();
			if (mensajeOK.contains(mensajeDataOk)) {
				result = true;
			}
			assertTrue("Verificacion exitosa", result);
		}
		
		public void verificarError() {
			CargarDatos data;
			data = Serenity.sessionVariableCalled("datos");
			boolean result = false;
			String mensajeERR = msgAcierto.getText();
			String mensajeDataErr = data.getResultadoEsperado();
			if (mensajeERR.contains(mensajeDataErr)) {
				result = true;
			}
			assertTrue("Verificacion exitosa", result);
		}
		
}
