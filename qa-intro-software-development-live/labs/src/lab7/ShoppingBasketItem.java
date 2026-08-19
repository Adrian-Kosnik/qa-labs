package lab7;

public class ShoppingBasketItem {

    String productName;
    int quantity;
    double price;

    public ShoppingBasketItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getDetails() {
        return "\nProduct Name: " + productName + "\nQuantity: " + quantity + "\nPrice: " + price;
    }

    @Override
    public String toString() {
        return getDetails();
    }

}
