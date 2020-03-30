package nomina;

public class Nomina {

	private Empleado[] empleados;
	private int cantidadDeEmpleados;
	
	public Nomina(int tamanio) {
		
		empleados = new Empleado[tamanio];
		cantidadDeEmpleados = 0;
	}
	
	public void agregar(Empleado unEmpleado) {

		if (cantidadDeEmpleados >= empleados.length) {
			throw new Error("La nómina está completa");
		}
		
		empleados[cantidadDeEmpleados] = unEmpleado;
		cantidadDeEmpleados++;
	}
	
	public int promediarSueldos() {
		
		int total = 0;
		for (int i = 0; i < cantidadDeEmpleados; i++) {
			
			Empleado unEmpleado = empleados[i]; 
			total += unEmpleado.liquidarSueldo();
		}
		
		return (total / cantidadDeEmpleados);
	}
}
