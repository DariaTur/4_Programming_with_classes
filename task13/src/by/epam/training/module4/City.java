package by.epam.training.module4;

public class City {
	private String name;
	private int population;
	
	public City() {};
	
	public City(String name, int population) {
		if(population<0) {
			throw new IllegalArgumentException();
		} else {
			this.name = name;
			this.population = population;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		if(population<0) {
			throw new IllegalArgumentException();
		} else {
			this.population = population;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + population;
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
		City other = (City) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (population != other.population) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + "]";
	}

}
