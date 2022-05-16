package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom", "123 Anything St.", 12000);
		
		Customer cust2 = new Customer("Anna", "145 King Way", 10000);
	
		//Instantiate the vehicle and employee objects
		Vehicle vehicle1 = new Vehicle("Honda", "Accord", 12000);
		Vehicle vehicle2 = new Vehicle("Subaru", "Impreeza", 24000);
		Vehicle vehicle3 = new Vehicle ("BMW", "M3", 30000);
		Vehicle vehicle4 = new Vehicle ("BMW", "M3", 30000);

		
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle1, emp, false);
		cust2.purchaseCar(vehicle2, emp, true);
		
		boolean value  = vehicle3.equals(vehicle4);
		System.out.println(value);
	
	
	}

}
