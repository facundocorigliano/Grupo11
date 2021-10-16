package ar.edu.unlam.pb2;

public class Escena {
	Integer nroActores;
	Double duracion;
	Boolean esExterior;
	//Elenco elenco[];
	
	public Escena(Integer nroActores, Double duracion, Boolean esExterior) {
		super();
		this.nroActores = nroActores;
		this.duracion = duracion;
		this.esExterior = esExterior;
		//this.elenco = new Elenco[nroActores];
	}

	public Integer getNroActores() {
		return nroActores;
	}

	public void setNroActores(Integer nroActores) {
		this.nroActores = nroActores;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public Boolean getEsExterior() {
		return esExterior;
	}

	public void setEsExterior(Boolean esExterior) {
		this.esExterior = esExterior;
	}
	
	
	
}
