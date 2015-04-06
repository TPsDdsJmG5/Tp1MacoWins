package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestGananciaPorFecha {

	Prenda jean = new Prenda("Jeans Wronglord",300,new Nacional());
	Prenda jean2 = new Prenda("Jeans Wronglord",400,new Internacional());
	Prenda camisa = new Prenda("Camisa Lovis",300,new Nacional());
	Prenda saco = new Prenda("Saco",500,new Internacional());
	
	Negocio negocio = new Negocio(100);
	
	@Test
	public void test() {

		negocio.realizarVenta(jean, 2);
		assertTrue(negocio.gananciaEn(LocalDate.now()) == 800);
	}
}
