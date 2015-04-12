package ar.edu.grupo5.jm.dss.macoWins;

public class Sarkany implements Marca{
	public double factorMarca(Double unPrecio){
		if(unPrecio >= 500)
			return 1.35;
		else
			return 1.10;
	}
}
