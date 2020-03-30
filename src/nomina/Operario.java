package nomina;

public class Operario extends Empleado {

	private int valorHoraExtra;
	private int cantidadHorasExtras;
	
	public Operario(String nombre, int valorHoraExtra) {

		super(nombre);
		
		validarMonto(valorHoraExtra);
		
		this.valorHoraExtra = valorHoraExtra;
		this.cantidadHorasExtras = 0;
	}

	public void asignarHorasExtras(int horas) {
		
		cantidadHorasExtras = horas;
	}
	
	@Override
	public int liquidarSueldo() {
		
		int neto = super.liquidarSueldo();
		
		int extras = valorHoraExtra * cantidadHorasExtras;
		
		return neto + extras;
	}
}
