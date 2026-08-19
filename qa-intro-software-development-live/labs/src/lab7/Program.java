package lab7;

import java.util.*;

public class Program {
    static Queue<ShoppingBasket> baskets = new LinkedList<>();

    public static void main(String[] args) {

        ShoppingBasket first = new ShoppingBasket();
        first.add(new ShoppingBasketItem("egg", 12, 2.99));
        first.add(new ShoppingBasketItem("milk", 2, 1.20));

        ShoppingBasket second = new ShoppingBasket();
        second.add(new ShoppingBasketItem("bread", 1, 2.0));

        ShoppingBasket third = new ShoppingBasket();
        third.add(new ShoppingBasketItem("egg", 12, 2.99));
        third.add(new ShoppingBasketItem("milk", 2, 1.20));
        third.add(new ShoppingBasketItem("bread", 1, 2.00));

        baskets.add(first);
        baskets.add(second);
        baskets.add(third);

        processBaskets(baskets);
    }

    static void processBaskets(Queue<ShoppingBasket> shoppingBasket) {
        while (!shoppingBasket.isEmpty()) {
            System.out.println(shoppingBasket.poll());
        }
    }
}
