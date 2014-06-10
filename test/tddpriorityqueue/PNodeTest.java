/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tddpriorityqueue;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 *
 * @author tyler
 */
@Category(GoodTestsCategory.class)
public class PNodeTest
{
    private PNode testPNode = null;
    
    public PNodeTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
        testPNode = new PNode("John", 3);
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getName method, of class PNode.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        String expResult = "John";
        String result = testPNode.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPriority method, of class PNode.
     */
    @Test
    public void testGetPriority()
    {
        System.out.println("getPriority");
        int expResult = 3;
        int result = testPNode.getPriority();
        assertEquals(expResult, result);
    }
    
}
