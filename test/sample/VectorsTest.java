/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author usuario
 */
public class VectorsTest extends TestCase{
    
    public VectorsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    @Override
    public void setUp() {
    }
    
    @AfterEach
    @Override
    public void tearDown() {
    }

    /**
     * Test of equal method, of class Vectors.
     */
    @Test
    public void testEqual() {
        System.out.println("equal");
        int[] a = new int[] {1,2,3};
        int[] b = new int[] {1,2,3};
        boolean expResult = true;
        boolean result = Vectors.equal(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of scalarMultiplication method, of class Vectors.
     */
    @Test
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        int[] a = new int[] {1,2,3};
        int[] b = new int[] {1,2,3};
        int expResult = 14;
        int result = Vectors.scalarMultiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
