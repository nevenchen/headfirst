package headfirst23.abstract_factory;

public class Grape implements Fruit {

	@Override
	public void enableEat() {
		System.out.println("Eat Grape");
	}

	@Override
	public void plant() {
		System.out.println("Plant Grape");
	}
}
