package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProcedenciaTest {

	private Nacional nacional;
	private Internacional internacional;
	
	@Before
	public void Setup(){
		nacional = new Nacional();
		internacional = new Internacional();
	}
	
	@Test
	public void factorMultiplicativoInternacionalEsElCorrecto(){

		Double factorMultiplicativo = internacional.factorMultiplicativo();

		assertEquals((Double)1.3,factorMultiplicativo);
	}
	
	@Test
	public void factorMultiplicativoNacionalEsElCorrecto(){

		Double factorMultiplicativo = nacional.factorMultiplicativo();

		assertEquals((Double)1.00,factorMultiplicativo);
	}
}
