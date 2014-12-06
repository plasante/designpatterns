package design.structural.proxy;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Pierre", "123456");
		try {
			executor.runCommand("ls -al");
			executor.runCommand("rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message:: " + e.getMessage());
		}
	}
}
