package lab7;

import java.util.ArrayList;

public class ShoppingBasket {

	ArrayList<ShoppingBasketItem> items = new ArrayList<>();
	double total;

	ArrayList<ShoppingBasketItem> add(ShoppingBasketItem item) {
		items.add(item);
		total += item.price;
		return items;
	}

	@Override
	public String toString() {
		StringBuilder details = new StringBuilder(
				"ShoppingBasket with total of £" + total + " for " + items.size() + " items:\n");
		for (ShoppingBasketItem item : items) {
			details.append(item.getDetails().indent(2));
		}
		return details.toString();
	}

}
