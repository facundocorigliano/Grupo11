package ar.edu.unlam.pb2;

public class Pelicula {
	Integer id;
	String nombre;
	TipoDePelicula tipo;
	Escena escenas[] = new Escena[5];
	
	public Pelicula(Integer id, String nombre, TipoDePelicula tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoDePelicula getTipo() {
		return tipo;
	}

	public void setTipo(TipoDePelicula tipo) {
		this.tipo = tipo;
	}

	public Escena[] getEscenas() {
		return escenas;
	}

	public void setEscenas(Escena[] escenas) {
		this.escenas = escenas;
	}
	
	
}
