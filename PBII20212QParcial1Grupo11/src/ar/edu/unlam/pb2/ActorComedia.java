package ar.edu.unlam.pb2;

public class ActorComedia extends Actor implements IActorComedia{
	public TipoDeHumor tipoHumor;

	public ActorComedia(Integer legajo, String nombre, TipoDeHumor tipoHumor) {
		super(legajo, nombre);
		this.tipoHumor = tipoHumor;
	}

	@Override
	public TipoDeHumor getTipoHumor() {
		return tipoHumor;
	}

}
