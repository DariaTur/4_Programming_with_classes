package by.epam.training.module4;

public class View {
	private static View instance;
	
	private View() {};
	
	public static View getInstance() {
		if(instance == null) {
			instance = new View();
		}
		return instance;
	}
	
	public void printAirlineList(AirlineList airlines) {
		for(int i = 0; i<airlines.getSize(); i++) {
			System.out.printf("Пункт назначения: %s\n"
			   		   + "Номер рейса: %s\n"
			   		   + "Тип самолета: %s\n"
			   		   + "Время отправления: %s\n"
			   		   + "День отправления: %s\n",
			   		   airlines.getAirline(i).getDestination(), airlines.getAirline(i).getFlightNumber(), 
			   		airlines.getAirline(i).getAirplaneType(), airlines.getAirline(i).getTime().getInfo(), airlines.getAirline(i).getDayOfTheWeek());
			 System.out.println("-----------------------------------------------");
		}
		
	}
}
