package by.epam.training.module4;

import java.math.BigDecimal;

public class BankAccount {
	private String number;
	private String bank;
	private boolean isOpen = true;
	private BigDecimal balance;
	
	public BankAccount() {}

	public BankAccount(String number, String bank, BigDecimal balance) {
		this.number = number;
		this.bank = bank;
		this.balance = balance;
	}
	
	public void block() {
		isOpen = false;
	}
	
	public void unlock(){
		isOpen = true;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((bank == null) ? 0 : bank.hashCode());
		result = prime * result + (isOpen ? 1231 : 1237);
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		BankAccount other = (BankAccount) obj;
		if (balance == null) {
			if (other.balance != null) {
				return false;
			}
		} else if (!balance.equals(other.balance)) {
			return false;
		}
		if (bank == null) {
			if (other.bank != null) {
				return false;
			}
		} else if (!bank.equals(other.bank)) {
			return false;
		}
		if (isOpen != other.isOpen) {
			return false;
		}
		if (number == null) {
			if (other.number != null) {
				return false;
			}
		} else if (!number.equals(other.number)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [number=" + number + ", bank=" + bank + ", isOpen=" + isOpen + ", balance=" + balance + "]";
	};
	
}
