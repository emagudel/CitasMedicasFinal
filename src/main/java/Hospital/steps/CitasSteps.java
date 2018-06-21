package Hospital.steps;

import org.fluentlenium.core.annotation.Page;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import Hospital.model.CargarDatos;
import Hospital.pageobjects.CitasPage;

import Util.Propiedades;
import java.util.Properties;

public class CitasSteps {

	CargarDatos data;
	Properties p = Propiedades.getPropiedades();
	String navegador = p.getProperty("webdriver.driver");

	@Page
	CitasPage pageCitas;

	@Step
	public void ingresoPortalCitas() {
		pageCitas.open();
	}
	
	@Step
	public void ingresoInformacionCitas() throws InterruptedException {
	data = Serenity.sessionVariableCalled("datos");
	
		if (data.getOrientacion().equals("Acierto")) {

			if (navegador.equals("chrome") || navegador.equals("firefox")) {
				pageCitas.menuDoctor();
			}else {
				pageCitas.menuDoctor();
				pageCitas.menuDoctor();
			}
			pageCitas.nombreDoctor(data.getNombreDoctor());
			pageCitas.apellidoDoctor(data.getApellidoDoctor());
			pageCitas.telefonoDoctor(data.getTelefonoDoctor());
			pageCitas.tipoDocDoctor(data.getTipoDocDoctor());
			pageCitas.numeroDocDoctor(data.getNumeroDocDoctor());
			pageCitas.guardar();
			pageCitas.inicio();
			
			pageCitas.menuPaciente();
			pageCitas.nombrePaciente(data.getNombrePaciente());
			pageCitas.apellidoPaciente(data.getApellidoPaciente());
			pageCitas.telefonoPaciente(data.getTelefonoPaciente());
			pageCitas.tipoDocPaciente(data.getTipoDocPaciente());
			pageCitas.numeroDocPaciente(data.getNumeroDocPaciente());
			pageCitas.guardar();
			pageCitas.inicio();
			
			pageCitas.menuCita();
			pageCitas.diaCita(data.getDiaCita());
			pageCitas.documentoPaciente(data.getNumeroDocPaciente());
			pageCitas.documentoDoctor(data.getNumeroDocDoctor());
			pageCitas.observacion(data.getObservacion());
			pageCitas.guardar();
		}
		
		if (data.getOrientacion().equals("Error")) {
			
			if (navegador.equals("chrome") || navegador.equals("firefox")) {
				pageCitas.menuCita();
			}else {
				pageCitas.menuCita();
				//pageCitas.menuCita();
				Thread.sleep(10000);
			}
			pageCitas.diaCita(data.getDiaCita());
			pageCitas.documentoPaciente(data.getNumeroDocPaciente());
			pageCitas.documentoDoctor(data.getNumeroDocDoctor());
			pageCitas.observacion(data.getObservacion());
			pageCitas.guardar();
		}
	
	}
	
	
	@Step
	public void verificarCitasExitosas(){
		pageCitas.verificarAcierto();
		
	}
	
	@Step
	public void verificarCitasConErrores(){
		pageCitas.verificarError();
		
	}
	
	
	
	
}
