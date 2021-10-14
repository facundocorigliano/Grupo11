package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Elenco {
	private ArrayList<Actor> elenco;

	public Elenco(ArrayList<Actor> elenco) {
		super();
		this.elenco = new ArrayList<>();
	}
	
	public Boolean agregarActor(Actor actor) {
		return this.elenco.add(actor);
	}
}
