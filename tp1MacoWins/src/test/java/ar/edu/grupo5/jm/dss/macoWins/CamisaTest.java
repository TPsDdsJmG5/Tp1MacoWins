package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class CamisaTest {

	private Camisa camisaNoTanFea;
	private Negocio negocio;
	private Marca marca;
	
	@Before
	public void Setup(){
		marca = mock(Marca.class);
		negocio = mock(Negocio.class);

		camisaNoTanFea = new Camisa(new Nacional(), marca);
	}

	@Test
	public void PrecioBaseDeLaCamisaEsCrrecto(){
		
		Double precioBase = camisaNoTanFea.precioBase();
		
		assertEquals((Double)200.00,precioBase);

	}
	
	@Test
	public void PrecioFinalDeLaCamisaEsCrrecto(){

		when(marca.factorMarca(anyDouble()) ).thenReturn(1.0);
		when(negocio.getValorFijo()).thenReturn(100.00);
		Double precioFinal = camisaNoTanFea.precioFinalEn(negocio);
		
		assertEquals((Double)300.00,precioFinal);
		
		verify(negocio, times(2)).getValorFijo();
		verify(marca, times(1)).factorMarca(anyDouble());
	}
}
