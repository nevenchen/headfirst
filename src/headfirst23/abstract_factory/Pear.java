package headfirst23.abstract_factory;

public class Pear implements Fruit {

	@Override
	public void enableEat() {
		System.out.println("Eat Pear");
	}

	@Override
	public void plant() {
		System.out.println("Plan Pear");
	}
}
