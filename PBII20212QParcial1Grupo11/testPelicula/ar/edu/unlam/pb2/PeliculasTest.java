package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeliculasTest {

	@Test
    public void queSePuedaCrearUnActorDeComedia() {
        Pelicula grownUp = new Pelicula(111, "Grown Up", TipoDePelicula.COMEDIA);
        assertEquals(1, grownUp.getId(), 0);
    }

    @Test
    public void queSePuedaCrearUnActorDeAccion() {
    	Pelicula rambo = new Pelicula(222, "Rambo", TipoDePelicula.ACCION);
        assertEquals(1, rambo.getId(), 0);
    }

    @Test
    public void queSePuedaCrearUnActorDeRomance() {
        Pelicula sombrasDeGrey = new Pelicula(333, "50 Sombras de Grey", TipoDePelicula.ROMANTICA);
        assertEquals(1, sombrasDeGrey.getId(), 0);
    }

    @Test
    public void queSePuedaCrearUnActorDeComediaRomantica() {
    	Pelicula amigosConDerechos = new Pelicula(444, "Amigos con Derechos", TipoDePelicula.COMEDIAROMANTICA);
        assertEquals(1, amigosConDerechos.getId(), 0);
    }

}
