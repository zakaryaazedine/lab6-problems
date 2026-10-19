package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Item name cannot be blank");
        if (!Double.isFinite(price) || price < 0) throw new IllegalArgumentException("Price must be finite and non-negative");
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative");
        this.name = name.trim();
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
