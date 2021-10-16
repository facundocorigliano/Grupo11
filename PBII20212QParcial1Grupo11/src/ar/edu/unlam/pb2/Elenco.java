package ar.edu.unlam.pb2;

public class Elenco {
	private Actor actores[];
		
	public Elenco() {
		super();
		this.actores = new Actor[2]; 
	}

	public Boolean agregarActor(Actor actorNuevo) {
		 boolean sePudoAgregar = false;
		 
	        for(int i=0; i <= actores.length; i++) {
	            if(actores[i] == null) {
	            	actores[i] = actorNuevo;
	                sePudoAgregar = true;
	                break;
	            }
	        }
			return sePudoAgregar;
	}
	
	public Integer getCantidadDeActores() {
		//return actores.length;
		Integer cantidadDeActores = 0 ;
		 
        for(int i=0; i <= actores.length; i++) {
            if(actores[i] != null) {
            	cantidadDeActores++;
            }
        }
		return cantidadDeActores;
	}
}
