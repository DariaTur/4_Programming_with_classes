package by.epam.training.module4;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	private List<Book> books;
	
	public BookList() {
		books = new ArrayList<Book>();
	};
	
	public BookList(List<Book> books) {
		this.books = books;
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book getBook(int ind) {
		return books.get(ind);
	}
	
	public int getSize() {
		return books.size();
	}
	
	public void setBook(int ind, Book book) {
		books.set(ind, book);
	}
}
