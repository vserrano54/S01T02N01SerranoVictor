package Ejercicio1;

import java.util.ArrayList;

public class Venta {
	
	private ArrayList<Producto> productos;
	private float precioTotalVenta;
	
	public Venta() {
		productos =  new ArrayList<Producto>();
	}
	
	public double getPrecioTotalVenta() {
		return precioTotalVenta;
	}

	public void setPrecioTotalVenta(float precioTotalVenta) {
		this.precioTotalVenta = precioTotalVenta;
	}

	public void listarProducto() {
		for (Producto producto : productos) {
			System.out.println(producto);
		}
	}
	
	public void agregarProducto(Producto producto) {
		
		productos.add(producto);
		
	}
	
	public float calcularTotal() {
		
		for (int i=0;i<productos.size();i++) {
			this.precioTotalVenta += productos.get(i).getPrecio();
		}
		
		return this.precioTotalVenta;
		
	}
	
	public void validarIndiceDelArreglo() throws VentaVaciaException{
		if (productos.size()<=0)
			throw new VentaVaciaException("Para hacer una venta primero debes añadir productos");
		
	}
	
	
}
