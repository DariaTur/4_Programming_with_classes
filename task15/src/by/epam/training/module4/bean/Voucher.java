package by.epam.training.module4.bean;

public class Voucher {
	private String country;
	private String date;
	private int numberOfDays;
	private int cost;
	Transport transport;
	Food food;
	TypeOfVoucher typeOfVoucher;
	
	public Voucher() {}

	public Voucher(String country, String date, int numberOfDays, int cost, Transport transport, Food food, TypeOfVoucher typeOfVoucher) {
		this.country = country;
		this.date = date;
		this.numberOfDays = numberOfDays;
		this.cost = cost;
		this.transport = transport;
		this.food = food;
		this.typeOfVoucher = typeOfVoucher;
	}

	public TypeOfVoucher getTypeOfVoucher() {
		return typeOfVoucher;
	}

	public void setTypeOfVoucher(TypeOfVoucher typeOfVoucher) {
		this.typeOfVoucher = typeOfVoucher;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + numberOfDays;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((typeOfVoucher == null) ? 0 : typeOfVoucher.hashCode());
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
		Voucher other = (Voucher) obj;
		if (cost != other.cost) {
			return false;
		}
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (food != other.food) {
			return false;
		}
		if (numberOfDays != other.numberOfDays) {
			return false;
		}
		if (transport != other.transport) {
			return false;
		}
		if (typeOfVoucher != other.typeOfVoucher) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Voucher [country=" + country + ", date=" + date + ", numberOfDays=" + numberOfDays + ", cost=" + cost
				+ ", transport=" + transport + ", food=" + food + ", typeOfVoucher=" + typeOfVoucher + "]";
	}
	
}
