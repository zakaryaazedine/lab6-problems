package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<Customer>();



    public Bank(String name) {
        this.name = name;
    }

    public void addCustomer(Customer c){
        if(customers.contains(c)) return;
        else customers.add(c);
    }

    public void addTransation(Customer c, Double transactionAmount){
        if (customers.contains(c)) c.transations.add(transactionAmount);
    }

    public void printCustomer(Customer c){
        System.out.println("Bank name: " + name);
        System.out.println("Customer name :   "+ c.getName());
        System.out.println("-------- Transactions amounts --------");
        for (int i=0;i<c.transations.size();i++) System.out.println(c.transations.get(i).doubleValue());


    }



}
