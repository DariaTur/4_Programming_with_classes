package by.epam.training.module4;
/*
 * 9.Создать класс Book, спецификация которого приведена ниже.
 *   Определить конструкторы, set-и get- методы и метод  toString().
 *   Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 *   Задать критерии выбора данных и вывести эти данные на консоль.
 *   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *   Найти и вывести:
 *   a) список книг заданного автора;
 *   b) список книг, выпущенных заданным издательством;
 *   c) список книг, выпущенных после заданного года.
 */
public class Main {

	public static void main(String[] args) {
		BookList books = new BookList();
		BookLogic logic = BookLogic.getInstance();
		View view = View.getInstance();
		
		books.addBook(new Book("Harry potter and the Philosopher's stone","J. K. Rowling","Bloomsbury",1997, 223,15.25,"Case"));
		books.addBook(new Book("Harry Potter and the Chamber of Secrets","J. K. Rowling","Bloomsbury",1998, 251,13.75,"Perfect binding"));
		books.addBook(new Book("Harry Potter and the Prisoner of Azkaban","J. K. Rowling","Bloomsbury",1999, 317,17.5,"Perfect binding"));
		books.addBook(new Book("Harry Potter and the Goblet of Fire","J. K. Rowling","Bloomsbury",2000, 636,20.35,"Case"));
		books.addBook(new Book("Harry Potter and the Order of the Phoenix","J. K. Rowling","Bloomsbury",2003, 766,21.55,"Case"));
		books.addBook(new Book("Harry Potter and the Half-Blood Prince","J. K. Rowling","Bloomsbury",2005, 607,19.55,"Case"));
		books.addBook(new Book("Harry Potter and the Deathly Hallows","J. K. Rowling","Bloomsbury",2007, 607,22.45,"Perfect binding"));
		books.addBook(new Book("Carrie","Stephen King","Doubleday",1974, 199,10.45,"Case"));
		books.addBook(new Book("Little Women","Louisa May Alcott","Doubleday",1983, 560,5.65,"Case"));
		
		BookList result1 = logic.getBooksOfAuthor(books, "J. K. Rowling");
		BookList result2 = logic.getBooksOfPublishingHouse(books, "Doubleday");
		BookList result3 = logic.getBooksByYear(books, 2000);
		
		System.out.println("Cписок книг заданного автора:");
		view.printBookList(result1);
		System.out.println();
		System.out.println("Cписок книг, выпущенных заданным издательством:");
		view.printBookList(result2);
		System.out.println();
		System.out.println("Cписок книг, выпущенных после заданного года:");
		view.printBookList(result3);

	}

}
