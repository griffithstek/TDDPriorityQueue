/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tddpriorityqueue;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tyler
 */
public class PriorityQueueTest {
    
    public PriorityQueueTest() {
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
     * Test of add method, of class PriorityQueue.
     */
    @Test
    public void testAdd()
    {
        System.out.println("add");
        String name = "";
        int priorityNum = 0;
        PriorityQueue instance = new PriorityQueue();
        
        ArrayList<PNode> testNodesArr = new ArrayList<PNode>();
        testNodesArr.add(new PNode("Sally", 2));
        testNodesArr.add(new PNode("Joe", 3));
        testNodesArr.add(new PNode("Bob", 2));
        testNodesArr.add(new PNode("John", 1));
        testNodesArr.add(new PNode("Jane", 5));
        testNodesArr.add(new PNode("Jill", 2));
        
        ArrayList<PNode> correctNamesArr = new ArrayList<PNode>();
        correctNamesArr.add(new PNode("Jane", 5));
        correctNamesArr.add(new PNode("Jill", 2));
        correctNamesArr.add(new PNode("Joe", 3));
        correctNamesArr.add(new PNode("Sally", 2));
        correctNamesArr.add(new PNode("Bob", 2));
        correctNamesArr.add(new PNode("John", 1));
        
        for(int i = 0; i < testNodesArr.size(); i++)
        {
            instance.add(testNodesArr.get(i));
        }  
        
        ArrayList<PNode> testPQueue = instance.getPQueue();
        assertArrayEquals(correctNamesArr.toArray(), testPQueue.toArray());
    }

    /**
     * Test of getPQueue method, of class PriorityQueue.
     */
    @Test
    public void testGetPQueue()
    {
        System.out.println("getPQueue");
        PriorityQueue instance = new PriorityQueue();
        ArrayList<PNode> expResult = null;
        ArrayList<PNode> result = instance.getPQueue();
        assertEquals("pQueue was not initialized to null", expResult, result);

    }
    
}
