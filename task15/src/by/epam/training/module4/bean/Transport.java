package by.epam.training.module4.bean;

public enum Transport {
	BUS("Автобус"), TRAIN("Поезд"), PLANE("Самолёт"), SHIP("Корабль");
	
	private String type;
	
	Transport(String type) {
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
