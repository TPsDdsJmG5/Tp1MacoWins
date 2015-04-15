package ar.edu.grupo5.jm.dss.macoWins;

public abstract class Prenda {

	protected Procedencia procedencia;
	protected Marca marca;
	
	public Prenda(Procedencia unaProcedencia, Marca unaMarca) {
		procedencia = unaProcedencia;
		marca= unaMarca;
	}
	
	public abstract double precioBase();
	
	private double precioOriginalEn(Negocio unNegocio){
		return (unNegocio.getValorFijo() + precioBase()) * procedencia.factorMultiplicativo();
	}
	
	public double precioFinalEn(Negocio unNegocio){
		return ( precioOriginalEn(unNegocio) * marca.factorMarca(precioOriginalEn(unNegocio)) );
	}
}
