package ar.edu.unlam.pb2;

public abstract class Actor {
	Integer legajo;
	String nombre;
	
	public Actor(Integer legajo, String nombre) {
		this.legajo = legajo;
		this.nombre = nombre;
	}
	
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	
	public Integer getLegajo() {
		return legajo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
