package by.epam.training.module4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Logic {
	private static Logic instance;
	
	private Logic() {};
	
	public static Logic getInstance() {
		if(instance == null) {
			instance = new Logic();
		}
		return instance;
	}
	
	public List<BankAccount> sortByBalance(Client client){
		List<BankAccount> result = client.getAccounts();
		boolean check = true;
		while(check) {
			check = false;
			for(int i = 0; i<result.size()-1; i++) {
				if(result.get(i).getBalance().compareTo(result.get(i+1).getBalance())==1) {
					BankAccount temp = result.get(i);
					result.set(i, result.get(i+1));
					result.set(i+1, temp);
					check = true;
				}
			}
		}
		
		return result;
	}
	
	public BigDecimal sumAllAccounts(Client client) {
		BigDecimal sum = new BigDecimal(0);
		for(int i = 0; i<client.getAccounts().size(); i++) {
			sum = sum.add(client.getAccounts().get(i).getBalance());		
		}
		return sum;
	}
	
	public BigDecimal sumPositiveAccounts(Client client) {
		BigDecimal sum = new BigDecimal(0);
		for(int i = 0; i<client.getAccounts().size(); i++) {
			if(client.getAccounts().get(i).getBalance().compareTo(new BigDecimal(0))==1) {
				sum = sum.add(client.getAccounts().get(i).getBalance());		
			}
		}
		return sum;
	}
	
	public BigDecimal sumNegativeAccounts(Client client) {
		BigDecimal sum = new BigDecimal(0);
		for(int i = 0; i<client.getAccounts().size(); i++) {
			if(client.getAccounts().get(i).getBalance().compareTo(new BigDecimal(0))==-1) {
				sum = sum.add(client.getAccounts().get(i).getBalance());		
			}
		}
		return sum;
	}
	
	public List<BankAccount> findAccountsByBank(Client client, String bank) {
		List<BankAccount> res = new ArrayList<>();
		for(BankAccount ba : client.getAccounts()) {
			if(ba.getBank().equals(bank)) {
				res.add(ba);
			}
		}
		return res;
	}
	
	public List<BankAccount> findAccountsWithNegativeBalance(Client client) {
		List<BankAccount> res = new ArrayList<>();
		for(BankAccount ba : client.getAccounts()) {
			if(ba.getBalance().compareTo(new BigDecimal(0))==-1) {
				res.add(ba);
			}
		}
		return res;
	}
	
	public List<BankAccount> findAccountsWithPositiveBalance(Client client) {
		List<BankAccount> res = new ArrayList<>();
		for(BankAccount ba : client.getAccounts()) {
			if(ba.getBalance().compareTo(new BigDecimal(0))==1) {
				res.add(ba);
			}
		}
		return res;
	}
}
