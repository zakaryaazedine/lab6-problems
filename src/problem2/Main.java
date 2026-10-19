package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Test Bank");
        Customer ali = new Customer("Ali");
        Customer sara = new Customer("Sara");
        Customer unknown = new Customer("Unregistered");

        bank.addCustomer(ali);
        bank.addCustomer(sara);
        bank.addCustomer(ali);

        bank.addTransation(ali, 1000.0);
        bank.addTransation(ali, -250.0);
        bank.addTransation(sara, 500.0);
        bank.addTransation(sara, -100.0);
        bank.addTransation(sara, 0.0);
        bank.addTransation(unknown, 200.0);

        System.out.println("=== Ali ===");
        bank.printCustomer(ali);

        System.out.println("\n=== Sara ===");
        bank.printCustomer(sara);

        System.out.println("\n=== Unregistered customer ===");
        bank.printCustomer(unknown);
    }
}
