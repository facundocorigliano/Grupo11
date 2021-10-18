package ar.edu.unlam.pb2;

public class Elenco {
	private Actor actores[];
	private Integer cantidadActores;
	private Integer cantidadActoresEnElenco = 0;
	TipoDePelicula tipoPelicula;
		
	public Elenco(Integer cantidadActores, TipoDePelicula tipoPelicula) {
		super();
		this.cantidadActores = cantidadActores;
		this.actores = new Actor[cantidadActores]; 
		this.tipoPelicula = tipoPelicula;
	}	
	
	public Boolean agregarActorAElenco(Actor nuevoActor){
		boolean sePudoAgregar = false;
		boolean existe = false;
		
		for(int i=0; i<actores.length; i++) {
            if(actores[i] != null) {
                if(actores[i].getLegajo() == nuevoActor.getLegajo()) {
                    existe = true;
                }
            }
        }
		
		for(int i = 0; i < cantidadActores; i++) {
			if(actores[i] == null && !existe) {
				if((this.tipoPelicula.equals(TipoDePelicula.ACCION) && nuevoActor instanceof IActorAccion) ||
				   (this.tipoPelicula.equals(TipoDePelicula.COMEDIA) && (nuevoActor instanceof IActorComedia && !(nuevoActor instanceof IActorRomance))) ||
				   (this.tipoPelicula.equals(TipoDePelicula.ROMANTICA) && (nuevoActor instanceof IActorRomance && !(nuevoActor instanceof IActorComedia))) ||
				   (this.tipoPelicula.equals(TipoDePelicula.COMEDIAROMANTICA) && (nuevoActor instanceof IActorComedia && nuevoActor instanceof IActorRomance))){
						actores[i] = nuevoActor;
		                sePudoAgregar = true;
		                cantidadActoresEnElenco++;
		                return sePudoAgregar;
				}
			}
		}
		return sePudoAgregar;
	}
	
	
	public Integer getCantidadDeActores() {
		return cantidadActoresEnElenco;
	}
	
	public TipoDePelicula getTipoDePelicula() {
		return this.tipoPelicula;
	}
}
