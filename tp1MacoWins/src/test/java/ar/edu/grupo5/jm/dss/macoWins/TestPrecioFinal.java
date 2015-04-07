package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPrecioFinal {
	Prenda jean = new Prenda("Jeans Wronglord",300,new Nacional());
	Prenda jean2 = new Prenda("Jeans Wronglord",400,new Internacional());
	Prenda camisa = new Prenda("Camisa Lovis",300,new Nacional());
	Prenda saco = new Prenda("Saco",500,new Internacional());
	
	Negocio negocio = new Negocio(100);
	
	@Test
	public void test() {
		
		assertTrue(jean.precioFinalEn(negocio) == 300);
		assertTrue(jean2.precioFinalEn(negocio) == 650);
		assertTrue(camisa.precioFinalEn(negocio) == 400);
		assertTrue(saco.precioFinalEn(negocio) == 780);
	}

}
