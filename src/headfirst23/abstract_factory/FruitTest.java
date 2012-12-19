package headfirst23.abstract_factory;

/**
 * @Class：
 * @Description:
	A：抽象工厂模式可以向客户端提供一个接口，使得客户端在不必指定产品的具体类型的情况下，创建多个产品族中的产品对象。
	这就是抽象工厂模式的用意。 
	
	B：抽象工厂模式是所有形态的工厂模式中最为抽象和最具一般性的一种形态。 
	
	C：抽象工厂模式与工厂方法模式的最大区别就在于，工厂方法模式针对的是一个产品（Fruit）等级结构；
	而抽象工厂模式则需要面对多个产品等级结构(Fruit、Meat)。 


 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 11 Nov 2010 11:24:59
 * Revision history:
 *
 * @see 	 
 */
public class FruitTest {

	/**
	 * 
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Fruit apple = new Apple();
		Meat pig = new Pig();
		MyFactory my = new MyFactory();
		my.getFruitFactory(apple).plant();
		my.getFruitFactory(apple).enableEat();
		System.out.println("---------------------------");
		my.getMeatFactory(pig).feed();
		my.getMeatFactory(pig).enableEat();
	}
}
