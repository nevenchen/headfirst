package headfirst11.flyweight.client;

import headfirst11.flyweight.Book;
import headfirst11.flyweight.Flyweight;
import headfirst11.flyweight.concerete.FlyweightFactory;

public class FlyweightPattern {

	FlyweightFactory	factory	= new FlyweightFactory();
	Flyweight			fly1;
	Flyweight			fly2;
	Flyweight			fly3;
	Flyweight			fly4;
	Flyweight			fly5;
	Flyweight			fly6;

	/** */
	/** Creates a new instance of FlyweightPattern */
	public FlyweightPattern() {
		Book book1 = new Book("领域驱动模型","图灵精品图书出版社",128L);
		Book book2 = new Book("HeadFirst","清华出版社",228L);
		fly1 = factory.getFlyWeight(book1);
		fly2 = factory.getFlyWeight(book2);
		fly3 = factory.getFlyWeight(book1);
		fly4 = factory.getFlyWeight(book1);
		fly5 = factory.getFlyWeight(book1);
		fly6 = factory.getFlyWeight(book1);
	}// end FlyweightPattern()

	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}// end showFlyweight()

	public static void main(String[] args) {
		System.out.println("The FlyWeight Pattern!");
		FlyweightPattern fp = new FlyweightPattern();
		fp.showFlyweight();
	}// end main()
}
