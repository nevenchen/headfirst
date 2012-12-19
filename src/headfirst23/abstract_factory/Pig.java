package headfirst23.abstract_factory;

public class Pig implements Meat {

	@Override
	public void enableEat() {
		System.out.println("Eat Pig");
	}

	@Override
	public void feed() {
		System.out.println("Feed Pig");
	}
}
