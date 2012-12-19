package headfirst22.factory_method;

public class GrapeFactory implements FruitFactory {

	@Override
	public Fruit getFruitFactory() {
		return new Grape();
	}
}
