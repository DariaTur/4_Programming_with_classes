package by.epam.training.module4;

public class Airline {
	private String destination;
	private int flightNumber;
	private String airplaneType;
	private Time time;
	private String dayOfTheWeek;
	
	public Airline() {};
	
	public Airline(String destination,  int flightNumber, String airplaneType, Time time, String dayOfTheWeek) {
		if(flightNumber<0) {
			throw new IllegalArgumentException();
		} else {
			this.destination = destination;
			this.flightNumber = flightNumber;
			this.airplaneType = airplaneType;
			this.time = time;
			this.dayOfTheWeek = dayOfTheWeek;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((dayOfTheWeek == null) ? 0 : dayOfTheWeek.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Airline other = (Airline) obj;
		return airplaneType.equals(other.airplaneType)&&dayOfTheWeek.equals(other.dayOfTheWeek)
				&&destination.equals(other.destination)&&flightNumber == other.flightNumber&&time.equals(other.time);
	}
	
	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", airplaneType="
				+ airplaneType + ", time=" + time + ", dayOfTheWeek=" + dayOfTheWeek + "]";
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDaysOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}
}
