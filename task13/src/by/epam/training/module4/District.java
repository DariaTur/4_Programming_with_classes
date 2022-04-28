package by.epam.training.module4;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String name;
	private String center;
	private List<City> cities;
	
	public District() {
		cities = new ArrayList<>();
	}

	public District(String name, String center, ArrayList<City> cities) {
		this.name = name;
		this.center = center;
		this.cities = cities;
		
	}
	
	public void addCity(City city) {
		cities.add(city);
	}
	
	public City getCity(int ind) {
		return cities.get(ind);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", center=" + center + ", cities="+cities+"]";
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		result = 31*result + (name == null ? 0 : name.hashCode());
		result = 31*result + (center == null ? 0 : center.hashCode());
		result = 31*result + (cities == null ? 0 : cities.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		District dist = (District) obj;
		return name.equals(dist.name) && center.equals(dist.center) && cities.equals(dist.cities);
	}
	
}
