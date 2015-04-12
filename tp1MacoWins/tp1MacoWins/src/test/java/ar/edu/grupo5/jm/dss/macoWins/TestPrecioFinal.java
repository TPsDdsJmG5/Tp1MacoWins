package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrecioFinal {

	Prenda pantalon = new Prenda("Jeans Wronglord",300,new Nacional());
	Prenda pantalon2 = new Prenda("Jeans Wronglord",400,new Internacional());
	Prenda camisa = new Prenda("Camisa Lovis",300,new Nacional());
	Prenda saco = new Prenda("Saco Azul",500,new Internacional());
	
	Negocio negocio = new Negocio(100);
	
	@Test
	public void test() {
		
		assertTrue(pantalon.precioFinalEn(negocio) == 400);
		assertTrue(pantalon2.precioFinalEn(negocio) == 650);
		assertTrue(camisa.precioFinalEn(negocio) == 400);
		assertTrue(saco.precioFinalEn(negocio) == 780);
	}

}
