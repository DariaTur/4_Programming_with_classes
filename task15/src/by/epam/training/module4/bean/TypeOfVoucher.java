package by.epam.training.module4.bean;

public enum TypeOfVoucher {
	REST("Отдых"), EXCURSION("Экскурсия"), TREATMENT("Лечение"), SHOPPING("Шопинг"), CRUISE("Круиз") ;
	
	private String type;
	
	TypeOfVoucher(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return type;
	}

}
