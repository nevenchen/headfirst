package headfirst1.callback;


public class Client {

	/**
	 * @Description:
	 *
	 * @author: Neven Chen
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		Listener listener = new Listener(new Callback());
		listener.doIt();
	}
}
