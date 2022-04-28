package by.epam.training.module4.bean;

public class Client {
	private String fisrtName;
	private String secondName;
	private String birthday;
	private String passportNumber;
	private Voucher voucher;
	
	public Client() {};
	
	public Client(String fisrtName, String secondName, String birthday, String passportNumber, Voucher voucher) {
		this.fisrtName = fisrtName;
		this.secondName = secondName;
		this.birthday = birthday;
		this.passportNumber = passportNumber;
		this.voucher = voucher;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((fisrtName == null) ? 0 : fisrtName.hashCode());
		result = prime * result + ((passportNumber == null) ? 0 : passportNumber.hashCode());
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
		result = prime * result + ((voucher == null) ? 0 : voucher.hashCode());
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
		Client other = (Client) obj;
		if (birthday == null) {
			if (other.birthday != null) {
				return false;
			}
		} else if (!birthday.equals(other.birthday)) {
			return false;
		}
		if (fisrtName == null) {
			if (other.fisrtName != null) {
				return false;
			}
		} else if (!fisrtName.equals(other.fisrtName)) {
			return false;
		}
		if (passportNumber == null) {
			if (other.passportNumber != null) {
				return false;
			}
		} else if (!passportNumber.equals(other.passportNumber)) {
			return false;
		}
		if (secondName == null) {
			if (other.secondName != null) {
				return false;
			}
		} else if (!secondName.equals(other.secondName)) {
			return false;
		}
		if (voucher == null) {
			if (other.voucher != null) {
				return false;
			}
		} else if (!voucher.equals(other.voucher)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Client [fisrtName=" + fisrtName + ", secondName=" + secondName + ", birthday=" + birthday
				+ ", passportNumber=" + passportNumber + ", voucher=" + voucher + "]";
	}
	
	
}
