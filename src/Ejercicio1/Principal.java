package Ejercicio1;

import java.util.Scanner;

public class Principal {
	
	
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		boolean bandera = true;
		String opcion="N";
		
		RealizarVenta vender = new RealizarVenta();
		
		
		do {
			vender.Menu();
			
			System.out.print("Desea realizar otra venta [S/N]: ");
			opcion = input.nextLine();
			
			if (opcion.equalsIgnoreCase("S") || opcion.equalsIgnoreCase("N")) {
				bandera=true;
				//vender.Menu();
			}
						
			else
				bandera= false;
			
			if (opcion.equalsIgnoreCase("S"))
				vender = new RealizarVenta();
					
		}while(bandera == true && opcion.equalsIgnoreCase("S"));
		
		System.out.println("Fin del Programa");
			
			
		}
		
}
	
