package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class PeliculasTest {

	@Test
    public void queSePuedaCrearUnActorDeComedia() {
        Pelicula grownUp = new Pelicula(111, "Grown Up", TipoDePelicula.COMEDIA);
        assertEquals(111, grownUp.getId(), 0);
    }

    @Test
    public void queSePuedaCrearUnActorDeAccion() {
    	Pelicula rambo = new Pelicula(222, "Rambo", TipoDePelicula.ACCION);
        assertEquals(222, rambo.getId(), 0);
    }

    @Test
    public void queSePuedaCrearUnActorDeRomance() {
        Pelicula sombrasDeGrey = new Pelicula(333, "50 Sombras de Grey", TipoDePelicula.ROMANTICA);
        assertEquals(333, sombrasDeGrey.getId(), 0);
    }

    @Test
    public void queSePuedaCrearUnActorDeComediaRomantica() {
    	Pelicula amigosConDerechos = new Pelicula(444, "Amigos con Derechos", TipoDePelicula.COMEDIAROMANTICA);
        assertEquals(444, amigosConDerechos.getId(), 0);
    }
    
    @Test
    public void queSePuedaCrearUnaEscena() {
    	Escena escena1 = new Escena(2,25.2,true);
    	assertTrue(escena1.getEsExterior());
    	
    }
    

   /* @Test
    public void queSePuedaAgregarUnElenco() {
    	Actor jimCarrey = new ActorComedia(1, "Jim Carrey", TipoDeHumor.FAMILIAR);
    	Elenco protagonistas = new Elenco(null);
    }*/
    
    
}
