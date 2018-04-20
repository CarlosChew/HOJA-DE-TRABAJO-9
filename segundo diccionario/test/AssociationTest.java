/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ottoalexander
 */
public class AssociationTest {
    
    public AssociationTest() {
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
     * Test of getKey method, of class Association.
     */
    @Test
    public void testGetKey() {
        System.out.println("getKey");
        Association instance = null;
        Object expResult = null;
        Object result = instance.getKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Association.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Association instance = null;
        Object expResult = null;
        Object result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Association.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Object v = null;
        Association instance = null;
        Object expResult = null;
        Object result = instance.setValue(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Association.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object key = null;
        Association instance = null;
        int expResult = 0;
        int result = instance.compareTo((Comparable) key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
