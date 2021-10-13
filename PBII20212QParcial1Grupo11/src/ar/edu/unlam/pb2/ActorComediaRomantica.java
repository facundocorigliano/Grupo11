package ar.edu.unlam.pb2;

public class ActorComediaRomantica extends Actor implements IActorComedia, IActorRomance {
	TipoDeHumor tipoHumor;
	TipoDeRomance tipoRomance;

	public ActorComediaRomantica(Integer legajo, String nombre, TipoDeRomance tipoRomance, TipoDeHumor tipoHumor) {
		super(legajo, nombre);
		this.tipoHumor = tipoHumor;
		this.tipoRomance = tipoRomance;
	}

	@Override
	public TipoDeRomance getTipoRomance() {
		return tipoRomance;
	}

	@Override
	public TipoDeHumor getTipoHumor() {
		return tipoHumor;
	}
	
}
