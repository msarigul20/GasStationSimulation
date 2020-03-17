package Project;
public class Cars extends Customer {
	private String Plate;
	private String TypeOfFuel;

	public Cars(String personName, String personSurname, String personCitizenNumber, int customerID,
			String telephoneNumber, String email, String plate, String typeOfFuel) {
		super(personName, personSurname, personCitizenNumber, customerID, telephoneNumber, email);
		Plate = plate;
		TypeOfFuel = typeOfFuel;
	}

	public String getPlate() {
		return Plate;
	}

	public void setPlate(String plate) {
		Plate = plate;
	}

	public String getTypeOfFuel() {
		return TypeOfFuel;
	}

	public void setTypeOfFuel(String typeOfFuel) {
		TypeOfFuel = typeOfFuel;
	}

	@Override
	public void DisplayCustomerInfo() {
		System.out.println("-------------------------------------------------");
		System.out.println("Customer ID: " + getCustomerID());
		System.out.println("Person Name :" + PersonName);
		System.out.println("Person Surname :" + PersonSurname);
		System.out.println("Person Citizen Number :" + PersonCitizenNumber);
		System.out.println("Customer Telephon Number: " + getTelephoneNumber());
		System.out.println("Customer Email : " + getEmail());
		System.out.println("Car Plate: " + getPlate());
		System.out.println("Car Type Of Plate :" + getTypeOfFuel());
		System.out.println("-------------------------------------------------");
	}
}