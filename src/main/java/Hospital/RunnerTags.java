package Hospital;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features/CitasMedicas.feature", tags = "@CasoExitoso")
@CucumberOptions(features = "src/test/resources/features/CitasMedicas.feature", tags = "@CasoFallido")
public class RunnerTags {
}
