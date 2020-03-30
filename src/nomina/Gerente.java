package nomina;

public class Gerente extends Empleado {

	private int viaticos;
	
	public Gerente(String nombre) {
	
		super(nombre);
	}

	public void asignarViaticos(int monto) {
		
		viaticos = monto;
	}
}
