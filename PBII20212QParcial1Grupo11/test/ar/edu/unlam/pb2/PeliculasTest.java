package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class PeliculasTest {
    
    @Test
    public void queSePuedaCrearUnaEscena() {
    	Escena escena1 = new Escena(2,25.2,true);
    	assertTrue(escena1.getEsInterior());
    }
    
    @Test
    public void queSePuedanAgregarSoloEscenasDiferentesAUnaPelicula() {
    	Escena escena1 = new Escena(1000,45.0,true);
    	Escena escena2 = new Escena(2000,85.2,false);
    	Escena escena3 = new Escena(3000,22.2,true);

    	Pelicula bastardosSinGloria = new Pelicula("Bastardos sin gloria", TipoDePelicula.ACCION);
    	
    	bastardosSinGloria.agregarEscena(escena1);
    	bastardosSinGloria.agregarEscena(escena2);
    	bastardosSinGloria.agregarEscena(escena3);
    	
    	assertEquals(3, bastardosSinGloria.getCantidadEscenas(), 0);
    }
    
    @Test
    public void queSePuedaSaberCuantosActoresParticipanDeUnaPelicula() {
		Actor jamieDornan = new ActorRomance(3, "Jamie Dornan", TipoDeRomance.EROTICO);
    	Actor sylvesterStallone = new ActorAccion(2, "Sylvester Stallone", TipoDeAccion.GUERRA);
    	Actor ashtonKutcher = new ActorComediaRomantica(4, "Ashton Kutcher", TipoDeRomance.BESO, TipoDeHumor.FAMILIAR);
    	Actor jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
    	
    	Elenco comedia = new Elenco(4, TipoDePelicula.COMEDIA);
    	
    	Pelicula theTrumanShow = new Pelicula("The Truman Show", TipoDePelicula.COMEDIA);
    	
		comedia.agregarActorAElenco(ashtonKutcher);
    	comedia.agregarActorAElenco(sylvesterStallone);
    	comedia.agregarActorAElenco(jamieDornan);
    	comedia.agregarActorAElenco(jimCarrey);
    	
    	theTrumanShow.agregarElencoALaPelicula(comedia);
    	assertEquals(1, theTrumanShow.getCantidadActoresEnPelicula(), 0);
    }
    
    @Test
    public void queSePuedaConocerLaDuracionTotalDeLaPelicula() {
    	Escena escena1 = new Escena(1000,10.0,true);
    	Escena escena2 = new Escena(2000,10.0,false);
    	Escena escena3 = new Escena(3000,10.0,true);
    	
    	Pelicula bastardosSinGloria = new Pelicula("Bastardos sin gloria", TipoDePelicula.ACCION);
    	
    	bastardosSinGloria.agregarEscena(escena1);
    	bastardosSinGloria.agregarEscena(escena2);
    	bastardosSinGloria.agregarEscena(escena3);
    	
    	assertEquals(30.0,bastardosSinGloria.calcularDuracionDeLaPelicula(),0);
    }
    

    @Test
        public void queEnEscenasInternasNoPuedaHaberMasDe3Actores() { 
    	
            Elenco secundarios = new Elenco(4, TipoDePelicula.ROMANTICA);
            Actor jamieDornan = new ActorRomance(3, "Jamie Dornan", TipoDeRomance.EROTICO);
            Actor dakotaJohnson = new ActorRomance(2, "Dakota Johnson", TipoDeRomance.EROTICO);
            Actor ashtonKutcher = new ActorRomance(4, "Ashton Kutcher", TipoDeRomance.BESO);
            Actor zacEfron = new ActorRomance(1, "Zac Efron", TipoDeRomance.ADOLESCENTE);

            secundarios.agregarActorAElenco(zacEfron);
            secundarios.agregarActorAElenco(jamieDornan);
            secundarios.agregarActorAElenco(ashtonKutcher);
            secundarios.agregarActorAElenco(dakotaJohnson);

            Escena escenaEnLivingInterno = new Escena(secundarios.getCantidadDeActores(), 10.0, true);
           
            assertTrue(escenaEnLivingInterno.limitarActoresEnInteriores(secundarios, 3));
        }
    
}
