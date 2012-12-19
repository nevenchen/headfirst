package headfirst22.factory_method;

public class AppleFactory implements FruitFactory {

	@Override
	public Fruit getFruitFactory() {
		return new Apple();
	}
}
