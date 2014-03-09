package madhav;

import bookresource.BookInterface;

public class Student {
	int id;
	String name;
	BookInterface book;
	
	public Student(BookInterface book){
		id=45;
		name="madhav";
		this.book=book;
	}
	
	public void display(){
		System.out.println("id="+id);
		System.out.println("name="+name);
		book.setName();
		System.out.println("bookname:"+book.getName());
	}


}
