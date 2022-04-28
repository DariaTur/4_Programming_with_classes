package by.epam.training.module4;

/*
 * 8.Создать класс Customer, спецификация которого приведена ниже.
 *   Определить конструкторы, set- и get- методы и метод toString().
 *   Создать второй класс, агрегирующий массив типа Customer,
 *   с подходящими конструкторами и методами. Задать критерии
 *   выбора данных и вывести эти данные на консоль. 
 *   
 *   Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
 *   Найти и вывести: 
 *   a) список покупателей в алфавитном порядке; 
 *   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {
	private static int counter = 0;
	private final int id;
	private String firstName;
	private String secondName;
	private String patronymic;
	private String adress;
	private String numberOfCreditCard;
	private String numberOfBankAccount;
	
	public Customer() {
		counter++;
		id = counter;
	}
	
	public Customer(String firstName, String secondName, String patronymic, String adress, String numberOfCreditCard, String numberOfBankAccount) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.patronymic = patronymic;
		this.adress = adress;
		this.numberOfBankAccount = numberOfBankAccount;
		this.numberOfCreditCard = numberOfCreditCard;
		counter++;
		id = counter;
		
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result + id;
		result = 31*result + (firstName == null ? 0: firstName.hashCode());
		result = 31*result + (secondName == null ? 0: secondName.hashCode());
		result = 31*result + (patronymic == null ? 0: patronymic.hashCode());
		result = 31*result + (adress == null ? 0: adress.hashCode());
		result = 31*result + (numberOfBankAccount == null ? 0: numberOfBankAccount.hashCode());
		result = 31*result + (numberOfCreditCard == null ? 0: numberOfCreditCard.hashCode());
		return result;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Customer cust = (Customer) obj;
		return this.id == cust.id && this.firstName.equals(cust.firstName) && this.secondName.equals(cust.secondName)
				&& this.patronymic.equals(cust.patronymic) && this.adress.equals(cust.adress) 
				&& this.numberOfBankAccount.equals(cust.numberOfBankAccount)&& this.numberOfCreditCard.equals(cust.numberOfCreditCard);
	}
	
	@Override
	public String toString() {
		return "Customer [id = " + id + ", firstName = " + firstName + ", secondName = " + secondName + ", patronymic = "
				+ patronymic + ", adress = " + adress + ", numberOfCreditCard = " + numberOfCreditCard
				+ ", numberOfBankAccount = " + numberOfBankAccount + "]";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Customer.counter = counter;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumberOfCreditCard() {
		return numberOfCreditCard;
	}

	public void setNumberOfCreditCard(String numberOfCreditCard) {
		this.numberOfCreditCard = numberOfCreditCard;
	}

	public String getNumberOfBankAccount() {
		return numberOfBankAccount;
	}

	public void setNumberOfBankAccount(String numberOfBankAccount) {
		this.numberOfBankAccount = numberOfBankAccount;
	}

	public int getId() {
		return id;
	}
	
}
