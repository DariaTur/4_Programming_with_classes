package by.epam.training.module4.bean;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
	private String name;
	private List<Voucher> vouchers;
	private List<Client> clients;
	
	public TravelAgency() {
		vouchers = new ArrayList<Voucher>();
		clients = new ArrayList<Client>();
	}

	public TravelAgency(String name) {
		this.name = name;
		vouchers = new ArrayList<Voucher>();
		clients = new ArrayList<Client>();
	}
	
	public TravelAgency(String name, List<Voucher> vouchers, List<Client> clients) {
		this.name = name;
		this.vouchers = vouchers;
		this.clients = clients;
	}
	
	public void addClient(Client client) {
		clients.add(client);
	}
	
	public Client getClient(int ind) {
		return clients.get(ind);
	}
	
	public void addVoucher(Voucher voucher) {
		vouchers.add(voucher);
	}
	
	public Voucher getVoucher(int ind) {
		return vouchers.get(ind);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "TravelAgency [name=" + name + ", vouchers=" + vouchers + ", clients=" + clients + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
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
		TravelAgency other = (TravelAgency) obj;
		if (clients == null) {
			if (other.clients != null) {
				return false;
			}
		} else if (!clients.equals(other.clients)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (vouchers == null) {
			if (other.vouchers != null) {
				return false;
			}
		} else if (!vouchers.equals(other.vouchers)) {
			return false;
		}
		return true;
	}

}
