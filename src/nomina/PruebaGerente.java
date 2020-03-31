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
	
	@Test
	public void esUnEmpleado() {
		
		Empleado ivana = new Gerente("Ivana");
		ivana.cambiarSueldoBruto(50_000);
		
		Assert.assertEquals(40_000, ivana.liquidarSueldo());
	}
	
	@Test
	public void esUnEmpleadoConViaticos() {
		
		Gerente gerenteDeCompras = new Gerente("Ivana"); 
		gerenteDeCompras.asignarViaticos(5_000);

		Empleado ivana = gerenteDeCompras;
		ivana.cambiarSueldoBruto(50_000);
		
		Assert.assertEquals(45_000, ivana.liquidarSueldo());
	}

	@Test
	public void esUnEmpleadoPeroNoDejaDeSerGerente() {
		
		Empleado ivana = new Gerente("Ivana");
		ivana.cambiarSueldoBruto(50_000);

		Gerente gerenteDeCompras = (Gerente) ivana;
		gerenteDeCompras.asignarViaticos(5_000);
		
		Assert.assertEquals(45_000, ivana.liquidarSueldo());
	}
	
	@Test(expected = ClassCastException.class)
	public void noEsUnDirector() {
		
		Empleado ivana = new Gerente("Ivana");
		ivana.cambiarSueldoBruto(50_000);

		Director directorDeCompras = (Director) ivana; // ClassCastException
	}
	
	@Test
	public void esUnEmpleadoYTambienUnGerente() {
		
		Empleado ivana = new Gerente("Ivana");
		ivana.cambiarSueldoBruto(50_000);

		((Gerente) ivana).asignarViaticos(5_000);
		
		Assert.assertEquals(45_000, ivana.liquidarSueldo());
	}
	
	@Test(expected = ClassCastException.class)
	public void noPuedoInvocarMetodosDeDirector() {
		
		Empleado ivana = new Gerente("Ivana");
		ivana.cambiarSueldoBruto(50_000);

		((Director) ivana).cumplioObjetivos();
	}

	@Test
	public void esUnEmpleadoGerente() {
		
		Empleado ivana = new Gerente("Ivana");

		Assert.assertTrue(ivana instanceof Empleado);
		Assert.assertTrue(ivana instanceof Gerente);
	}
	
	@Test
	public void noEsUnDirectorNiUnOperario() {
		
		Empleado ivana = new Gerente("Ivana");

		Assert.assertFalse(ivana instanceof Operario);
		Assert.assertFalse(ivana instanceof Director);
	}
	
	@Test
	public void esUnObject() {
		
		Object objeto = new Gerente("Ivana");
		
		Assert.assertTrue(objeto instanceof Gerente);
	}
}
