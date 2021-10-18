package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Pelicula {
	private String nombre;
	private TipoDePelicula tipoPelicula;
	private ArrayList<Escena> escenas = new ArrayList<Escena>();
	private ArrayList<Elenco> elenco = new ArrayList<Elenco>();
	
	public Pelicula(String nombre, TipoDePelicula tipoPelicula) {
		super();
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

	public String getNombre() {
		return nombre;
	}

	public TipoDePelicula getTipo() {
		return tipoPelicula;
	}

	public ArrayList<Escena> getEscenas() {
		return escenas;
	}
}