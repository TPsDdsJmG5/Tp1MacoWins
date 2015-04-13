package ar.edu.grupo5.jm.dss.macoWins;

public class Saco extends Prenda {
	
	private int telaUsada;
	public Prenda(String unNombre, Procedencia unaProcedencia, Marca unaMarca, int unaTelaUsada) {
		Prenda(unNombre, unaProcedencia, unaMarca);
		telaUsada = unaTelaUsada;
	precioBase(){
		return 250 + 1 * this.getTelaUsada();
	}
	

}
