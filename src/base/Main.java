package base;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated constructor stub
        Currency USD = new Currency("USD", 1);
        Currency YEN = new Currency("YEN", 2);
        Currency GBP = new Currency("GBP", 2);
        Currency EUR = new Currency("EUR", 2);
        Currency AUD = new Currency("AUD", 2);
        Currency AAA = new Currency("AAA", 2);
        Currency BBB = new Currency("BBB", 2);
        
        ArrayList<Currency> allChildren = new ArrayList<Currency>(); 
        allChildren.add(YEN);
        allChildren.add(GBP);
        allChildren.add(EUR);
        allChildren.add(AUD);
        allChildren.add(AAA);
        allChildren.add(BBB);
//        System.out.println(allChildren.toString());    
        Node<Currency> root = new Node<Currency>(USD, null);
        Tree<Node<Currency>> tree = new Tree<Node<Currency>>(root, allChildren);
//        System.out.println(tree);
        ArbitrageLoop<Currency> loop = new ArbitrageLoop<Currency>();
        System.out.println(loop.findArbitrage(tree));

        
    }

}
