package headfirst24.simple_factory;

public class Apple implements Fruit {

	@Override
	public void enableEat() {
		System.out.println("Eat Apple");
	}

	@Override
	public void plant() {
		System.out.println("Plan Apple");
	}
}
