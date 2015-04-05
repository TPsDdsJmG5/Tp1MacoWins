package ar.edu.grupo5.jm.dss.macoWins;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Venta {

	private Prenda prenda;
	private int cantidad;
	private Date fecha;
	
	private DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	
	public Venta(Prenda unaPrenda, int unaCantidad, Date unaFecha) {
		prenda = unaPrenda;
		cantidad = unaCantidad;
		fecha = unaFecha;
	}
	
	public float gananciaEn(Negocio unNegocio) {
		return prenda.precioFinalEn(unNegocio)*cantidad;
	}
	
	public boolean esDeFecha(Date unaFecha) {
		return formatoFecha.format(fecha).equals(formatoFecha.format(unaFecha));
	}
	
}
