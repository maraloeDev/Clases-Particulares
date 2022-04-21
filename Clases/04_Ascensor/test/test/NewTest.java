/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg04_ascensor.Ascensor;
import pkg04_ascensor.Persona;

/**
 *
 * @author RAFAEL TRECEÑO RODRÍGUEZ (rafa13o - rafaeltreceno.es)
 */
public class NewTest {

    public NewTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    Ascensor elAscensor = new Ascensor(11, 350);

    @Test
    public void testCerrarPuertas() {
        elAscensor.cambiarEstadoPuertas(); // Se inicia con las puertas cerradas, por tanto las abro
        assertEquals(true, elAscensor.isPuertas());
    }

    @Test
    public void testOcupacion() {
        double ocupacionActual = elAscensor.getOcupacion();
        assertEquals(0, ocupacionActual, 0);
        // No hay nadie, entra alguien
        Persona p1 = new Persona("pepe", 100);
        elAscensor.entrarSalirPersona(p1, true);
        assertEquals(100, elAscensor.getOcupacion(), 0);

        // Hay demasiada gente, no puede subir
        p1 = new Persona("pepe", 100);
        elAscensor.entrarSalirPersona(new Persona("Bea", 50), true);
        assertEquals(150, elAscensor.getOcupacion(), 0);
        elAscensor.entrarSalirPersona(new Persona("pablo", 90), true);
        assertEquals(240, elAscensor.getOcupacion(), 0);
        elAscensor.entrarSalirPersona(new Persona("jorge", 90), true);
        assertEquals(330, elAscensor.getOcupacion(), 0);
        elAscensor.entrarSalirPersona(new Persona("mark", 90), true);
        assertEquals(330, elAscensor.getOcupacion(), 0);
        elAscensor.entrarSalirPersona(new Persona("Teresa", 50), true);
        assertEquals(330, elAscensor.getOcupacion(), 0);
        elAscensor.entrarSalirPersona(new Persona("bebé", 20), true);
        assertEquals(350, elAscensor.getOcupacion(), 0);
        
        

        // Se baja alguien
        elAscensor.entrarSalirPersona(new Persona("pablo", 90), false);
        assertEquals(260, elAscensor.getOcupacion(), 0);
        
        // Sube alguien más
        elAscensor.entrarSalirPersona(new Persona("Teresa", 50), true);
        assertEquals(310, elAscensor.getOcupacion(), 0);
    }
}
