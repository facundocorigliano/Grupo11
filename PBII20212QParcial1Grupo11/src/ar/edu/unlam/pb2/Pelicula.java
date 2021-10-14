package ar.edu.unlam.pb2;

public class Pelicula {
	Integer id;
	String nombre;
	TipoDePelicula tipo;
	Escena escenas[] = new Escena[];
	
	public Pelicula(Integer id, String nombre, TipoDePelicula tipo, Double duracion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	}
}
