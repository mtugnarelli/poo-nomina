package nomina;

import org.junit.Assert;
import org.junit.Test;

public class PruebaOperario {

	@Test
	public void liquidarConSueldoBrutoDe40KCon10HorasExtrasPor500() {
		
		Operario operario = new Operario("Ricardo", 500);
		
		operario.cambiarSueldoBruto(40_000);
		operario.asignarHorasExtras(10);
		
		Assert.assertEquals(37_000, operario.liquidarSueldo());
	}
}
