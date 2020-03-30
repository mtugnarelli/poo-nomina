package nomina;

import org.junit.Assert;
import org.junit.Test;

public class PruebaEmpleado {

	@Test
	public void crearConElNombreSinSueldo() {
		
		Empleado empleado = new Empleado("Gabriel");
		
		Assert.assertEquals("Gabriel", empleado.obtenerNombre());
		Assert.assertEquals(0, empleado.liquidarSueldo());
	}
	
	@Test
	public void liquidarConSueldoBrutoDe40K() {
		
		Empleado empleado = new Empleado("Ivana");
		
		empleado.cambiarSueldoBruto(40_000);
		
		Assert.assertEquals(32_000, empleado.liquidarSueldo());
	}
	
	@Test(expected = Error.class)
	public void noSePuedeAsignarUnSueldoBrutoMenorACero() {
		
		Empleado empleado = new Empleado("Maxi");
		
		empleado.cambiarSueldoBruto(-1);
	}
}
