package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class NegocioTest {
	
	private Pantalon pantalonFeo;
	private Camisa camisaNoTanFea;
	private Saco sacoLoco;
	private Zapato zapatito;
	private Sombrero sombrerito;
	private Negocio negocio;

	@Before
	public void Setup(){
		pantalonFeo = new Pantalon(200, new Nacional(), new Sarkany());
		camisaNoTanFea = new Camisa(new Nacional(), new Sarkany());
		sacoLoco = new Saco(15, new Nacional(), new Armani());
		zapatito = new Zapato(25, new Nacional(), new Sarkany());
		sombrerito = new Sombrero(175, new Internacional(), new Armani());		

		negocio = new Negocio(100);
		}
	
		
	@Test
	public void test() {

		negocio.realizarVenta(pantalonFeo, 2, LocalDate.parse("2015-04-02"));
		negocio.realizarVenta(camisaNoTanFea, 3, LocalDate.parse("2015-04-02"));
		negocio.realizarVenta(sacoLoco, 1, LocalDate.parse("2015-04-02"));
		negocio.realizarVenta(zapatito, 1, LocalDate.parse("2015-04-02"));
		negocio.realizarVenta(sombrerito, 5, LocalDate.parse("2015-04-02"));
		
		Double ganancia = negocio.gananciaEn(LocalDate.parse("2015-04-02"));
		
		assertEquals((Double)8784.375,ganancia);
	}
}
