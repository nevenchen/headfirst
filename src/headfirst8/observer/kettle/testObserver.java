package headfirst8.observer.kettle;

public class testObserver {

	/**
	 * @Description:更改header添加观察着的顺序可以看到最后被添加的观察者最新得到通知
	 *
	 * @author: Neven Chen
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		Heater header = new Heater();
		Display display = new Display();
		Alarm alarm = new Alarm();
		header.addObserver(alarm);
		header.addObserver(display);
		display.addObserver(alarm);
		header.boilWater();
	}
}
