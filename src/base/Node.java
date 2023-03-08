package base;

import java.util.ArrayList;

@SuppressWarnings("hiding") public class Node<Currency> {
    
    Node<Currency> parent = null;
    ArrayList<Node<Currency>> children = new ArrayList<Node<Currency>>();
    Currency currency;
    int depth;

    // Normal Node
    public Node(Currency currency, Node<Currency> parent) {
        // TODO Auto-generated constructor stub
        this.currency = currency;
        this.parent = parent;
    }
    
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    public ArrayList<Node<Currency>> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node<Currency>> children) {
        this.children = children;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
    
    public Node<Currency> getParent() {
        return parent;
    }

    public void setParent(Node<Currency> parent) {
        this.parent = parent;
    }
    
    @Override
    public String toString() {

        String toReturn = "\nNode: " + this.currency + ". Depth: " + this.depth;
        if(this.depth < 3) {
            toReturn += "\nChildren: ";
            for(Node<Currency> node : this.children) {
                toReturn += node.getCurrency() + " ";
            }
            for(Node<Currency> node : this.children) {
                toReturn += node.toString();
            } 
        }
        return toReturn;
    }

}
