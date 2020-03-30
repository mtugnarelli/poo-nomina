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
}
