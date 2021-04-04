package mishra.aruni.springbootbasic.SpringBoot;

public class Book {
	
	long id;
	String name;
	String author;
	
	/**
	 * @param id
	 * @param name
	 * @param author
	 */
	public Book(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

}
