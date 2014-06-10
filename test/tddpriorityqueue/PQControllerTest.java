/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tddpriorityqueue;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tyler
 */
public class PQControllerTest
{
    
    public PQControllerTest()
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
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getUserInput method, of class PQController.
     */
    @Test
    public void testGetUserInput()
    {
        System.out.println("getUserInput");
        String testInputString = "Tyler 3";
        Scanner testInput = new Scanner(testInputString);
        PQController instance = new PQController();
        instance.getUserInput(testInput);
    }
    
}
