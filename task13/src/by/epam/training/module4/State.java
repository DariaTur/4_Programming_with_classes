package by.epam.training.module4;

import java.util.List;

public class State {
	private List<Region> regions;
	private String capital;
	private double square;
	
	public State() {};

	public State(List<Region> regions, String capital, double square) {
		this.regions = regions;
		this.capital = capital;
		this.square = square;
	}
	
	public void addRegion(Region reg) {
		regions.add(reg);
	}
	
	public Region getDistrict(int ind) {
		return regions.get(ind);
	}

	public int getAmountOfRegions() {
		return regions.size();
	}
	
	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null) {
				return false;
			}
		} else if (!capital.equals(other.capital)) {
			return false;
		}
		if (regions == null) {
			if (other.regions != null) {
				return false;
			}
		} else if (!regions.equals(other.regions)) {
			return false;
		}
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "State [regions=" + regions + ", capital=" + capital + ", square=" + square + "]";
	}

}
