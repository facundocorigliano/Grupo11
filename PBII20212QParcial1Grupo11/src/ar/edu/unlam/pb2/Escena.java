package ar.edu.unlam.pb2;

public class Escena {
    Integer nroActores;
    Double duracion;
    Boolean esInterior;


    public Escena(Integer nroActores, Double duracion, Boolean esInterior) {
        super();
        this.nroActores = nroActores;
        this.duracion = duracion;
        this.esInterior = esInterior;
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

    public Boolean getEsInterior() {
        return esInterior;
    }

    public void setEsInterior(Boolean esExterior) {
        this.esInterior = esExterior;
    }
}