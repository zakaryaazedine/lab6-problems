package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    protected ArrayList<Double> transations = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
