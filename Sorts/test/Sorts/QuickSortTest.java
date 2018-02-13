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
public class QuickSortTest {
    
    public QuickSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class QuickSort.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QuickSort.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of QuickSort method, of class QuickSort.
     */
    @Test
    public void testQuickSort() {
        System.out.println("QuickSort");
        int[] numeros = null;
        QuickSort instance = new QuickSort();
        int[] expResult = null;
        int[] result = instance.QuickSort(numeros);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quicksort2 method, of class QuickSort.
     */
    @Test
    public void testQuicksort2() {
        System.out.println("quicksort2");
        int[] numeros = null;
        int izq = 0;
        int der = 0;
        QuickSort instance = new QuickSort();
        int[] expResult = null;
        int[] result = instance.quicksort2(numeros, izq, der);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
