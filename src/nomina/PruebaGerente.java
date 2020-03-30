package nomina;

import org.junit.Assert;
import org.junit.Test;

public class PruebaGerente {

	@Test(expected = Error.class)
	public void noSePudenAsignarViaticosNegativos() {
		
		Gerente gerente = new Gerente("Laura");
		
		gerente.asignarViaticos(-1);
	}
	
	@Test
	public void liquidarConSueldoBrutoDe60KConViatosDe10K() {
		
		Gerente gerente = new Gerente("Martin");
		
		gerente.cambiarSueldoBruto(60_000);
		gerente.asignarViaticos(10_000);
		
		Assert.assertEquals(58_000, gerente.liquidarSueldo());
	}
}
