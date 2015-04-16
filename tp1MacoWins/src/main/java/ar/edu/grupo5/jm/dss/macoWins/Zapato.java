package ar.edu.grupo5.jm.dss.macoWins;

public class Zapato extends Prenda {
	
private int talle;
	
	public Zapato(int untalle, Procedencia unaProcedencia, Marca unaMarca) {
		super(unaProcedencia,unaMarca );
		talle = untalle;
	}
	
	@Override
	public double precioBase(){
		return 400 + (5 * talle);
	}

}
