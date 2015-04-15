package ar.edu.grupo5.jm.dss.macoWins;

public class Pantalon extends Prenda {
	
	private double cm2deTela;
	
	public Pantalon(double unoscm2deTela, Procedencia unaProcedencia, Marca unaMarca) {
		super(unaProcedencia,unaMarca );
		cm2deTela = unoscm2deTela;
	}
	
	@Override
	public double precioBase(){
		return 250+cm2deTela;
	}

}
