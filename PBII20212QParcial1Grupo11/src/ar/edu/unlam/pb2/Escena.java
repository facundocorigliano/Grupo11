package ar.edu.unlam.pb2;

public class Escena {
	Double duracion;
	Boolean esExterior;
	Elenco elenco;
		
	public Escena(Elenco elenco, Double duracion, Boolean esExterior) {
		super();
		this.elenco = elenco;
		this.duracion = duracion;
		this.esExterior = esExterior;
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
	
	public Boolean bloquearElencosEnEscenasInternas(Elenco elenco) {
		//Por decision de negocio y por covid no se permiten mas de 3 personas en una escena de interior
		Boolean superaLaCantidadDeActoresPermitidos = false;
		if(this.esExterior == false && elenco.getCantidadDeActores() > 3) {
			superaLaCantidadDeActoresPermitidos = true;
		}
		return superaLaCantidadDeActoresPermitidos;
	}
		
}
