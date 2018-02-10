/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorts;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Revilo
 */
public class RadixSortTest {
    
    public RadixSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of radixSort method, of class RadixSort.
     */
    @Test
    public void testRadixSort() {
        System.out.println("radixSort");
        Comparable[] cant = null;
        int[] numeros = null;
        RadixSort instance = new RadixSort();
        int[] expResult = null;
        int[] result = instance.radixSort(cant, numeros);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
