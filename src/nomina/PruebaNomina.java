package nomina;

import org.junit.Assert;
import org.junit.Test;

public class PruebaNomina {

	private Nomina nomina = new Nomina(5);

	@Test
	public void promediarSueldosConUnUnicoEmpleado() {
		
		Empleado empleado = new Empleado("Sebastián");
		empleado.cambiarSueldoBruto(50_000);

		nomina.agregar(empleado);
		
		Assert.assertEquals(40_000, nomina.promediarSueldos());
	}
	
	@Test
	public void promediarSueldosConTresEmpleados() {
		
		Empleado cajero = new Empleado("Santiago");
		cajero.cambiarSueldoBruto(30_000);
		nomina.agregar(cajero);
		
		Empleado vendedora = new Empleado("Victoria");
		vendedora.cambiarSueldoBruto(35_000);
		nomina.agregar(vendedora);

		Empleado administradora = new Empleado("Natalia");
		administradora.cambiarSueldoBruto(50_000);
		nomina.agregar(administradora);

		Assert.assertEquals(30_666, nomina.promediarSueldos());
	}
	
	@Test
	public void agregarUnGerente() {
		
		Empleado claudio = new Gerente("Claudio");
		claudio.cambiarSueldoBruto(60_000);
		
		nomina.agregar(claudio);
		
		Assert.assertEquals(48_000, nomina.promediarSueldos());
	}
	
	@Test
	public void agregarUnGerenteConViaticos() {
		
		Gerente claudio = new Gerente("Claudio");
		claudio.cambiarSueldoBruto(100_000);
		claudio.asignarViaticos(10_000);
		
		nomina.agregar(claudio);
		
		Assert.assertEquals(90_000, nomina.promediarSueldos());
	}
	
	@Test
	public void agregarUnEmpleadoConUnGerenteYUnDirector() {
		
		Empleado nicolas = new Empleado("Nicolas");
		nicolas.cambiarSueldoBruto(30_000);

		nomina.agregar(nicolas);
		
		Gerente natalia = new Gerente("Natalia");
		natalia.cambiarSueldoBruto(100_000);
		natalia.asignarViaticos(10_000);
		
		nomina.agregar(natalia);
		
		Assert.assertEquals(57_000, nomina.promediarSueldos());
	}
	
	@Test
	public void promediarSueldosDeUnEmpleadosUnGerenteYUnDirector() {
		
		Empleado santiago = new Empleado("Santiago");
		santiago.cambiarSueldoBruto(30_000);
		
		nomina.agregar(santiago);
		
		Gerente victoria = new Gerente("Victoria");
		victoria.cambiarSueldoBruto(35_000);
		victoria.asignarViaticos(5_000);
		
		nomina.agregar(victoria);

		Director natalia = new Director("Natalia", 0.5);
		natalia.cambiarSueldoBruto(50_000);
		natalia.cumplioObjetivos();
		
		nomina.agregar(natalia);

		Assert.assertEquals(39_000, nomina.promediarSueldos());
	}
}
