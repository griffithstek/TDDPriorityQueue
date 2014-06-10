/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tddpriorityqueue;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author tyler
 */
public class Driver 
{   
    public static void main(String[] args) 
    {
        System.out.println("Priority Queue Project");
        System.out.println("CS 2450");
        System.out.println("Tyler Griffiths \n");
        
        PQController controller = new PQController();
        Scanner consoleIn = new Scanner(System.in);
        controller.getUserInput(consoleIn);
    }
    
    private static void getUserInput(Scanner in)
    {
        String name = null;
        String priorityNumString = null;
        int priorityNum = 0;
        while(!in.equals(""))
        {
            System.out.println("Please enter a name followed by a priority number:");
            name = in.next();
            priorityNumString = in.next();
            priorityNum = new Integer(priorityNumString);
            PNode node = new PNode(name, priorityNum);
            pQueue.add(name, priorityNum);
        }
    }
    
}
