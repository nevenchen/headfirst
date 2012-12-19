package headfirst24.simple_factory;

/**
 * @Class：
 * @Description:买水果工厂类，可根据不同的参数类型返回对应的实例
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 11 Nov 2010 11:05:54
 * Revision history:
 *
 * @see 	 
 */
public class FruitFactory {

	public static Fruit getFruitFactory(String fruitType) {
		if (fruitType.equals("Apple")) {
			return new Apple();
		}
		if (fruitType.equals("Grape")) {
			return new Grape();
		}
		return null;
		/*
		 * Fruit fruit = null;
		 * 
		 * try {
		 * 
		 * fruit = (Fruit)Class.forName("designpattern.factory.simplefactory." + fruitType).newInstance(); } catch (InstantiationException e) { //
		 * TODO Auto-generated catch block
		 * 
		 * e.printStackTrace(); } catch (IllegalAccessException e) { // TODO Auto-generated catch block
		 * 
		 * e.printStackTrace(); } catch (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * 
		 * e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * return fruit;
		 */
	}
}
