package ar.edu.grupo5.jm.dss.macoWins;

public class Pantalon extends Prenda {

	private int cantBotones;
	public Prenda(String unNombre, Procedencia unaProcedencia, Marca unaMarca, int unosCantBotones) {
		Prenda(unNombre, unaProcedencia, unaMarca);
		cantBotones = unosCantBotones;
	precioBase(){
		return 300 + 10 * this.getCantBotones();
	}
}
