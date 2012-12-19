package headfirst23.abstract_factory;

public class MyFactory implements IFactory {

	@Override
	public Fruit getFruitFactory(Fruit whichFruit) {
		// TODO Auto-generated method stub
		return whichFruit;
	}

	@Override
	public Meat getMeatFactory(Meat whichMeat) {
		// TODO Auto-generated method stub
		return whichMeat;
	}
}
