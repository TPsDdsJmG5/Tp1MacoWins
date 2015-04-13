package ar.edu.grupo5.jm.dss.macoWins;

public class Zapato extends Prenda {

	private int talle;
	public Prenda(String unNombre, Procedencia unaProcedencia, Marca unaMarca, int untalle) {
		Prenda(unNombre, unaProcedencia, unaMarca);
		talle = untalle;
	precioBase(){
		return 400 + 5 * this.getUntalle();
	}
}
