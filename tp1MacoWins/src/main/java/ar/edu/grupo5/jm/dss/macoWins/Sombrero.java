package ar.edu.grupo5.jm.dss.macoWins;

public class Sombrero extends Prenda {
	
	private double coeficienteMetrosexualidad;
	
	public Sombrero(double uncoeficienteMetrosexualidad, Procedencia unaProcedencia, Marca unaMarca) {
		super(unaProcedencia,unaMarca );
		coeficienteMetrosexualidad = uncoeficienteMetrosexualidad;
	}


	@Override
	public double precioBase(){
		return 150+coeficienteMetrosexualidad;
	}

}
