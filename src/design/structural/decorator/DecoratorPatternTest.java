package design.structural.decorator;

/*
 * Decorator Design pattern is used to modify the functionality of an object at runtime.
 * Other instances of the same class will not be modified by this.
 * 
 * Inheritance or composition extend the behavior at compile time.
 * At runtime we can add or remove functionality with Decorator Pattern.
 */
public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}
}
