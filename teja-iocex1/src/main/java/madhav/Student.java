package madhav;

import bookresource.BookInterface;

public class Student {
	int id;
	String name;
	BookInterface book;
	public Student(){
		id=45;
		name="madhav";
	}
	public void display(){
		System.out.println("id="+id);
		System.out.println("name="+name);
		book.setName();
		System.out.println("bookname:"+book.getName());
	}
	public BookInterface getBook() {
		return book;
	}
	public void setBook(BookInterface book) {
		this.book = book;
	}
	
	
	
	
	
	

}
