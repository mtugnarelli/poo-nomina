package nomina;

import org.junit.Assert;
import org.junit.Test;

public class PruebaDirector {

	@Test
	public void liquidarConSueldoBrutoDe80KConViatosDe20KCumpliendoObjetivosConBonoDe10() {
		
		Director director = new Director("Lucas", 0.10);
		
		director.cambiarSueldoBruto(80_000);
		director.asignarViaticos(20_000);
		director.cumplioObjetivos();
		
		Assert.assertEquals(92_400, director.liquidarSueldo());
	}

	@Test
	public void liquidarConSueldoBrutoDe80KConViatosDe20KSinCumplirObjetivos() {
		
		Director director = new Director("Lucas", 0.10);
		
		director.cambiarSueldoBruto(80_000);
		director.asignarViaticos(20_000);
		
		Assert.assertEquals(84_000, director.liquidarSueldo());
	}

}
