package by.epam.training.module4;

public class Wheel {
	private int diameter;
	private int width;
	private String producingCountry;
	
	public Wheel() {}

	public Wheel(int diameter, int width, String producingCountry) {
		if(diameter >0 && width >0) {
			this.diameter = diameter;
			this.width = width;
			this.producingCountry = producingCountry;
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		if(diameter>0) {
			this.diameter = diameter;
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width>0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	public String getProducingCountry() {
		return producingCountry;
	}

	public void setProducingCountry(String producingCountry) {
		this.producingCountry = producingCountry;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", width=" + width + ", producingCountry=" + producingCountry + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + diameter;
		result = prime * result + ((producingCountry == null) ? 0 : producingCountry.hashCode());
		result = prime * result + width;
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
		Wheel other = (Wheel) obj;
		if (diameter != other.diameter) {
			return false;
		}
		if (producingCountry == null) {
			if (other.producingCountry != null) {
				return false;
			}
		} else if (!producingCountry.equals(other.producingCountry)) {
			return false;
		}
		if (width != other.width) {
			return false;
		}
		return true;
	}
	
}
