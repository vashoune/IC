/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationcontinue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nold
 */
public class IntegrationContinueTest {
    
    public IntegrationContinueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isPair method, of class IntegrationContinue.
     * Check if an unpair number returns false
     */
    @Test
    public void testIsNotPair1() {
        int number = 3;
        boolean expResult = false;
        boolean result = IntegrationContinue.isPair1(number);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPair method, of class IntegrationContinue.
     * Check if a pair number returns true
     */
    @Test
    public void testIsPair1() {
        int number = 2;
        boolean expResult = true;
        boolean result = IntegrationContinue.isPair1(number);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of isPair2 method, of class IntegrationContinue.
     * Check if a pair number returns true
     */
    @Test
    public void testIsPair2() {
        int number = 2;
        boolean expResult = true;
        boolean result = IntegrationContinue.isPair2(number);
        assertEquals(expResult, result);
    }
    
}
