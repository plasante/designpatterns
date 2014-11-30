package design.creational.factory;

/*
 * This pattern is used when we have a super class with multiple sub-classes
 * and based on input, we need to return one of the sub-class.
 * 
 * This pattern provides approach to code for interface rather than implementation.
 * It removes the instantiation of actual implementation classes from client code.
 * More robust, less coupled and easy to extend.
 * We can easily change PC.java implementation because client program is unaware of this.
 * Client program does not even know that PC.java or Server.java exists.
 * Client program only know that it must use ComputerFactory.getComputer() to get a Computer.
 */
public class FactoryPatternTest {

	public static void main(String[] args) {
		Computer pc =     ComputerFactory.getComputer("pc", "2 GB", "500 GP", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "3.5 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
