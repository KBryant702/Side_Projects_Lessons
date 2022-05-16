package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St. ");
		cust1.setCashOnHand(12000);
		
		Customer cust2 = new Customer();
		cust2.setName("Anna");
		cust2.setAddress("145 King Way");
		cust2.setCashOnHand(10000);
	
		//Instantiate the vehicle and employee objects
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setMake("Honda");
		vehicle1.setModel("Accord");
		vehicle1.setPrice(12000);
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.setMake("Subaru");
		vehicle2.setModel("Impreeza");
		vehicle2.setPrice(24000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle1, emp, false);
		cust1.purchaseCar(vehicle2, emp, true);
		
	
	
	}

}
