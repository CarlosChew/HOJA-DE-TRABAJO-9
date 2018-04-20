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
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
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
     * Test of find method, of class BinaryTree.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        Object key = null;
        BinaryTree instance = new BinaryTree();
        Object expResult = null;
        Object result = instance.find((Comparable) key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class BinaryTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Object key = null;
        Object value = null;
        BinaryTree instance = new BinaryTree();
        instance.insert((Comparable) key, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class BinaryTree.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        BinaryTree instance = new BinaryTree();
        instance.display(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
