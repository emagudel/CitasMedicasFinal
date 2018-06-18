@Regresion
Feature: Verificar el funcionamiento del agendamiento de las citas medicas
  El sistema de agendamiento de las citas se realiza a travez del sistema de administracion de hospitales

  @CasoExitoso
  Scenario Outline: Deligenciamiento exitoso de las citas medicas
    Given Ingreso a la funcionalidad de agendar citas del hospital
    When Diligencio el formulario de agendamiento de citas medicas
		|orientacion		|nombreDoctor		|apellidoDoctor		|telefonoDoctor		|tipoDocDoctor	  |numeroDocDoctor		|nombrePaciente		|apellidoPaciente		|telefonoPaciente		|tipoDocPaciente	  |numeroDocPaciente		|diaCita	  |observacion		|resultadoEsperado	|
    |<orientacion>	|<nombreDoctor>	|<apellidoDoctor>	|<telefonoDoctor>	|<tipoDocDoctor>	|<numeroDocDoctor>	|<nombrePaciente>	|<apellidoPaciente>	|<telefonoPaciente>	|<tipoDocPaciente>	|<numeroDocPaciente>	|<diaCita>	|<observacion>	|<resultadoEsperado>|
    Then Verifico que las citas se agendaron exitosamente
    
	Examples: 
	|orientacion	|nombreDoctor	|apellidoDoctor	|telefonoDoctor	|tipoDocDoctor	      |numeroDocDoctor	|nombrePaciente	|apellidoPaciente	|telefonoPaciente	|tipoDocPaciente	    |numeroDocPaciente	|diaCita	  |observacion	|resultadoEsperado|
	|Acierto	    |Sofia	      |Gomez	        |4051233	      |Cédula de ciudadanía	|45100100	        |Jose	          |Lopez	          |3004005001	      |Cédula de ciudadanía	|73111111	          |06/20/2018	|Cita urgente	|Datos guardados correctamente.|
	
	
	 @CasoFallido
  Scenario Outline: Deligenciamiento con errores de las citas medicas
    Given Ingreso a la funcionalidad de agendar citas del hospital
    When Diligencio el formulario de agendamiento de citas medicas
		|orientacion		|nombreDoctor		|apellidoDoctor		|telefonoDoctor		|tipoDocDoctor	  |numeroDocDoctor		|nombrePaciente		|apellidoPaciente		|telefonoPaciente		|tipoDocPaciente	  |numeroDocPaciente		|diaCita	  |observacion		|resultadoEsperado	|
    |<orientacion>	|<nombreDoctor>	|<apellidoDoctor>	|<telefonoDoctor>	|<tipoDocDoctor>	|<numeroDocDoctor>	|<nombrePaciente>	|<apellidoPaciente>	|<telefonoPaciente>	|<tipoDocPaciente>	|<numeroDocPaciente>	|<diaCita>	|<observacion>	|<resultadoEsperado>|
    Then Verifico que las citas se agendaron con errores
    
	Examples: 
	|orientacion	|nombreDoctor	|apellidoDoctor	|telefonoDoctor	|tipoDocDoctor	      |numeroDocDoctor	|nombrePaciente	|apellidoPaciente	|telefonoPaciente	|tipoDocPaciente	    |numeroDocPaciente	|diaCita	  |observacion	|resultadoEsperado|
	|Error	      |Sofia	      |Gomez	        |4051233	      |Cédula de ciudadanía	|90     	        |Jose	          |Lopez	          |3004005001	      |Cédula de ciudadanía	|73111111	          |06/20/2018	|Cita urgente	|Datos guardados correctamente.|