package headfirst22.factory_method;

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
