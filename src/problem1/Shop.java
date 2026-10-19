package problem1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        ArrayList<Item> cart = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        String keepShopping = "y";

        do {
            System.out.print("Enter the name of the item: ");
            String itemName = scan.nextLine();
            System.out.print("Enter the unit price: ");
            double itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            int quantity = scan.nextInt();

            scan.nextLine();

            Item item = new Item(itemName, itemPrice, quantity);
            cart.add(item);

            System.out.println("\nShopping cart:");
            double total = 0;
            for (int i=0;i<cart.size();i++) {
                System.out.printf("%s - Unit price: %.2f, Quantity: %d%n", cart.get(i).getName(), cart.get(i).getPrice(), cart.get(i).getQuantity());
                total += cart.get(i).getPrice() * cart.get(i).getQuantity();
            }
            System.out.printf("Total: %.2f%n", total);

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine().trim();
        } while (keepShopping.equalsIgnoreCase("y"));
        scan.close();
    }
}
