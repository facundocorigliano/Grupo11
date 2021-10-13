package ar.edu.unlam.pb2;

public class ActorRomance extends Actor implements IActorRomance{
	TipoDeRomance tipoRomance;
	
	public ActorRomance(Integer legajo, String nombre, TipoDeRomance tipoRomance) {
		super(legajo, nombre);
		this.tipoRomance = tipoRomance;
	}

	@Override
	public TipoDeRomance getTipoRomance() {
		return tipoRomance;
	}
	
}
