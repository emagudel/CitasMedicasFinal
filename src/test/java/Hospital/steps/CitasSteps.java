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
	public void ingresoInformacionCitas() {
	data = Serenity.sessionVariableCalled("datos");
	
		if (data.getOrientacion().equals("Acierto")) {

			if (navegador.equals("chrome")) {
				pageCitas.MenuDoctor();
			}else {
				pageCitas.MenuDoctor();
				pageCitas.MenuDoctor();
			}
			pageCitas.NombreDoctor(data.getNombreDoctor());
			pageCitas.ApellidoDoctor(data.getApellidoDoctor());
			pageCitas.TelefonoDoctor(data.getTelefonoDoctor());
			pageCitas.TipoDocDoctor(data.getTipoDocDoctor());
			pageCitas.NumeroDocDoctor(data.getNumeroDocDoctor());
			pageCitas.Guardar();
			pageCitas.Inicio();
			
			pageCitas.MenuPaciente();
			pageCitas.NombrePaciente(data.getNombrePaciente());
			pageCitas.ApellidoPaciente(data.getApellidoPaciente());
			pageCitas.TelefonoPaciente(data.getTelefonoPaciente());
			pageCitas.TipoDocPaciente(data.getTipoDocPaciente());
			pageCitas.NumeroDocPaciente(data.getNumeroDocPaciente());
			pageCitas.Guardar();
			pageCitas.Inicio();
			
			pageCitas.MenuCita();
			pageCitas.DiaCita(data.getDiaCita());
			pageCitas.DocumentoPaciente(data.getNumeroDocPaciente());
			pageCitas.DocumentoDoctor(data.getNumeroDocDoctor());
			pageCitas.Observacion(data.getObservacion());
			pageCitas.Guardar();
		}
		
		if (data.getOrientacion().equals("Error")) {
			
			if (navegador.equals("chrome")) {
				pageCitas.MenuCita();
			}else {
				pageCitas.MenuCita();
				pageCitas.MenuCita();
			}
			pageCitas.DiaCita(data.getDiaCita());
			pageCitas.DocumentoPaciente(data.getNumeroDocPaciente());
			pageCitas.DocumentoDoctor(data.getNumeroDocDoctor());
			pageCitas.Observacion(data.getObservacion());
			pageCitas.Guardar();
		}
	
	}
	
	
	@Step
	public void VerificarCitasExitosas(){
		pageCitas.verificarAcierto();
		
	}
	
	@Step
	public void VerificarCitasConErrores(){
		pageCitas.verificarError();
		
	}
	
	
	
	
}
