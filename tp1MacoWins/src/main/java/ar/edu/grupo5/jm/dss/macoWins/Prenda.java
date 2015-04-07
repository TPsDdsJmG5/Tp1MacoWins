package ar.edu.grupo5.jm.dss.macoWins;

public class Prenda {

	private String nombre;
	private double precioBase;
	private Procedencia procedencia;
	
	public Prenda(String unNombre, double unPrecioBase, Procedencia unaProcedencia) {
		nombre = unNombre;
		precioBase = unPrecioBase;
		procedencia = unaProcedencia;
	}

	public String getNombre() {
		return nombre;
	}

	public double precioFinalEn(Negocio unNegocio){
		return (unNegocio.getValorFijo() + precioBase) * procedencia.factorMultiplicativo();
	}
}
