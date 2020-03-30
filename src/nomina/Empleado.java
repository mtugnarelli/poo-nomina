package nomina;

public class Empleado {

	private String nombre;
	
	private int sueldo;
	
	public Empleado(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String obtenerNombre() {
		
		return nombre;
	}
	
	public void cambiarSueldoBruto(int nuevoSueldo) {
		
		validarMonto(nuevoSueldo);
		sueldo = nuevoSueldo;
	}
	
	public int liquidarSueldo() {
		
		return (int) (sueldo * 0.8);
	}
	
	protected void validarMonto(int monto) {

		if (monto < 0) {
			throw new Error("Monto inválido, debe ser mayor a cero");
		}
	}
}
