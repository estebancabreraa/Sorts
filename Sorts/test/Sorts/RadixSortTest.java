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
     * Test of main method, of class RadixSort.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        RadixSort.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMax method, of class RadixSort.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        int[] arr = null;
        int n = 0;
        int expResult = 0;
        int result = RadixSort.getMax(arr, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countSort method, of class RadixSort.
     */
    @Test
    public void testCountSort() {
        System.out.println("countSort");
        int[] arr = null;
        int n = 0;
        int exp = 0;
        RadixSort.countSort(arr, n, exp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
