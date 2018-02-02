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
public class CalculadoraITest {
    
    public CalculadoraITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcular method, of class CalculadoraI.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        String string = "";
        CalculadoraI instance = new CalculadoraIImpl();
        String expResult = "";
        String result = instance.calcular(string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class CalculadoraIImpl implements CalculadoraI {

        public String calcular(String string) {
            return "";
        }
    }
    
}
