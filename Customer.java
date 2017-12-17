// class for Library Object

package LibraryProject;

import java.util.Date;

public class Customer
{
	private String type;
	private String idNumber;
	private String firstName;
	private String lastName;
	private Date dateChecked;
	private String pastDue;
			
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
