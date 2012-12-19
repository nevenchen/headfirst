package headfirst23.abstract_factory;

public interface IFactory {

	public Fruit getFruitFactory(Fruit whichFruit);

	public Meat getMeatFactory(Meat whichMeat);
}
