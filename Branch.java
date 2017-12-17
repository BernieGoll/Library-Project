// class for Library object
package LibraryProject;

import java.util.ArrayList;

public class Branch
{
	private String facilityType;
	private String branchName;
	private String address;
	private String hoursOp;
	private int phone;

	private ArrayList<Book> books = new ArrayList();
	private ArrayList<Customer> customers = new ArrayList();
	
	public Branch()
	{	

	}	
	public void addBook(Book book)
	{
		books.add(book);
	}
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	
	public Book searchBook(String title)
	{
		for(int i =0; i < books.size();i++)
		{
			if(title==books.get(i).getTitle())
			{
				return books.get(i);
			}
		}
		return null;
	}	

	
	
	
	public String getFacilityType() {
		return facilityType;
	}

	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHoursOp() {
		return hoursOp;
	}

	public void setHoursOp(String hoursOp) {
		this.hoursOp = hoursOp;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String toString()
	{
		return ("Branch"+branchName);
	}
	
}
