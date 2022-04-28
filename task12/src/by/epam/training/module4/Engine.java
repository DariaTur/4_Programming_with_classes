package by.epam.training.module4;

public class Engine {
	private double power;
	private double torque;
	private double fuelConsumption;
	
	public Engine() {};
	
	public Engine(double power, double torque, double fuelConsumption) {
		if(fuelConsumption>0 && power>0 && torque>0) {
			this.power = power;
			this.torque = torque;
			this.fuelConsumption = fuelConsumption;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public double getPower() {
		return power;
	}
	
	public void setPower(double power) {
		if(power>0) {
			this.power = power;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public double getTorque() {
		return torque;
	}
	
	public void setTorque(double torque) {
		if(torque>0) {
			this.torque = torque;
		} else {
			throw new IllegalArgumentException();
		}
		
	}
	
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	
	public void setFuelConsumption(double fuelConsumption) {
		if(fuelConsumption>0) {
			this.fuelConsumption = fuelConsumption;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(fuelConsumption);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(power);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(torque);
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
		Engine other = (Engine) obj;
		if (Double.doubleToLongBits(fuelConsumption) != Double.doubleToLongBits(other.fuelConsumption)) {
			return false;
		}
		if (Double.doubleToLongBits(power) != Double.doubleToLongBits(other.power)) {
			return false;
		}
		if (Double.doubleToLongBits(torque) != Double.doubleToLongBits(other.torque)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", torque=" + torque + ", fuelConsumption=" + fuelConsumption + "]";
	}
	
}
