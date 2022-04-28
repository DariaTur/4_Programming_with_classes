package by.epam.training.module4;

import java.math.BigDecimal;
import java.util.List;

public class View {
	private static View instance;
	
	private View() {};
	
	public static View getInstance() {
		if(instance == null) {
			instance = new View();
		}
		return instance;
	}
	
	public void showAccounts(Client client) {
		for(BankAccount ba : client.getAccounts()) {
			System.out.println("Номер счёта: "+ba.getNumber()+", банк: "+ba.getBank()+", открыт или закрыт: "
						+(ba.isOpen() ? "открыт" : "закрыт")+", баланс: "+ba.getBalance());
		}
	}
	
	public void showAccounts(List<BankAccount> accounts) {
		for(BankAccount ba : accounts) {
			System.out.println("Номер счёта: "+ba.getNumber()+", банк: "+ba.getBank()+", открыт или закрыт: "
						+(ba.isOpen() ? "открыт" : "закрыт")+", баланс: "+ba.getBalance());
		}
	}
	
	public void showSumAll(BigDecimal sum) {
		System.out.println("Сумма всех счетов: "+sum);
	}
	
	public void showSumNegative(BigDecimal sum) {
		System.out.println("Сумма счетов с отрицательным балансом: "+sum);
	}
	
	public void showSumPositive(BigDecimal sum) {
		System.out.println("Сумма счетов с отрицательным балансом: "+sum);
	}
	
	public void showInfoAboutClient(Client client) {
		System.out.println("Имя клиента: "+client.getName()+", дата рождения: "+client.getBirthday());
	}
}
