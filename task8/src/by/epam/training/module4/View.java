package by.epam.training.module4;

public class View {
	private static View instance;
	
	private View() {};
	
	public static View getInstance() {
		if(instance == null) {
			instance = new View();
		}
		return instance;
	}
	
	public void printCustomers(CustomerList cust) {
		for(int i = 0; i<cust.getLength(); i++) {
			System.out.println(cust.getCustomer(i));
		}
	}
	
	public void printByName(CustomerList cust) {
		for(int i = 0; i<cust.getLength(); i++) {
			System.out.println("First name: "+cust.getCustomer(i).getFirstName()
					+", second name: "+cust.getCustomer(i).getSecondName()
					+", patronymic: "+cust.getCustomer(i).getPatronymic());
		}
	}
	
	public void printCustomerName(CustomerList cust) {
		for(int i = 0; i<cust.getLength(); i++) {
			System.out.println(cust.getCustomer(i).getFirstName()
					+" "+cust.getCustomer(i).getSecondName()
					+" "+cust.getCustomer(i).getPatronymic());
		}
	}
}
