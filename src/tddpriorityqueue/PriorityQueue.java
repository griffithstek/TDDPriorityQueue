package tddpriorityqueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author tyler
 */
public class PriorityQueue 
{
    private ArrayList<PNode> pQueue;
    
    public PriorityQueue()
    {
        pQueue = new ArrayList<PNode>();
        pQueue = null;
    }
    
    public void add(PNode newNode)
    {
        for (PNode pNodeItem : pQueue)
        {
            if (pQueue == null)
            {
                pQueue.add(newNode);
            }
            else if (pNodeItem.getPriority() < newNode.getPriority())
            {
                pQueue.add(pQueue.indexOf(pNodeItem), newNode);
            }
            else if (pNodeItem.getPriority() == newNode.getPriority())
            {
                pQueue.add((pQueue.indexOf(pNodeItem) + 1), newNode);
            }
           
        }
    }
    
    public ArrayList<PNode> getPQueue()
    {
        return pQueue;
    }
    
}
