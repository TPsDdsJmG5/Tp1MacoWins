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
	
	public float precioFinalEn(Negocio unNegocio) {
		return (unNegocio.getValorFijo()+precioBase)*procedencia.factorMultiplicativo();
	}
	
	public void setNombre(String unNombre) {
		nombre=unNombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
