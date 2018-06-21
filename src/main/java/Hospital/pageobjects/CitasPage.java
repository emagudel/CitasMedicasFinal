package Hospital.pageobjects;

import static org.junit.Assert.assertTrue;

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
		public WebElement menuDoctor;

		
		//@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[2]")
		//@FindBy(xpath="//A[@href='addPatient']")
		@FindBy(xpath="(//I[@class='fa fa-arrow-circle-right pull-right text-success'])[2]")
		public WebElement menuPaciente;

		
		//@FindBy(xpath="//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[6]")
		//@FindBy(xpath="//A[@href='appointmentScheduling']")
		@FindBy(xpath="(//I[@class='fa fa-arrow-circle-right pull-right text-success'])[6]")
		public WebElement menuCita;

		
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
		
		
		
		public void nombreDoctor(String datoPrueba) {
			txtNombreDoc.clear();
			txtNombreDoc.sendKeys(datoPrueba);
		}
		public void apellidoDoctor(String datoPrueba) {
			txtApellidoDoc.clear();
			txtApellidoDoc.sendKeys(datoPrueba);
		}
		public void telefonoDoctor(String datoPrueba) {
			txtTelefonoDoc.clear();
			txtTelefonoDoc.sendKeys(datoPrueba);
		}
		public void tipoDocDoctor(String datoPrueba) {
			txtTipoDocDoc.selectByVisibleText(datoPrueba);
		}
		public void numeroDocDoctor(String datoPrueba) {
			txtNumDocDoc.clear();
			txtNumDocDoc.sendKeys(datoPrueba);
		}
		//********************************************************************************
		public void nombrePaciente(String datoPrueba) {
			txtNombrePac.clear();
			txtNombrePac.sendKeys(datoPrueba);
		}
		public void apellidoPaciente(String datoPrueba) {
			txtApellidoPac.clear();
			txtApellidoPac.sendKeys(datoPrueba);
		}
		public void telefonoPaciente(String datoPrueba) {
			txtTelefonoPac.clear();
			txtTelefonoPac.sendKeys(datoPrueba);
		}
		public void tipoDocPaciente(String datoPrueba) {
			txtTipoDocPac.selectByVisibleText(datoPrueba);
		}
		public void numeroDocPaciente(String datoPrueba) {
			txtNumoDocPac.clear();
			txtNumoDocPac.sendKeys(datoPrueba);
		}
		//********************************************************************************	
		public void diaCita(String datoPrueba) {
			txtDiaCita.click();
			txtDiaCita.sendKeys(datoPrueba);
			txtDiaCita.sendKeys(Keys.ENTER);
		}
		public void documentoPaciente(String datoPrueba) {
			txtDocumentoPaciente.clear();
			txtDocumentoPaciente.sendKeys(datoPrueba);
		}
		public void documentoDoctor(String datoPrueba) {
			txtDocumentoDoctor.clear();
			txtDocumentoDoctor.sendKeys(datoPrueba);
		}
		public void observacion(String datoPrueba) {
			txtObservacion.clear();
			txtObservacion.sendKeys(datoPrueba);
		}
		
		public void guardar() {
			btnGuardar.click();
		}
		
		public void inicio() {
			btnInicio.click();
		}
		
		public void menuDoctor() {
			menuDoctor.click();
		}
		
		public void menuPaciente() {
			menuPaciente.click();
		}
		
		public void menuCita() {
			menuCita.click();
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
