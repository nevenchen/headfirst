package headfirst19.memento;

public class Test {

	public static void main(String args[]) {
		WindowsSystem Winxp = new WindowsSystem(); // Winxp系统
		User user = new User(); // 某一用户
		Winxp.setState("好的状态"); // Winxp处于好的运行状态
		user.saveMemento(Winxp.createMemento()); // 用户对系统进行备份，Winxp系统要产生备份文件
		Winxp.setState("坏的状态"); // Winxp处于不好的运行状态
		Winxp.restoreMemento(user.retrieveMemento()); // 用户发恢复命令，系统进行恢复
		System.out.println("当前系统处于" + Winxp.getState());
	}
}
