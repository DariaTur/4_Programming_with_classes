package by.epam.training.module4.logic;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import by.epam.training.module4.bean.Voucher;

public class Logic {
	private static Logic instance;
	
	private Logic() {};
	
	public static Logic getInstance() {
		if(instance==null) {
			instance = new Logic();
		}
		return instance;
	}
	
	public List<Voucher> sortByCost(List<Voucher> vouchers){
		List<Voucher> res = vouchers;
		boolean check = true;
		
		while(check) {
			check = false;
			for(int i = 0; i<res.size()-1;i++) {
				if(res.get(i).getCost()>res.get(i+1).getCost()) {
					Voucher temp = res.get(i);
					res.set(i, res.get(i+1));
					res.set(i+1, temp);
					check = true;
				}
			}
		}
		
		return res;
	}
	
	public List<Voucher> sortByNumberOfDays(List<Voucher> vouchers){
		List<Voucher> res = vouchers;
		
		Comparator<Voucher> voucherComparator = Comparator.comparing(Voucher::getNumberOfDays); 
		Collections.sort(res, voucherComparator);
		
		return res;
	}
	
}
