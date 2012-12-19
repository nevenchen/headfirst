package headfirst19.memento;

public class Memento {

	private String	state;

	public Memento(String state) { // 备份
		this.state = state;
	}

	public String getState() { // 获得状态
		return this.state;
	}

	public void setState(String state) { // 设置状态
		this.state = state;
	}
}
