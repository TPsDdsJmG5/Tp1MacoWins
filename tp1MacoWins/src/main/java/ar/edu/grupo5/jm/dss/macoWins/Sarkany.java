package ar.edu.grupo5.jm.dss.macoWins;

public class Sarkany implements Marca {

	@Override
	public double factorMarca(double precioOriginal) {
		if (precioOriginal > 500) 
			return 1.35;
		else 
			return 1.1;
	}

}
