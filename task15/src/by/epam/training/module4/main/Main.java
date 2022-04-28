package by.epam.training.module4.main;

import by.epam.training.module4.bean.Client;
import by.epam.training.module4.bean.Food;
import by.epam.training.module4.bean.Transport;
import by.epam.training.module4.bean.TravelAgency;
import by.epam.training.module4.bean.TypeOfVoucher;
import by.epam.training.module4.bean.Voucher;
import by.epam.training.module4.logic.Logic;
import by.epam.training.module4.view.View;

/*
 * 5.Туристические путевки. Сформировать набор предложений клиенту по выбору туристической
 *   путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 *   Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {

	public static void main(String[] args) {
		TravelAgency travelAgency = new TravelAgency("Golden globe");
		Voucher voucher1 = new Voucher("Польша", "26 мая, 14:30", 7, 145, Transport.BUS, Food.ONLY_BREAKFASTS, TypeOfVoucher.EXCURSION);
		Voucher voucher2 = new Voucher("Швеция", "9 июля, 1:20", 15, 450, Transport.SHIP, Food.NOT_INCLUDED, TypeOfVoucher.CRUISE);
		Voucher voucher3 = new Voucher("Швеция", "9 июля, 1:20", 15, 510, Transport.SHIP, Food.ALL_INCLUSIVE, TypeOfVoucher.CRUISE);
		Voucher voucher4 = new Voucher("США", "12 июня, 9:15", 21, 2350, Transport.PLANE, Food.NOT_INCLUDED, TypeOfVoucher.REST);
		
		travelAgency.addVoucher(voucher4);
		travelAgency.addVoucher(voucher2);
		travelAgency.addVoucher(voucher3);
		travelAgency.addVoucher(voucher1);
		
		Client client1 = new Client("Василий", "Пупкин", "04.10.1989","AB54637292", voucher2);
		
		travelAgency.addClient(client1);
		
		Logic logic = Logic.getInstance();
		View view = View.getInstance();
		
		view.printVouchers(travelAgency.getVouchers());
		view.printVouchers(logic.sortByCost(travelAgency.getVouchers()));
		view.printVouchers(logic.sortByNumberOfDays(travelAgency.getVouchers()));
		

	}

}
