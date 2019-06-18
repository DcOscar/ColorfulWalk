/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logico;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oscar
 */
public class ColorfulWalkTest {

    @Test
    public void testUno() {
        int cantidadCasas = 5;
        int[] coloresCasas = new int[]{1, 2, 3, 2, 3};
        int cantidadAMover = ColorfulWalk.cantidadCasasARecorrer(cantidadCasas, coloresCasas);
        assertEquals(4, cantidadAMover);
    }

    @Test
    public void testDos() {
        int cantidadCasas = 3;
        int[] coloresCasas = new int[]{1, 2, 1};
        int cantidadAMover = ColorfulWalk.cantidadCasasARecorrer(cantidadCasas, coloresCasas);
        assertEquals(1, cantidadAMover);
    }

    @Test
    public void testTres() {
        int cantidadCasas = 7;
        int[] coloresCasas = new int[]{1, 1, 3, 1, 1, 1, 1};
        int cantidadAMover = ColorfulWalk.cantidadCasasARecorrer(cantidadCasas, coloresCasas);
        assertEquals(4, cantidadAMover);
    }

}
