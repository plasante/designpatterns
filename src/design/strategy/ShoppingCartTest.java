package design.strategy;

/*
 * Strategy pattern is useful when we have multiple algorithms for a specific task
 * and we want our application to be flexible to chose any of the algorythm at runtime.
 */
public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		// pay by Paypal
		cart.pay(new PaypalStrategy("plasante@email.com","password"));
		
		// pay by Credit Card
		cart.pay(new CreditCardStrategy("Karo","12345","543","2001-01-01"));
	}
}
