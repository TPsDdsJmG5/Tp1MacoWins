package ar.edu.grupo5.jm.dss.macoWins;

public class Saco extends Prenda {
	
	private int cantidadBotones;
	
	public Saco(int unacantidadBotones, Procedencia unaProcedencia, Marca unaMarca) {
		super(unaProcedencia,unaMarca );
		cantidadBotones = unacantidadBotones;
	}
	
	@Override
	public double precioBase(){
		return (300+(10*cantidadBotones));
	}

}
