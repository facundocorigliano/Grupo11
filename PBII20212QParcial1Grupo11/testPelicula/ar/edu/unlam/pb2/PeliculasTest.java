package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;


public class PeliculasTest {
    
    @Test
    public void queSePuedaCrearUnaEscena() {
    	Escena escena1 = new Escena(2,25.2,true);
    	assertTrue(escena1.getEsExterior());
    	
    }
    
    
}
