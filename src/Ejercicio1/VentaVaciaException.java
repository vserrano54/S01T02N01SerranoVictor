package Ejercicio1;

public class VentaVaciaException extends ArrayIndexOutOfBoundsException{
	
	public static final long serialVersionUID = 700L;
	
	public VentaVaciaException(String mensaje) {
		super(mensaje);
		
	}

	
}
