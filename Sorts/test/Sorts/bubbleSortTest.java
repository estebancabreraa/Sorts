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
public class bubbleSortTest {
    
    public bubbleSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class bubbleSort.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        bubbleSort.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bubbleSort method, of class bubbleSort.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        int[] nums = null;
        bubbleSort instance = new bubbleSort();
        int[] expResult = null;
        int[] result = instance.bubbleSort(nums);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
