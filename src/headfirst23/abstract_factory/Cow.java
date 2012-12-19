package headfirst23.abstract_factory;

public class Cow implements Meat {

	@Override
	public void enableEat() {
		System.out.println("Eat Cow");
	}

	@Override
	public void feed() {
		System.out.println("Feed Cow");
	}
}
