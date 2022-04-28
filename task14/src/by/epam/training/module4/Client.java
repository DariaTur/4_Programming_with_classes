package by.epam.training.module4;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String name;
	private String birthday;
	private List<BankAccount> accounts;
	
	public Client() {
		accounts = new ArrayList<BankAccount>();
	}

	public Client(String name, String birthday, List<BankAccount> accounts) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.accounts = accounts;
	}

	public BankAccount getAccount(int ind) {
		return accounts.get(ind);
	}
	
	public void addAccount(BankAccount account) {
		accounts.add(account);
	}
	
	public int getSize() {
		return accounts.size();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (accounts == null) {
			if (other.accounts != null) {
				return false;
			}
		} else if (!accounts.equals(other.accounts)) {
			return false;
		}
		if (birthday == null) {
			if (other.birthday != null) {
				return false;
			}
		} else if (!birthday.equals(other.birthday)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", birthday=" + birthday + ", accounts=" + accounts + "]";
	};
	
	
}
