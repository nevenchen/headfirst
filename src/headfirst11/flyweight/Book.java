package headfirst11.flyweight;


public class Book {
	

	private String bookName;
	private String publisher;
	private Long   bookPrice;
	
	public String toString() {
		return "Book: "+this.getBookName()+", published by: "+this.getPublisher()+", price: "+this.getBookPrice();
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	
	/**
	 * @param publisher the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	/**
	 * @return the bookPrice
	 */
	public Long getBookPrice() {
		return bookPrice;
	}
	
	/**
	 * @param bookPrice the bookPrice to set
	 */
	public void setBookPrice(Long bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(String bookName, String publisher, Long bookPrice) {
		super();
		this.bookName = bookName;
		this.publisher = publisher;
		this.bookPrice = bookPrice;
	}
}
