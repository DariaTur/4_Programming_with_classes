package by.epam.training.module4;

import java.util.ArrayList;
import java.util.List;

public class AirlineList {
	private List<Airline> airlines;
	
	public AirlineList() {
		airlines = new ArrayList<Airline>();
	}
	
	public AirlineList(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	public void addAirline(Airline airline) {
		airlines.add(airline);
	}
	
	public Airline getAirline(int ind) {
		return airlines.get(ind);
	}
	
	public void setAirline(Airline airline, int ind) {
		airlines.set(ind, airline);
	}
	
	public int getSize() {
		return airlines.size();
	}

	@Override
	public String toString() {
		return "AirlineList [airlines=" + airlines + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
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
		AirlineList other = (AirlineList) obj;
		if (airlines == null) {
			if (other.airlines != null) {
				return false;
			}
		} else if (!airlines.equals(other.airlines)) {
			return false;
		}
		return true;
	}

	public List<Airline> getAirplanes() {
		return airlines;
	}

	public void setAirplanes(List<Airline> airlines) {
		this.airlines = airlines;
	}
	
	
}
