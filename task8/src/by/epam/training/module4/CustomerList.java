package by.epam.training.module4;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
	private List<Customer> customers;
	
	public CustomerList() {
		customers = new ArrayList<Customer>();
	};
	
	public CustomerList(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	public void addCustomer(Customer cust) {
		customers.add(cust);
	}
	
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	public List<Customer> getCustomers(){
		return customers;
	}
	
	public int getLength() {
		return customers.size();
	}
	
	public Customer getCustomer(int i) {
		return customers.get(i);
	}
	
	public void setCustomer(int ind, Customer cust) {
		customers.set(ind, cust);
	}
}
