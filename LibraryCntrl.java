// this is functional application containing Objects for classes
package LibraryProject;

import java.util.ArrayList;

public class LibraryCntrl
{
	public static void main(String[]args)
	{	
		Book book1 = new Book();
		Book book2 = new Book();
		Branch branchA = new Branch();
		Branch branchB = new Branch();
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		book1.setTitle("Moby Dick");
		book1.setAuthor("Herman Melville ");
		book1.setQuantity(2);
		branchA.addBook(book1);
		branchA.
		
		book2.setTitle("Harry Potter");
		book2.setAuthor("J K Rowling");
		branchB.setQuantity(3);
		branchB.addBook(book2);
		
		Book b = branchB.searchBook("Harry Potter");
		if(b!=null)
			System.out.println(b.getAuthor());
		else
			System.out.println("Book not found");
		
		 ArrayList<Branch> branch = new ArrayList();
		

	{
		
	}
	
	
	}
	
	
	
}
