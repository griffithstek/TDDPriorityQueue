
package tddpriorityqueue;

public class PNode
{
    private String name = null;
    private int priority = 0;
    
    public PNode(String name, int priority)
    {
        this.name = name;
        this.priority = priority;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getPriority()
    {
        return priority;
    }
    
}
