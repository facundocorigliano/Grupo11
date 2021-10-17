package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ActoresTest {

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

	
	@Test
    public void queSePuedaAgregarUnActorAlElenco() {
    	Actor jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
    	Elenco protagonistas = new Elenco(1, TipoDePelicula.COMEDIA);    	
    	assertTrue(protagonistas.agregarActor(jimCarrey));    	    	
    }
	
	@Test
	public void queNoSePuedaAgregarMasActoresQueLosPermitidosEnElElencoYQueElElencoEsteFormadoSoloPorActoresDeLaMismaCategoriaDeLaPelicula() {
		ActorRomance jamieDornan = new ActorRomance(3, "Jamie Dornan", TipoDeRomance.EROTICO);
    	ActorAccion sylvesterStallone = new ActorAccion(2, "Sylvester Stallone", TipoDeAccion.GUERRA);
    	ActorComediaRomantica ashtonKutcher = new ActorComediaRomantica(4, "Ashton Kutcher", TipoDeRomance.BESO, TipoDeHumor.FAMILIAR);
    	ActorComedia jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
    	
    	Elenco comedia = new Elenco(4, TipoDePelicula.COMEDIA);
    	
		comedia.agregarActorAElenco(ashtonKutcher);
    	comedia.agregarActorAElenco(sylvesterStallone);
    	comedia.agregarActorAElenco(jamieDornan);
    	comedia.agregarActorAElenco(jimCarrey);
    	
    	assertEquals(1, comedia.getCantidadDeActores(), 0);
	}
}
