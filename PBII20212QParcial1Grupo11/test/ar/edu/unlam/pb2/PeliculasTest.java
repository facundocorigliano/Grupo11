package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class PeliculasTest {
    
    @Test
    public void queSePuedaCrearUnaEscena() {
    	Escena escena1 = new Escena(2,25.2,true);
    	assertTrue(escena1.getEsExterior());
    	
    }
    
    @Test
    public void queSePuedanAgregarSoloEscenasDiferentesAUnaPelicula() {
    	Escena escena1 = new Escena(1000,45.0,true);
    	Escena escena2 = new Escena(2000,85.2,false);
    	Escena escena3 = new Escena(3000,22.2,true);
    	
    	Pelicula bastardosSinGloria = new Pelicula(11, "Bastardos sin gloria", TipoDePelicula.ACCION);
    	
    	bastardosSinGloria.agregarEscena(escena1);
    	bastardosSinGloria.agregarEscena(escena2);
    	bastardosSinGloria.agregarEscena(escena3);
    	
    	assertEquals(3, bastardosSinGloria.getCantidadEscenas(), 0);
    }
    
    @Test
    public void saberCuantosActoresParticipanDeUnaPelicula() {
		ActorRomance jamieDornan = new ActorRomance(3, "Jamie Dornan", TipoDeRomance.EROTICO);
    	ActorAccion sylvesterStallone = new ActorAccion(2, "Sylvester Stallone", TipoDeAccion.GUERRA);
    	ActorComediaRomantica ashtonKutcher = new ActorComediaRomantica(4, "Ashton Kutcher", TipoDeRomance.BESO, TipoDeHumor.FAMILIAR);
    	ActorComedia jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
    	
    	Elenco comedia = new Elenco(4, TipoDePelicula.COMEDIA);
    	
    	Pelicula theTrumanShow = new Pelicula(22, "The Truman Show", TipoDePelicula.COMEDIA);
    	
		comedia.agregarActorAElenco(ashtonKutcher);
    	comedia.agregarActorAElenco(sylvesterStallone);
    	comedia.agregarActorAElenco(jamieDornan);
    	comedia.agregarActorAElenco(jimCarrey);
    	
    	theTrumanShow.agregarElencoALaPelicula(comedia);
    	assertEquals(1, theTrumanShow.getCantidadActoresEnPelicula(), 0);
    }
    
}
