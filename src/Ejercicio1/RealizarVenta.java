package Ejercicio1;

import java.util.Scanner;


public class RealizarVenta {
	
	public RealizarVenta() {
		
	}
	Venta v= new Venta();
	
	
	public void Menu() {
		
		Scanner input = new Scanner(System.in);
		int opcion = 1;
		
		do {
				
			System.out.println("Menu Principal");
			System.out.println("1 - Ingresar productos para la Venta");
			System.out.println("2 - Realizar Venta e Imprimir");
			
			System.out.print("Seleccione una opcion [1,2]: ");
			opcion = input.nextInt();
			
		
		
		switch (opcion) {
		case 1: 
			
			AgregarProducto();
			
			break;
		case 2:
			VenderProductos();
			break;
		}
		
		}while(opcion==1);
		
	}
	public void AgregarProducto() {
		boolean bandera;
		boolean bandera2= true;
		String respuesta;
		String nombre="";
		float precio=0;
		int i=1;
		Scanner input = new Scanner(System.in);
			do {
				bandera=true;
				respuesta = "S";
					do {
						try {
							System.out.print("Ingrese el nombre del producto No."+i+": ");
							nombre = input.nextLine();
							if (nombre.length()>0)
								bandera=true;
							else
								bandera = false;
							
						} catch (Exception e) {
							bandera =false;
							System.out.println("Debe Ingresar un nombre para el producto: ");
							
						}
						
						//input.nextLine();
						
					} while(bandera == false);
					
					bandera = true;
					
					do {
						try {
							
							System.out.print("Ingrese el Precio del producto No."+i+": ");
							precio = input.nextFloat();
							bandera=true;
							
						} catch (Exception e) {
							bandera =false;
							System.out.println("Debe Ingresar un Valor númerico valido para el precio del producto.");
							
						}
						
						input.nextLine();
						
					} while(bandera == false);
					
					v.agregarProducto(new Producto(nombre,precio));
					i++;
					
					do {
						
						System.out.print("Desea ingresar otro producto para la venta: [S/N]: ");
						respuesta = input.nextLine();
						respuesta = respuesta.toUpperCase();
						if (respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N"))
							bandera2=true;	
						else
							bandera2= false;
					
				}while(bandera2 == false);				
					
			} while(respuesta.toUpperCase().equals("S"));
	}
	
	public void VenderProductos() {
		try {
			v.validarIndiceDelArreglo();
			
			System.out.println("Lista de productos facturados");
			v.listarProducto();
			v.calcularTotal();
			
			System.out.println("Precio total de la venta: "+v.getPrecioTotalVenta());
			
		} catch (VentaVaciaException e) {
			System.out.println("No se ha podido efectuar la venta, debido a: " + e.getMessage());
		}
	}
}
