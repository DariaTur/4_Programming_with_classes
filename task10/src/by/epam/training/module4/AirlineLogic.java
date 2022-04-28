package by.epam.training.module4;

public class AirlineLogic {
	private static AirlineLogic instance;
	
	private AirlineLogic() {};
	
	public static AirlineLogic getInstance() {
		if(instance == null) {
			instance = new AirlineLogic();
		}
		return instance;
	}
	
	public AirlineList searchByDestination(AirlineList airlines, String destination) {
		AirlineList result = new AirlineList();
		
		for(int i = 0; i < airlines.getSize(); i++) {
			if(airlines.getAirline(i).getDestination().equals(destination)) {
				result.addAirline(airlines.getAirline(i));
			}
		}
		
		return result;
	}
	
	public AirlineList searchByDayOfWeek(AirlineList airlines, String daysOfWeek) {
		AirlineList result = new AirlineList();
		
		for(int i = 0; i < airlines.getSize(); i++) {
			if(airlines.getAirline(i).getDayOfTheWeek().equals(daysOfWeek)) {
				result.addAirline(airlines.getAirline(i));
			}
		}
		
		return result;
	}
	
	public AirlineList searchByDayOfWeekAndTime(AirlineList airlines, String dayOfWeek, Time time) {
		AirlineList result = new AirlineList();
		
		for(int i = 0; i < airlines.getSize(); i++) {
			if((airlines.getAirline(i).getTime().getHour()>time.getHour() &&airlines.getAirline(i).getDayOfTheWeek().equals(dayOfWeek))
					|| (airlines.getAirline(i).getTime().getHour()==time.getHour()
							&&airlines.getAirline(i).getTime().getMinute()>time.getMinute()
							&&airlines.getAirline(i).getDayOfTheWeek().equals(dayOfWeek))) {
					result.addAirline(airlines.getAirline(i));
			}
		}
		
		return result;
	}
}
