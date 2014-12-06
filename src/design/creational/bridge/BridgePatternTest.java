package design.creational.bridge;

public class BridgePatternTest {
	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape pentagone = new Pentagon(new GreenColor());
		pentagone.applyColor();
	}
}
