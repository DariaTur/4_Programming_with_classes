package by.epam.training.module4.view;

import java.util.List;

import by.epam.training.module4.bean.Voucher;

public class View {
	private static View instance;
	
	private View() {};
	
	public static View getInstance() {
		if(instance==null) {
			instance = new View();
		}
		return instance;
	}
	
	public void printVouchers(List<Voucher> vouchers) {
		for(int i = 0; i<vouchers.size(); i++) {
			System.out.println("Страна: "+ vouchers.get(i).getCountry()
								+", дата: "+vouchers.get(i).getDate()
								+", количество дней: "+vouchers.get(i).getNumberOfDays()
								+", цена: "+vouchers.get(i).getCost()
								+", тип путевки: "+vouchers.get(i).getTypeOfVoucher());
		}
		System.out.println();
	}
}
