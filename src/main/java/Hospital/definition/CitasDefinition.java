package Hospital.definition;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import Hospital.model.CargarDatos;
import Hospital.steps.CitasSteps;

public class CitasDefinition {

	@Steps
	CargarDatos stepModelCargarDatos;
	@Steps
	CitasSteps stepCitas;
	
	
	@Given("^Ingreso a la funcionalidad de agendar citas del hospital$")
	public void ingreso_a_la_funcionalidad_de_agendar_citas_del_hospital() {
		stepCitas.ingresoPortalCitas();
	}


	@When("^Diligencio el formulario de agendamiento de citas medicas$")
	public void diligencio_el_formulario_de_agendamiento_de_citas_medicas(List<CargarDatos> listData) throws InterruptedException {
		CargarDatos cargarDatos = listData.get(0);
		Serenity.setSessionVariable("datos").to(cargarDatos);
		stepCitas.ingresoInformacionCitas();
	}

	@Then("^Verifico que las citas se agendaron exitosamente$")
	public void verifico_que_las_citas_se_agendaron_exitosamente() {
		stepCitas.verificarCitasExitosas();
	}
	
	@Then("^Verifico que las citas se agendaron con errores$")
	public void Verifico_que_las_citas_se_agendaron_con_errores() {
		stepCitas.verificarCitasConErrores();
	}
	
}
