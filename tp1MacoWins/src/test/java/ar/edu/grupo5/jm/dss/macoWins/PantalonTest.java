package ar.edu.grupo5.jm.dss.macoWins;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;


public class PantalonTest
{

	private Pantalon pantalonFeo;
	private Negocio negocio;
	private Marca marca;
	
	@Before
	public void Setup(){
		marca = mock(Marca.class);
		negocio = mock(Negocio.class);

		pantalonFeo = new Pantalon(200, new Nacional(), marca);
	}

	@Test
	public void PrecioBaseDelPantalonEsCrrecto(){
		
		Double precioBase = pantalonFeo.precioBase();
		
		assertEquals((Double)450.00,precioBase);

	}
	
	@Test
	public void PrecioFinalDelPantalonEsCrrecto(){

		when(marca.factorMarca(anyDouble()) ).thenReturn(1.0);
		when(negocio.getValorFijo()).thenReturn(100.00);
		Double precioFinal = pantalonFeo.precioFinalEn(negocio);
		
		assertEquals((Double)550.00,precioFinal);
		
		verify(negocio, times(2)).getValorFijo();
		verify(marca, times(1)).factorMarca(anyDouble());
	}
}
