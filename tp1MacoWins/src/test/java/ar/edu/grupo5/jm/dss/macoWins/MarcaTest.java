package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MarcaTest {
	
	private Sarkany sarkany;
	private Armani armani;
	
	@Before
	public void Setup(){
		sarkany = new Sarkany();
		armani = new Armani();
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEs1_1SiPrecioIgualA500(){

		Double coeficiente = sarkany.factorMarca(500);

		assertEquals((Double)1.1,coeficiente);
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEs1_35SiPrecioMayorA500(){

		Double factorMarca = sarkany.factorMarca(600);

		assertEquals((Double)1.35,factorMarca);
	}
	
	@Test
	public void coeficienteDeMarcaSarkanyEs1_1SiPrecioMenorA500(){

		Double coeficiente = sarkany.factorMarca(400);

		assertEquals((Double)1.1,coeficiente);
	}

	@Test
	public void coeficienteDeMarcaArmaniEs1_65(){

		Double coeficiente = armani.factorMarca(800);

		assertEquals((Double)1.65,coeficiente);
	}
}
