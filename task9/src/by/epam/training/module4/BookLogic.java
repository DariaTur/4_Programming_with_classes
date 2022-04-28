package by.epam.training.module4;

public class BookLogic {
	private static BookLogic instance;
	
	private BookLogic() {};
	
	public static BookLogic getInstance() {
		if(instance == null) {
			instance = new BookLogic();
		} 
		return instance;
	}
	
	public BookList getBooksOfAuthor(BookList books, String author) {
		BookList result = new BookList();
		
		for(int i = 0; i<books.getSize(); i++) {
			if(books.getBook(i).getAuthor().equals(author)) {
				result.addBook(books.getBook(i));
			}
		}
		
		return result;
	}
	
	public BookList getBooksOfPublishingHouse(BookList books, String publishingHouse) {
		BookList result = new BookList();
		
		for(int i = 0; i<books.getSize(); i++) {
			if(books.getBook(i).getPublishingHouse().equals(publishingHouse)) {
				result.addBook(books.getBook(i));
			}
		}
		
		return result;
	}
	
	public BookList getBooksByYear(BookList books, int year) {
		BookList result = new BookList();
		
		for(int i = 0; i<books.getSize(); i++) {
			if(books.getBook(i).getYearOfPublishing()>year) {
				result.addBook(books.getBook(i));
			}
		}
		
		return result;
	}
	
}
