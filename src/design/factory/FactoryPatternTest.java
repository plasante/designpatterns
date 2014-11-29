package design.factory;

public class FactoryPatternTest {

	public static void main(String[] args) {
		Computer pc =     ComputerFactory.getComputer("pc", "2 GB", "500 GP", "2.4 GHz");
		Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "3.5 GHz");
		System.out.println("Factory PC Config::" + pc);
		System.out.println("Factory Server Config::" + server);
	}
}
