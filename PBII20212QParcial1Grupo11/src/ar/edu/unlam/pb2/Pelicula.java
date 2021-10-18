package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Pelicula {
	Integer id;
	String nombre;
	TipoDePelicula tipoPelicula;
	ArrayList<Escena> escenas = new ArrayList<Escena>();
	ArrayList<Elenco> elenco = new ArrayList<Elenco>();
	
	public Pelicula(Integer id, String nombre, TipoDePelicula tipoPelicula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipoPelicula = tipoPelicula;
	}
	
	public Boolean agregarEscena(Escena nuevaEscena) {
		boolean sePudoAgregar = false;
		if(!this.escenas.contains(nuevaEscena)) {			
			this.escenas.add(nuevaEscena);
			return sePudoAgregar;
		}
		return sePudoAgregar;
	}

	public Double calcularDuracionDeLaPelicula() {
		Double duracionTotal = 0.0;
		for(int i=0; i < escenas.size(); i++) {
			duracionTotal += escenas.get(i).getDuracion();
		}
		return duracionTotal;
		
	}
	
	public Integer getCantidadEscenas() {
		return this.escenas.size();
	}
	
	public void agregarElencoALaPelicula(Elenco nuevoElenco) {
		if(this.tipoPelicula.equals(nuevoElenco.tipoPelicula))
			this.elenco.add(nuevoElenco);
	}
	
	public Integer getCantidadActoresEnPelicula() {
		return this.elenco.size();
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
		return tipoPelicula;
	}

	public void setTipo(TipoDePelicula tipo) {
		this.tipoPelicula = tipo;
	}

	public ArrayList<Escena> getEscenas() {
		return escenas;
	}

	public void setEscenas(ArrayList<Escena> escenas) {
		this.escenas = escenas;
	}
}