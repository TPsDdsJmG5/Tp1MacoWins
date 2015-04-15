package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPrecioFinal {

	Pantalon pantalonFeo = new Pantalon(200, new Nacional(), new Sarkany());
	Pantalon pantalonNoTanFeo = new Pantalon(220, new Internacional(), new Sarkany());
	Camisa camisaLovis = new Camisa(new Nacional(), new Sarkany());
	Saco sacoAzul = new Saco(15, new Nacional(), new Armani());
	Zapatos zapatoFino = new Zapatos(40, new Nacional(), new Armani());
	Sombrero galeraLoca = new Sombrero(100.5, new Internacional(), new Armani());
	
	Negocio negocio = new Negocio(100);
	
			
	@Test
	public void test() {
		
		assertTrue(pantalonFeo.precioFinalEn(negocio) == 742.5);
		assertTrue(pantalonNoTanFeo.precioFinalEn(negocio) == 1000.35);
		assertTrue(camisaLovis.precioFinalEn(negocio) == 330);
		assertTrue(sacoAzul.precioFinalEn(negocio) == 907.5);
		assertTrue(zapatoFino.precioFinalEn(negocio) == 1155);
		assertTrue(galeraLoca.precioFinalEn(negocio) == 751.8225);
	
	}

}
