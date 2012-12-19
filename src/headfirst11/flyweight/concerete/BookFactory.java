package headfirst11.flyweight.concerete;

import headfirst11.flyweight.Book;

import java.util.Hashtable;


public class BookFactory {
	private Hashtable	Books	= new Hashtable(); 
	public Book getBook(Book book){
		Book returnBook;
		returnBook = (Book)this.Books.get(book);
		if(returnBook == null){
			this.Books.put(book, book);
			return book;
		}
		return returnBook;
	}
}
