package ar.edu.grupo5.jm.dss.macoWins;

import java.time.LocalDate;

public class Venta {

	private Prenda prenda;
	private int cantidad;
	private LocalDate fecha;
	
	public Venta(Prenda unaPrenda, int unaCantidad, LocalDate unaFecha) {
		prenda = unaPrenda;
		cantidad = unaCantidad;
		fecha = unaFecha;
	}
	
	public double gananciaEn(Negocio unNegocio) {
		return (prenda.precioFinalEn(unNegocio) * cantidad);
	}
	
	public boolean esDeFecha(LocalDate unaFecha) {
		return fecha.equals(unaFecha);
	}
	
}
