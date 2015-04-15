package ar.edu.grupo5.jm.dss.macoWins;

public class Zapatos extends Prenda {
	
private int talle;
	
	public Zapatos(int untalle, Procedencia unaProcedencia, Marca unaMarca) {
		super(unaProcedencia,unaMarca );
		talle = untalle;
	}
	
	@Override
	public double precioBase(){
		return 400 + (5 * talle);
	}

}
