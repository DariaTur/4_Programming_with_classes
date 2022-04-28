package by.epam.training.module4;

import java.util.Arrays;

public class Car {
	private int year;
	private Wheel[] wheels;
	private Engine engine;
	private String brand;
	private double fuel;
	private double fuelCapacity;
	
	public Car() {
		wheels = new Wheel[4];
	}

	public Car(int year, Wheel[] wheels, Engine engine, String brand, double fuel) {
		if(year < 1885 || wheels.length != 4 || fuel<0) {
			throw new IllegalArgumentException();
		} else {
			this.year = year;
			this.wheels = wheels;
			this.engine = engine;
			this.brand = brand;
			this.fuel = fuel;
			fuelCapacity = fuel;
		}
	}
	
	public void ride(double distance) {
		double res = engine.getFuelConsumption()*distance/100;
		fuel -= res;
		System.out.println("Машина едет " + distance + " км, израсходовано топлива " +res+" л.");
	}
	
	public void refuel(double fuel) {
		if((this.fuel + fuel)<=fuelCapacity) {
			this.fuel = this.fuel+fuel;
		} else {
			System.out.println("Невозможно заправить бак, так как превысится его объем");
		}	
	}
	
	public void changeWheel(int number, Wheel wheel) {
		if(number < 1 || number > 4) {
			throw new IllegalArgumentException("Номер колеса не может быть меньше 1 и больше 4.");
		} else {
			wheels[number-1] = wheel;
		}
	}
	
	public void showInfo() {
		System.out.println("Машина марки: "+brand+", год: "+year+", емкость бака с топливом: "+fuel);
	}
	
	public void showBrand() {
		System.out.println("Машина марки "+brand+".");
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year < 1885) {
			throw new IllegalArgumentException();
		} else {
			this.year = year;
		}
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		if(wheels.length!=4) {
			throw new IllegalArgumentException();
		} else {
			this.wheels = wheels;
		}
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		if(fuel < 0) {
			throw new IllegalArgumentException();
		} else {
			this.fuel = fuel;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		long temp;
		temp = Double.doubleToLongBits(fuel);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(wheels);
		result = prime * result + year;
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
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (engine == null) {
			if (other.engine != null) {
				return false;
			}
		} else if (!engine.equals(other.engine)) {
			return false;
		}
		if (Double.doubleToLongBits(fuel) != Double.doubleToLongBits(other.fuel)) {
			return false;
		}
		if (!Arrays.equals(wheels, other.wheels)) {
			return false;
		}
		if (year != other.year) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", wheels=" + Arrays.toString(wheels) + ", engine=" + engine + ", brand=" + brand
				+ ", fuel=" + fuel + "]";
	}
	
	
}
