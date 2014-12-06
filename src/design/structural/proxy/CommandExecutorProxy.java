package design.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd) {
		if ("Pierre".equals(user) && "123456".equals(pwd)) isAdmin = true;
		executor = new CommandExecutorImpl();
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin");
			} else {
				executor.runCommand(cmd);
			}
		}
	}
}
