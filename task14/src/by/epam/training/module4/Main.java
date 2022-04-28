package by.epam.training.module4;

import java.math.BigDecimal;
import java.util.ArrayList;

/*
 * 4.Счета. Клиент может иметь несколько счетов в банке.
 *   Учитывать возможность блокировки/разблокировки счета.
 *   Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 *   Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Daria", "03/06/2000", new ArrayList<BankAccount>());
		View view = View.getInstance();
		Logic logic = Logic.getInstance();
		
		client1.addAccount(new BankAccount("BY34563881920348532","Alfa bank",new BigDecimal("4563.09")));
		client1.addAccount(new BankAccount("BY65789900384467565","Belarusbank",new BigDecimal("576.54")));
		client1.addAccount(new BankAccount("BY65787563844656790","Belarusbank",new BigDecimal("3876.91")));
		client1.addAccount(new BankAccount("BY91028364902847694","Belinvestbank",new BigDecimal("-93.54")));
		client1.addAccount(new BankAccount("BY65739201039843846","Paritetbank",new BigDecimal("9813.63")));
		
		logic.sortByBalance(client1);
		
		view.showAccounts(client1);
		view.showSumAll(logic.sumAllAccounts(client1));
		view.showSumPositive(logic.sumPositiveAccounts(client1));
		view.showSumPositive(logic.sumNegativeAccounts(client1));
		view.showInfoAboutClient(client1);
		
		System.out.println("Счета, открытые в определённом банке: ");
		view.showAccounts(logic.findAccountsByBank(client1, "Belarusbank"));
		System.out.println("Счета с отрицательным балансом: ");
		view.showAccounts(logic.findAccountsWithNegativeBalance(client1));
		System.out.println("Счета с положительным балансом: ");
		view.showAccounts(logic.findAccountsWithPositiveBalance(client1));
		
		

	}

}
