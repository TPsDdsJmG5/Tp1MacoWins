package ar.edu.grupo5.jm.dss.macoWins;

public class Sombrero extends Prenda {

	private int coefMetrosexualidad;
	public Prenda(String unNombre, Procedencia unaProcedencia, Marca unaMarca, int unCoefMetrosexualidad) {
		Prenda(unNombre, unaProcedencia, unaMarca);
		coefMetrosexualidad = unCoefMetrosexualidad;
	precioBase(){
		return 150 + 1 * this.getUnCoefMetrosexualidad();
	}
}
