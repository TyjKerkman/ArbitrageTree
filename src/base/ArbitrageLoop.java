package base;

import java.util.List;
import java.util.Stack;

public class ArbitrageLoop<T> {

    Stack<Currency> stack = new Stack<Currency>();
    boolean found = false;
    
    public ArbitrageLoop() {
        // TODO Auto-generated constructor stub
    }
    
    public Stack<Currency> findArbitrage(Tree<Node<Currency>> t){
        findArbitrage(t.root);
        return stack;
    }
    
    private void findArbitrage(Node<Currency> node) {
        if(node.depth == 3 && getProduct() > 1) {
            System.out.println("FOUND SUCCESSFUL");
            found = true;
            return;
        }else if(node.depth < 3 && !found){
            for(Node<Currency> child : node.getChildren()) {
                stack.add(child.currency);
                findArbitrage(child);
                if(found) {
                    return;
                }
                stack.pop();
            }
        }
        return null;
        
    }
    
    private double getProduct() {
        double product = 1;
        for(Currency currency : stack) {
            product *= currency.getValue();
        }
        return product;
        
    }

}
