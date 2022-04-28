package by.epam.training.module4.bean;

public enum Food {
	ALL_INCLUSIVE("Всё включено"), NOT_INCLUDED("Еда не включена в стоимость"), 
	ONLY_BREAKFASTS("Включены только завтраки"), ONLY_DINNERS("Включены только ужины");
	
	private String type;
	
	Food(String type) {
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
