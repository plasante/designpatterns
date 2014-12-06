package design.structural.composite;

/*
 * When we need to create a structure in a way that the objects in the structure
 * has to be treated the same way, we can apply composite design pattern.
 */
public class CompositePatternTest {
	public static void main(String[] args) {
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape circle = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(circle);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(circle);
		
		drawing.draw("Green");
	}
}
