package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestGananciaPorFecha {

	Pantalon pantalonFeo = new Pantalon(200, new Nacional(), new Sarkany());
	Pantalon pantalonNoTanFeo = new Pantalon(220, new Internacional(), new Armani());
	Camisa camisaLovis = new Camisa(new Nacional(), new Sarkany());
	Saco sacoAzul = new Saco(15, new Nacional(), new Armani());
	Zapatos zapatoFino = new Zapatos(40, new Nacional(), new Sarkany());
	Sombrero galeraLoca = new Sombrero(100.5, new Internacional(), new Armani());
	
	Negocio negocio = new Negocio(100);
		
	@Test
	public void test() {

		negocio.realizarVenta(pantalonFeo, 2, LocalDate.parse("2015-04-02"));
		negocio.realizarVenta(camisaLovis, 3, LocalDate.parse("2015-04-02"));
		negocio.realizarVenta(sacoAzul, 1, LocalDate.parse("2015-04-02"));
		negocio.realizarVenta(galeraLoca, 5, LocalDate.parse("2015-04-02"));
		
		assertTrue(negocio.gananciaEn(LocalDate.parse("2015-04-02")) == 7141.6125 );

	}
}
