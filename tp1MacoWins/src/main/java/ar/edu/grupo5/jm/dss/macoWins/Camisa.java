package ar.edu.grupo5.jm.dss.macoWins;

public class Camisa extends Prenda {
	
	public Camisa(Procedencia unaProcedencia, Marca unaMarca) {
		super(unaProcedencia,unaMarca );
	}

	@Override
	public double precioBase(){
		return 200;
	}

}
