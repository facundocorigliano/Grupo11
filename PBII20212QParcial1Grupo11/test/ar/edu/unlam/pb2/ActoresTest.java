package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ActoresTest {

	@Test
	public void queSePuedaCrearUnActorDeComedia() {
		Actor jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
		assertEquals(1, jimCarrey.getLegajo(), 0);
	}
	
	@Test
	public void queSePuedaCrearUnActorDeAccion() {
		Actor sylvesterStallone = new ActorAccion(2, "Sylvester Stallone", TipoDeAccion.GUERRA);
		assertEquals(2, sylvesterStallone.getLegajo(), 0);
	}
	
	@Test
	public void queSePuedaCrearUnActorDeRomance() {
		Actor jamieDornan = new ActorRomance(3, "Jamie Dornan", TipoDeRomance.EROTICO);
		assertEquals(3, jamieDornan.getLegajo(), 0);
	}
	
	@Test
	public void queSePuedaCrearUnActorDeComediaRomantica() {
		Actor ashtonKutcher = new ActorComediaRomantica(4, "Ashton Kutcher", TipoDeRomance.BESO, TipoDeHumor.FAMILIAR);
		assertEquals(4, ashtonKutcher.getLegajo(), 0);
	}
	
	@Test
    public void queSePuedaAgregarUnActorAlElenco() {
    	Actor jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
    	Elenco protagonistas = new Elenco(1, TipoDePelicula.COMEDIA);    	
    	assertTrue(protagonistas.agregarActorAElenco(jimCarrey));    	    	
    }
	
	@Test
	public void queSePuedaAgregarUnActorAlElencoYQueNoTengaUnNumeroDeLegajoRepetido() {
		Actor dakotaJohnson = new ActorRomance(2, "Dakota Johnson", TipoDeRomance.EROTICO);
		Actor jamieDornan = new ActorRomance(2, "Jamie Dornan", TipoDeRomance.EROTICO);
		Actor zacEfron = new ActorRomance(1, "Zac Efron", TipoDeRomance.ADOLESCENTE);
		Elenco protagonistas = new Elenco(4, TipoDePelicula.ROMANTICA); 
		protagonistas.agregarActorAElenco(jamieDornan);
		protagonistas.agregarActorAElenco(dakotaJohnson);
		protagonistas.agregarActorAElenco(zacEfron);
		assertEquals(2, protagonistas.getCantidadDeActores(), 0);
	}
	
	@Test
	public void queNoSePuedaAgregarMasActoresQueLosPermitidosEnElElencoYQueElElencoEsteFormadoSoloPorActoresDeLaMismaCategoriaDeLaPelicula() {
		Actor jamieDornan = new ActorRomance(3, "Jamie Dornan", TipoDeRomance.EROTICO);
    	Actor sylvesterStallone = new ActorAccion(2, "Sylvester Stallone", TipoDeAccion.GUERRA);
    	Actor ashtonKutcher = new ActorComediaRomantica(4, "Ashton Kutcher", TipoDeRomance.BESO, TipoDeHumor.FAMILIAR);
    	Actor jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
    	
    	Elenco comedia = new Elenco(4, TipoDePelicula.COMEDIA);
    	
		comedia.agregarActorAElenco(ashtonKutcher);
    	comedia.agregarActorAElenco(sylvesterStallone);
    	comedia.agregarActorAElenco(jamieDornan);
    	comedia.agregarActorAElenco(jimCarrey);
    	
    	assertEquals(1, comedia.getCantidadDeActores(), 0);
	}
	
}
