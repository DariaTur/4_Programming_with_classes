package by.epam.training.module4;

public class View {
	private static View instance;
	
	private View() {};
	
	public static View getInstance() {
		if(instance == null) {
			instance = new View();
		}
		return instance;
	}
	
	public void printBookList(BookList books) {
		for(int i = 0; i<books.getSize(); i++) {
			System.out.println("Book title: "+books.getBook(i).getTitle()+", author: "+books.getBook(i).getAuthor()
					+", publication year: "+books.getBook(i).getYearOfPublishing()+", pages: "+books.getBook(i).getNumberOfPages()
					+", publisher: "+books.getBook(i).getPublishingHouse()+", price: "+books.getBook(i).getPrice());
		}
	}
}
