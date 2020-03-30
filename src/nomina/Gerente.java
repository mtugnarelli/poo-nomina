package nomina;

public class Gerente extends Empleado {

	private int viaticos;
	
	public Gerente(String nombre) {
	
		super(nombre);
	}

	public void asignarViaticos(int monto) {
	
		validarMonto(monto);
		viaticos = monto;
	}
	
	@Override
	public int liquidarSueldo() {

		int neto = super.liquidarSueldo();
		
		return (neto + viaticos);
	}
}
