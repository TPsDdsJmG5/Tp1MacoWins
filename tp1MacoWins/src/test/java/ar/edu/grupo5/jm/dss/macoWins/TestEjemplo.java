package ar.edu.grupo5.jm.dss.macoWins;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEjemplo {

	public static void main(String[] args) {
		
		Prenda jean = new Prenda("Jeans Wronglord",300,new Nacional());
		Prenda jean2 = new Prenda("Jeans Wronglord",400,new Internacional());
		Prenda camisa = new Prenda("Camisa Lovis",300,new Nacional());
		Prenda saco = new Prenda("Saco",500,new Internacional());
		
		DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		
		Negocio negocio = new Negocio(100);

		negocio.realizarVenta(jean, 4);
		negocio.realizarVenta(jean2, 1);
		negocio.realizarVenta(camisa, 5);
		negocio.realizarVenta(saco, 7);
		negocio.realizarVenta(jean2, 3);
		negocio.realizarVenta(saco, 2);
		
		System.out.println("Las Ganancias del " + formatoFecha.format(new Date()) + " Son: " + negocio.gananciaEn(new Date()));
	}
	
}
