package headfirst24.simple_factory;

/**
 * @Class：
 * @Description:测试类，根椐不同的输入参数从工厂类中得到对应的实例并调用相应实例的方法 TODO:
 * 
 * A：我要需要苹果，只需向工厂角色（FruitFactory）请求即可。而工厂角色在接到请求后，会自行判断创建和提供哪一个产品。  
 * 
   B：但是对于工厂角色（FruitFactory）来说，增加新的产品（比如说增加草莓）就是一个痛苦的过程。工厂角色必须知道每一种产品，
     如何创建它们，以及何时向客户端提供它们。换言之，接纳新的产品意味着修改这个工厂。 
     
   C：因此Simple Factory模式的开放性比较差。 

   有什么办法可以解决这个问题吗？那就需要Factory Method模式来为我们服务了。
 * @author: Neven Chen
 * @Date 11 Nov 2010 11:06:38 Revision history:
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
		Fruit fruit = FruitFactory.getFruitFactory("Apple");
		fruit.plant();
		fruit.enableEat();
	}
}
