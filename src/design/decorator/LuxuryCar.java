package design.decorator;

public class LuxuryCar extends CarDecorator {
	public LuxuryCar(Car c) {
		super(c);
	}
	
	public void assemble() {
		car.assemble();
		System.out.print(" Adding features of Luxury Car.");
	}
}
