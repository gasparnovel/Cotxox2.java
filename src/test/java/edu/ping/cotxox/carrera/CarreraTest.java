package edu.ping.cotxox.carrera;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.swing.text.Caret;

import org.junit.Before;    
    
public class CarreraTest {

    Carrera carrera;

    @Before
    public void conductorTest(){
        String [] tarjetasVisa = {
            "4929637175949220", 
            "4348729048092822", 
            "4320839028309211",
            "4382903829038208"
        };

        for (String tarjetaVisa : tarjetasVisa) {
			carrera = new Carrera(tarjetaVisa);
			assertEquals(tarjetaVisa, carrera.getTarjetaCredito());
		}
    }
    
    @Test
    public void setOrigenTest(){
        String origen = "magaluf";
        carrera.setOrigen(origen);
        assertEquals(origen, carrera.getOrigen());
    }

    @Test 
    public void setDestinoTest(){
        String destino = "San Francisco";
        carrera.setDestino(destino);
        assertEquals(destino, carrera.getDestino());
    }

    @Test 
    public void setDistanciaTest(){
        double distancia = 10.2;
        carrera.setDistancia(distancia);
        assertEquals(distancia, carrera.getDistancia(), 0.5);
    }

    @Test
    public void setTiempoEsperado(){
        int tiempoEsperdo = 10;
        carrera.setTiempoEsperdo(tiempoEsperdo);
        assertEquals(10, carrera.getTiempoEsperdo());
    }
}

    

