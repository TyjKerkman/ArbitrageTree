package base;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

    public Node<Currency> root;
    private ArrayList<Currency> allChildren;
    
    public Tree(Node<Currency> USD, ArrayList<Currency> allChildren) {
        // TODO Auto-generated constructor stub
        this.root = USD;
        this.allChildren = allChildren;
        this.initialize();
    }
    
    
    private void initialize() {
        int depth = 0;
        ArrayList<Node<Currency>> rootsChildren = new ArrayList<Node<Currency>>();
        for(Currency currency0 : allChildren) {
            depth = 1;
            Node<Currency> child1 = new Node<Currency>(currency0, this.root);
            ArrayList<Currency> allChildren0 = new ArrayList<Currency>(allChildren);
            allChildren0.remove(currency0);
            ArrayList<Node<Currency>> children0children = new ArrayList<Node<Currency>>();
            child1.setChildren(children0children);
            child1.setDepth(depth);
            rootsChildren.add(child1);
            for(Currency currency1 : allChildren0) {
                depth = 2;
                Node<Currency> child2 = new Node<Currency>(currency1, child1);
                ArrayList<Currency> allChildren1 = new ArrayList<Currency>(allChildren0);
                allChildren1.remove(currency1);
                ArrayList<Node<Currency>> children1children = new ArrayList<Node<Currency>>();
                child2.setChildren(children1children);
                child2.setDepth(depth);
                children0children.add(child2);
                for(Currency currency2 : allChildren1) {
                    depth = 3;
                    Node<Currency> child3 = new Node<Currency>(currency2, child2);
                    child3.setDepth(depth);
                    children1children.add(child3);
                }
            }
        }
        root.setChildren(rootsChildren);
    }

    @Override
    public String toString() {
        
        String toReturn = "";
        toReturn += "Root: " + this.root.getCurrency() + ". Depth: " + this.root.depth;
        toReturn += "\nChildren: ";
        for(Node<Currency> node : root.children) {
            toReturn += node.getCurrency() + " ";
        }
        for(Node<Currency> node : root.children) {
            toReturn += node.toString();
        }
        return toReturn;
        
    }
    
}
