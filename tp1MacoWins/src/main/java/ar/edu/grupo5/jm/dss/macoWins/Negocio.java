package ar.edu.grupo5.jm.dss.macoWins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.Date;

public class Negocio {

	private float valorFijo;
	private Collection<Venta> ventas = new ArrayList<Venta>();
	
	public Negocio(float unValorFijo) {
		valorFijo = unValorFijo;
	}
	
	public int gananciaEn(Date unaFecha) {
		return this.ventasEn(unaFecha).stream().mapToInt(venta -> (int) venta.gananciaEn(this)).sum();
	}
	
	private Collection<Venta> ventasEn(Date unaFecha) {
		return ventas.stream().filter(venta -> venta.esDeFecha(unaFecha)).collect(Collectors.toList());
	}
	
	public float getValorFijo() {
		return valorFijo;
	}
	
	public void realizarVenta(Prenda unaPrenda,int unaCantidad) {
		ventas.add(new Venta(unaPrenda,unaCantidad,new Date()));
	}
	
	
}
