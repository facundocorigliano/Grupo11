package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FilmografiaTest {

	@Test
	public void queSePuedaCrearUnActorDeComedia() {
		ActorComedia jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
		assertEquals(1, jimCarrey.getLegajo(), 0);
	}
	
	@Test
	public void queSePuedaCrearUnActorDeAccion() {
		ActorAccion sylvesterStallone = new ActorAccion(2, "Sylvester Stallone", TipoDeAccion.GUERRA);
		assertEquals(2, sylvesterStallone.getLegajo(), 0);
	}
	
	@Test
	public void queSePuedaCrearUnActorDeRomance() {
		ActorRomance jamieDornan = new ActorRomance(3, "Jamie Dornan", TipoDeRomance.EROTICO);
		assertEquals(3, jamieDornan.getLegajo(), 0);
	}
	
	@Test
	public void queSePuedaCrearUnActorDeComediaRomantica() {
		ActorComediaRomantica ashtonKutcher = new ActorComediaRomantica(4, "Ashton Kutcher", TipoDeRomance.BESO, TipoDeHumor.FAMILIAR);
		assertEquals(4, ashtonKutcher.getLegajo(), 0);
	}
	
	
	

}
