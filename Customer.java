package Project;
public abstract class Customer {
	protected String PersonName;
	protected String PersonSurname;
	protected String PersonCitizenNumber;
	private int CustomerID;
	private String TelephoneNumber;
	private String Email;

	public Customer(String personName, String personSurname, String personCitizenNumber, int customerID,
			String telephoneNumber, String email) {
		super();
		PersonName = personName;
		PersonSurname = personSurname;
		PersonCitizenNumber = personCitizenNumber;
		CustomerID = customerID;
		TelephoneNumber = telephoneNumber;
		Email = email;
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		PersonName = personName;
	}

	public String getPersonSurname() {
		return PersonSurname;
	}

	public void setPersonSurname(String personSurname) {
		PersonSurname = personSurname;
	}

	public String getPersonCitizenNumber() {
		return PersonCitizenNumber;
	}

	public void setPersonCitizenNumber(String personCitizenNumber) {
		PersonCitizenNumber = personCitizenNumber;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getTelephoneNumber() {
		return TelephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		TelephoneNumber = telephoneNumber;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void DisplayCustomerInfo() {

		System.out.println("Customer Telephone Number: " + getTelephoneNumber());
		System.out.println("Customer Email : " + getEmail());
	}
}