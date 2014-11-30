package design.creational.abstractFactory;

/*
 * Provides approach to code for interface rather than implementation.
 * It is a "factory of factories" and can be easily extended to accomodate
 * more products, Laptop for example.
 * It is robust and avoid conditional logic of Factory pattern.
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		abstractFactoryTest();
	}
	
	private static void abstractFactoryTest() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB","2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB","1 TB","2.9 GHz"));
		
		System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config::"+server);
	}
}
