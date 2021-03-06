package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	
	
	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}


	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}


	public double getCashOnHand() {
		return cashOnHand;
	}


	public void setCashOnHand(double cashOnHand) {
		cashOnHand += 500; // add a trade in bonus for all sales
		this.cashOnHand = cashOnHand;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		address+= " Dealership City";
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}	
}
