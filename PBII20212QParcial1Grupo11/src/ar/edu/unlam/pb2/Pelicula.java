package ar.edu.unlam.pb2;

public class Pelicula {
	Integer id;
	String nombre;
	TipoDePelicula tipo;
	Escena escenas [];
	Integer cantidadDeEscenasTotal = 0;
	
	public Pelicula(Integer id, String nombre,
			TipoDePelicula tipo, Integer cantidadDeEscenasTotal) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.escenas = new Escena[cantidadDeEscenasTotal];
	}
	
	public Boolean agregarEscena(Escena nueva) {
		 boolean sePudoAgregar = false;
		 
	        for(int i = 0; i < escenas.length; i++) {
	            if(escenas[i] == null) {
	            	escenas[i] = nueva;
	                sePudoAgregar = true;
	                return sePudoAgregar;
	            }
	        }
			return sePudoAgregar;
	}
	
	public Double calcularDuracion() {
		Double duracionTotal = 0.0;
		for(int i = 0; i < escenas.length ;i++) {
			if(escenas[i]!=null) {
				duracionTotal += escenas[i].getDuracion();
			}	
		}
		return duracionTotal;
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
