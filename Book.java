// class for Library object
package LibraryProject;

public class Book
{
	private String fiction;
	private int isbn;
	private String author;
	private String title;
	private int quantity;
	
	public Book()
	{
		
	}			
	public Book isInStock(Integer quantity)
	{
		
	}
	
		
	
	public String getFiction() {
		return fiction;
	}
	public void setFiction(String fiction) {
		this.fiction = fiction;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString()
	{
		return ("title:"+title+ "Author:"+author+ "quantity"+quantity);
	}
	
}
