package nomina;

public class Director extends Gerente {

	private boolean aplicaBono;
	private double bono;
	
	public Director(String nombre, double bono) {

		super(nombre);
		this.bono = bono;
		this.aplicaBono = false;
	}

	public void cumplioObjetivos() {
		
		aplicaBono = true;
	}
	
	@Override
	public int liquidarSueldo() {
	
		int sueldo = super.liquidarSueldo(); 
		
		if (aplicaBono) {
			
			sueldo += (sueldo * bono);
		}

		return sueldo;
	}
}
