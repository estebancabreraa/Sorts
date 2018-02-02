/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Revilo
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular_1args_1() {
        System.out.println("calcular");
        String cadena = "";
        Calculadora instance = new Calculadora();
        String expResult = "";
        String result = instance.calcular(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Calcular method, of class Calculadora.
     */
    @Test
    public void testCalcular_1args_2() {
        System.out.println("Calcular");
        String _2__4__3_ = "";
        Calculadora instance = new Calculadora();
        boolean expResult = false;
        boolean result = instance.Calcular(_2__4__3_);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
