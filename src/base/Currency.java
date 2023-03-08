package base;

public class Currency {

    private String name;
    private double value;
    
    public Currency(String name, double value) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.value = value;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    public double getValue() {
        return this.value;
    }

}
