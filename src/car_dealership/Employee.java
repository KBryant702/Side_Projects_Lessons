package car_dealership;

public class Employee {
	

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle){
		if(finance == true){
			//find out loan amount needed
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount, vehicle);
		} else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			//customer pays in cash
			processTransaction(cust, vehicle);
		}else {
			System.out.println(" Customer will need more money to purchase vehicle");
		}
		}
	public void runCreditHistory(Customer cust, double loanAmount, Vehicle vehicle) {
		System.out.println("Ran credit history for customer "+ cust.getName());
		System.out.println("Customer " + cust.getName()+  " been approved to purchase the " + vehicle);
	}
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the "+ vehicle + " for the price "+ vehicle.getPrice());
	}
}

