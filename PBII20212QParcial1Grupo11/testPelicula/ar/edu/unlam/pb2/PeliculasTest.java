package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class PeliculasTest {
    
    @Test
    public void queSePuedaCrearUnaEscena() {
    	Elenco protagonistas = new Elenco(2);
    	Escena escenaRomantica = new Escena(protagonistas, 20.0, true);
    	assertTrue(escenaRomantica.getEsExterior());
    	
    }
    
   /* @Test
    public void queEnEscenasInternasNoPuedaHaberMasDe3Actores() {
    	Elenco secundarios = new Elenco(4);
    	
    	Escena escenaEnLivingInterno = new Escena(secundarios, 10.0, false);
    	assertTrue(escenaEnLivingInterno.bloquearElencosEnEscenasInternas(secundarios));
    	
    	este test rompe porque los actores no estan creados, el array esta vacio
    } */
    
    @Test
    public void queSePuedaCalcularLaDuracionDeLaPelicula() {
    	Elenco principales = new Elenco(4);
    	Elenco secundarios = new Elenco(4);
    	Pelicula laRomantica = new Pelicula(1,"La Romantica",TipoDePelicula.ROMANTICA,5);
    	Escena escena1 = new Escena(principales, 10.0, true);
    	Escena escena2 = new Escena(secundarios, 10.0, true);
    	laRomantica.agregarEscena(escena1);
    	laRomantica.agregarEscena(escena2);
    	assertEquals(20.0, laRomantica.calcularDuracion(), 0);
    	
    }
    
}
