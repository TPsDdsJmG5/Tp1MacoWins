package ar.edu.grupo5.jm.dss.macoWins;

public class Prenda {

	private String nombre;
	private float precioBase;
	private Procedencia procedencia;
	
	public Prenda(String unNombre, float unPrecioBase, Procedencia unaProcedencia) {
		nombre = unNombre;
		precioBase = unPrecioBase;
		procedencia = unaProcedencia;
	}

	public float getPrecioBase() {
		return precioBase;
	}
	public String getNombre() {
		return nombre;
	}
	public Procedencia getProcedencia() {
		return procedencia;
	}

	public double precioFinalEn(Negocio unNegocio){
		return (unNegocio.getValorFijo() + getPrecioBase()) * getProcedencia().factorMultiplicativo();
	}
}
