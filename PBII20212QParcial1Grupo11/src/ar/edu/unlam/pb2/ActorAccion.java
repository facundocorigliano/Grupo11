package ar.edu.unlam.pb2;

public class ActorAccion extends Actor implements IActorAccion{
	TipoDeAccion tipoAccion;

	public ActorAccion(Integer legajo, String nombre, TipoDeAccion tipoAccion) {
		super(legajo, nombre);
		this.tipoAccion = tipoAccion;
	}

	@Override
	public TipoDeAccion getTipoAccion() {
		return tipoAccion;
	}

}
