	package ar.edu.grupo5.jm.dss.macoWins;

import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class VentaTest {

	private Venta unaVenta;	
	private Zapato zapatito;
	private Negocio negocio;
	
	@Before
	public void Setup(){
		zapatito = mock(Zapato.class);
				
		unaVenta = new Venta (zapatito,5,LocalDate.parse("2015-04-02"));
	}
		
	@Test
	public void DevuelveLaFechaCorrecta(){
		assertTrue(unaVenta.esDeFecha(LocalDate.parse("2015-04-02")));
	}
	
	@Test
	public void laGananciaEnNegocioEsCorrecta(){
		
		when(zapatito.precioFinalEn(negocio)).thenReturn(100.00);
		
		Double ganancia = unaVenta.gananciaEn(negocio);
				
		assertEquals((Double)500.00,ganancia);
		
	}
		
}
