package headfirst22.factory_method;

/**
 * @Class：
 * @Description:
 * 把水果工厂定义成接口再用各种水果去实现自己的实例，这样做的好处就是如果再增加一种水果，
 * 只要增加它的对象和实现工厂就可以了，而不必修改任何代码。
 * TODO: 
 *A：工厂方法模式和简单工厂模式在结构上的不同是很明显的。工厂方法模式的核心是一个抽象工厂类，而简单工厂模式把核心放在一
 *个具体类上。工厂方法模式可以允许很多具体工厂类从抽象工厂类中将创建行为继承下来，从而可以成为多个简单工厂模式的综合，
 *进而推广了简单工厂模式。 

  B：工厂方法模式退化后可以变得很像简单工厂模式。设想如果非常确定一个系统只需要一个具体工厂类，那么就不妨把抽象工厂类合
  并到具体的工厂类中去。由于反正只有一个具体工厂类，所以不妨将工厂方法改成为静态方法，这时候就得到了简单工厂模式。
  
  C：如果需要加入一个新的水果，那么只需要加入一个新的水果类以及它所对应的工厂类。没有必要修改客户端，也没有必要修改抽象工
  厂角色或者其他已有的具体工厂角色。对于增加新的水果类而言，这个系统完全支持"开-闭"原则。 

  D：对Factory Method模式而言，它只是针对一种类别（如本例中的水果类Fruit），但如果我们还想买肉，那就不行了，这是就必须要
  Abstract Method模式帮忙了。 


 * @author: Neven Chen
 * @Date	 11 Nov 2010 11:15:35
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
		// Apple
		AppleFactory appleFactory = new AppleFactory();
		appleFactory.getFruitFactory().plant();
		appleFactory.getFruitFactory().enableEat();
		// So if you want add pear, you shall add pear and pear factory class.
		// and not need modify anything.
		// Pear
		//PearFactory pearFactory = new PearFactory();
		//pearFactory.getFruitFactory().plant();
		//pearFactory.getFruitFactory().enableEat();
	}
}
