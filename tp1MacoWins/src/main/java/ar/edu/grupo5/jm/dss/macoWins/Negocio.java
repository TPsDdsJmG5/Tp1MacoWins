package ar.edu.grupo5.jm.dss.macoWins;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Negocio {

	private double valorFijo;
	private Collection<Venta> ventas = new ArrayList<Venta>();
	
	public Negocio(double unValorFijo) {
		valorFijo = unValorFijo;
	}
	public double getValorFijo() {
		return valorFijo;
	}
	 
	public double gananciaEn(LocalDate unaFecha){
		return listadoGananciasEn(unaFecha).sum();
	}
	private Stream<Venta> ventasEn(LocalDate unaFecha){
		return ventas.stream().filter(unaVenta -> unaVenta.esDeFecha(unaFecha));
	}
	private DoubleStream listadoGananciasEn(LocalDate unaFecha){
		return ventasEn(unaFecha).mapToDouble(unaVenta -> unaVenta.gananciaEn(this));
	}
	public void realizarVenta(Prenda unaPrenda,int unaCantidad,LocalDate unaFecha) {
		ventas.add(new Venta(unaPrenda,unaCantidad,unaFecha));
	}
}
