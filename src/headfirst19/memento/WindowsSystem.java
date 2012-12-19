package headfirst19.memento;

public class WindowsSystem {

	private String	state;

	public Memento createMemento() { // 创建备份，保存当前状态
		return new Memento(state);
	}

	public void restoreMemento(Memento memento) { // 从备份中恢复系统
		this.state = memento.getState();
	}

	public String getState() { // 获得状态
		return this.state;
	}

	public void setState(String state) { // 设置状态
		this.state = state;
		System.out.println("当前系统处于" + this.state);
	}
}
