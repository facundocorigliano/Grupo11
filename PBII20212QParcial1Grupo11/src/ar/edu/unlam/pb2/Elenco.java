package ar.edu.unlam.pb2;

public class Elenco {
	private Actor actores[];
	private Integer cantidadActores;
	private Integer cantidadRealActores = 0;
		
	public Elenco(Integer cantidadActores) {
		super();
		this.cantidadActores = cantidadActores;
		this.actores = new Actor[cantidadActores]; 
	}

	public Boolean agregarActor(Actor actorNuevo) {
		 boolean sePudoAgregar = false;
		 
	        for(int i = 0; i < cantidadActores; i++) {
	            if(actores[i] == null) {
	            	actores[i] = actorNuevo;
	                sePudoAgregar = true;
	                cantidadRealActores++;
	                return sePudoAgregar;
	            }
	        }
			return sePudoAgregar;
	}
	
	
	
	public Integer getCantidadDeActores() {
//		Integer cantidadActores = 0;
//		
//		for (int i = 0; i < actores.length; i++) {
//			if(actores[i] != null) {
//				cantidadActores++;
//			}
//		}
//		return cantidadActores;
		return cantidadRealActores;
	}
}
