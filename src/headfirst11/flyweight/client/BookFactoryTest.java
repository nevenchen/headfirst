package headfirst11.flyweight.client;

import headfirst11.flyweight.Book;
import headfirst11.flyweight.concerete.BookFactory;


public class BookFactoryTest {
	BookFactory	factory	= new BookFactory();
	Book			fly1;
	Book			fly2;
	Book			fly3;
	Book			fly4;
	Book			fly5;
	Book			fly6;

	/** */
	/** Creates a new instance of FlyweightPattern */
	public BookFactoryTest() {
		Book book1 = new Book("领域驱动模型","图灵精品图书出版社",128L);
		Book book2 = new Book("HeadFirst","清华出版社",228L);
		fly1 = factory.getBook(book1);
		fly2 = factory.getBook(book2);
		fly3 = factory.getBook(book1);
		fly4 = factory.getBook(book1);
		fly5 = factory.getBook(book1);
		fly6 = factory.getBook(book1);
	}// end FlyweightPattern()

	public void showFlyweight() {
		System.out.println(fly1.toString());
		System.out.println(fly2.toString());
		System.out.println(fly3.toString());
		System.out.println(fly4.toString());
		System.out.println(fly5.toString());
		System.out.println(fly6.toString());
	}// end showFlyweight()

	public static void main(String[] args) {
		System.out.println("The FlyWeight Pattern!");
		BookFactoryTest fp = new BookFactoryTest();
		fp.showFlyweight();
	}// end main()
}
