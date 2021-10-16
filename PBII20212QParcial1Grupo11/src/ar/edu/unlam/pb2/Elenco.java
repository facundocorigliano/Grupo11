package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Elenco {

	private Actor actores[];
	
	
	public Elenco(Actor[] actores) {
		super();
		this.actores = new Actor[2];
	}

	public Boolean agregarActor(Actor actorNuevo) {
		 boolean sePudoAgregar = false;
		 
	        for(int i=0; i<actores.length; i++) {
	            if(actores[i] == null) {
	            	actores[i] = actorNuevo;
	                sePudoAgregar = true;
	            }
	        }
			return sePudoAgregar;
	}
}
