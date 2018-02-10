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
public class SortsTest {
    
    public SortsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of crearArreglo method, of class Sorts.
     */
    @Test
    public void testCrearArreglo() {
        System.out.println("crearArreglo");
        int n = 0;
        Comparable[] expResult = null;
        Comparable[] result = Sorts.crearArreglo(n);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bubbleSort method, of class Sorts.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        Comparable[] nums = null;
        Sorts instance = new Sorts();
        Comparable[] expResult = null;
        Comparable[] result = instance.bubbleSort(nums);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quickSort method, of class Sorts.
     */
    @Test
    public void testQuickSort() {
        System.out.println("quickSort");
        Comparable[] nums = null;
        int li = 0;
        int lf = 0;
        Sorts instance = new Sorts();
        Comparable[] expResult = null;
        Comparable[] result = instance.quickSort(nums, li, lf);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gnomeSort method, of class Sorts.
     */
    @Test
    public void testGnomeSort() {
        System.out.println("gnomeSort");
        Comparable[] nums = null;
        Sorts instance = new Sorts();
        Comparable[] expResult = null;
        Comparable[] result = instance.gnomeSort(nums);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of radixSort method, of class Sorts.
     */
    @Test
    public void testRadixSort() {
        System.out.println("radixSort");
        Comparable[] cant = null;
        int[] numeros = null;
        Sorts instance = new Sorts();
        int[] expResult = null;
        int[] result = instance.radixSort(cant, numeros);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mergeCall method, of class Sorts.
     */
    @Test
    public void testMergeCall() {
        System.out.println("mergeCall");
        Comparable[] arreglo = null;
        Sorts instance = new Sorts();
        instance.mergeCall(arreglo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of depurador method, of class Sorts.
     */
    @Test
    public void testDepurador() {
        System.out.println("depurador");
        Comparable[] arreglo = null;
        Comparable[] arreglo2 = null;
        int inicio = 0;
        int fin = 0;
        Sorts.depurador(arreglo, arreglo2, inicio, fin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mezclador method, of class Sorts.
     */
    @Test
    public void testMezclador() {
        System.out.println("mezclador");
        Comparable[] arreglo = null;
        Comparable[] izq = null;
        Comparable[] der = null;
        Sorts.mezclador(arreglo, izq, der);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
