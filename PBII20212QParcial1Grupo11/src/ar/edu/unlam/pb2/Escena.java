package ar.edu.unlam.pb2;

public class Escena {
	private Integer nroActores;
	private Double duracion;
	private Boolean esInterior;


    public Escena(Integer nroActores, Double duracion, Boolean esInterior) {
        super();
        this.nroActores = nroActores;
        this.duracion = duracion;
        this.esInterior = esInterior;
    }
    
    public Boolean limitarActoresEnInteriores(Elenco elenco, Integer actoresMaximosEnInterior) {
        Boolean superaLaCantidadDeActoresPermitidos = false;
        if(this.esInterior == true && elenco.getCantidadDeActores() > actoresMaximosEnInterior) {
            superaLaCantidadDeActoresPermitidos = true;
        }
        return superaLaCantidadDeActoresPermitidos;
    }

    public Integer getNroActores() {
        return nroActores;
    }

    public Double getDuracion() {
        return duracion;
    }

    public Boolean getEsInterior() {
        return esInterior;
    }

}