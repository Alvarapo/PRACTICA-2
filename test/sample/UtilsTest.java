/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author usuario
 */
public class UtilsTest extends TestCase{
    
    public UtilsTest() {
        System.out.println("Inicializamos la clase UtilsTest");
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Ejecucion del metodo setUpClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Ejecucion del metodo tearDownClass");
    }
    
    @BeforeEach
    @Override
    public void setUp() {
        System.out.println("Ejecucion del metodo setUp");
    }
    
    @AfterEach
    @Override
    public void tearDown() {
        System.out.println("Ejecucion del metodo tearDown");
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testConcatWords() {
        System.out.println("concatWords");
        String[] words = {"Mi","nombre","es","Alvaro","Rofa"};
        String expResult = "MinombreesAlvaroRofa";
        String result = Utils.concatWords(words);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("Las cadenas no son iguales");
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        int number = 4;
        String expResult = "24";
        String result = Utils.computeFactorial(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of normalizeWord method, of class Utils.
     */
    @Test
    public void testNormalizeWord() {
        System.out.println("normalizeWord");
        String word = "";
        String expResult = "";
        String result = Utils.normalizeWord(word);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
