package ar.edu.unlam.pb2;

public abstract class Actor {
	private Integer legajo;
	private String nombre;

	public Actor(Integer legajo, String nombre) {
		this.legajo = legajo;
		this.nombre = nombre;
	}
	
	public Integer getLegajo() {
		return legajo;
	}

	public String getNombre() {
		return nombre;
	}
}
