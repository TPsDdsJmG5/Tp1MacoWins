package ar.edu.grupo5.jm.dss.macoWins;

public class Prenda {

	private string marca;
	private String nombre;
	private Procedencia procedencia;
	
	public Prenda(String unNombre, Procedencia unaProcedencia, Marca unaMarca) {
		nombre = unNombre;
		procedencia = unaProcedencia;
		marca = unaMarca;
	}

	public String getNombre() {
		return nombre;
	}
	
	public double precioOriginalEn(Negocio unNegocio){
		return (unNegocio.getValorFijo() + this.precioBase()) * procedencia.factorMultiplicativo();
	}
	public double precioFinalEn(Negocio unNegocio){
		return  this.precioOriginal(unNegocio) * marca.coeficienteMarca(this.precioOriginal(unNegocio));
	}
}
