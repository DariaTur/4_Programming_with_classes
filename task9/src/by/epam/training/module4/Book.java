package by.epam.training.module4;

public class Book {
	private static int counter;
	private final int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int yearOfPublishing;
	private int numberOfPages;
	private double price;
	private String bindingType;
	
	public Book() {
		counter++;
		id = counter;
	}
	
	public Book(String title, String author, String publishingHouse, int yearOfPublishing, int numberOfPages, double price, String bindingType) {
		if(yearOfPublishing < 1900 || numberOfPages < 0 || price < 0) {
			throw new IllegalArgumentException("Invalid arguments");
		} else{
			this.title = title;
			this.author = author;
			this.publishingHouse = publishingHouse;
			this.yearOfPublishing = yearOfPublishing;
			this.numberOfPages = numberOfPages;
			this.price = price;
			this.bindingType = bindingType;
			counter++;
			id = counter;
		}
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		long longBits = Double.doubleToLongBits(price);
		
		result = 31*result + id;
		result = 31*result + (title == null ? 0 : title.hashCode());
		result = 31*result + (author == null ? 0 : author.hashCode());
		result = 31*result + (publishingHouse == null ? 0 : publishingHouse.hashCode());
		result = 31*result + (bindingType == null ? 0 : bindingType.hashCode());
		result = 31*result + yearOfPublishing;
		result = 31*result + numberOfPages;
		result = 31*result + (int)(longBits - (longBits>>>32));
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		Book b = (Book) obj;
		return this.title.equals(b.title)&&this.bindingType.equals(b.bindingType)&&this.author.equals(b.author)
				&&this.publishingHouse.equals(b.publishingHouse)&&this.numberOfPages==b.numberOfPages 
				&&this.yearOfPublishing == b.yearOfPublishing && Double.compare(this.price, b.price) == 0;
	}
	
	@Override
	public String toString() {
		return "Book [id = " + id + ", title = " + title + ", author = " + author + ", publishingHouse = " + publishingHouse
				+ ", yearOfPublishing = " + yearOfPublishing + ", numberOfPages = " + numberOfPages + ", price = " + price
				+ ", bindingType = " + bindingType + "]";
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		if(yearOfPublishing<1900) {
			throw new IllegalArgumentException("Invalid arguments");
		} else {
			this.yearOfPublishing = yearOfPublishing;
		}	
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		if(numberOfPages < 0) {
			throw new IllegalArgumentException("Invalid arguments");
		} else {
			this.numberOfPages = numberOfPages;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Invalid arguments");
		} else {
			this.price = price;
		}
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	
	
}
