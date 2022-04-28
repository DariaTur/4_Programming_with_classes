package by.epam.training.module4;


public class CustomerLogic {
	private static CustomerLogic instance;
	
	private CustomerLogic() {};
	
	public static CustomerLogic getInstance() {
		if(instance == null) {
			instance = new CustomerLogic();
		}
		return instance;
	}
	
	public CustomerList sortByName(CustomerList customers){
		boolean check = true;
		while(check){
			check = false;
			for(int i = 0; i < customers.getLength()-1; i++) {
				if(customers.getCustomer(i).getFirstName().compareTo(customers.getCustomer(i+1).getFirstName())>0) {
					check = true;
					Customer temp = customers.getCustomer(i);
					customers.setCustomer(i, customers.getCustomer(i+1));
					customers.setCustomer(i+1, temp);
				}
			}
		}
		return customers;
	}
	
	public CustomerList findCustomerByCard(CustomerList customers, String start, String end){
		CustomerList result = new CustomerList();
		for(int i = 0; i<customers.getLength();i++) {
			long a = Long.parseLong(start.replaceAll(" ",""));
			long b = Long.parseLong(end.replaceAll(" ",""));
			long card = Long.parseLong(customers.getCustomer(i).getNumberOfCreditCard().replaceAll(" ",""));
			if(card>a && card<b) {
				result.addCustomer(customers.getCustomer(i));
			}
		}
		return result;
	}
}
