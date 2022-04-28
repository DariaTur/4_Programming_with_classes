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
public class Main {

	public static void main(String[] args) {
		CustomerList customers = new CustomerList();
		CustomerLogic logic = CustomerLogic.getInstance();
		View v = View.getInstance();
		
		customers.addCustomer(new Customer("Sergey","Ivanov", "Sergeevich", "Rybinovaya street", "2345 5678 8976 3452", "AT611904300234573201"));
		customers.addCustomer(new Customer("Andrew","Petrov", "Igorevich", "Sovetskaya street", "5674 5345 8796 8974", "BE68539007547034"));
		customers.addCustomer(new Customer("Daria","Popova", "Olegovna", "Pushkinskaya street", "4563 0987 1546 7614", "DE89370400440532013000"));
		customers.addCustomer(new Customer("Vasiliy","Kuznecov", "Alexandrovich", "Kolesnika street", "8745 1056 2931 6434", "GR1601101250000000012300695"));
		customers.addCustomer(new Customer("Polina","Sokolova", "Pavlovna", "Yasnaya street", "5643 9487 1957 6573", "DK5000400440116243"));
		
		CustomerList result1 = logic.sortByName(customers);
		CustomerList result2 = logic.findCustomerByCard(customers, "2333 3333 3333 3333", "5645 5555 5555 5555");
		
		System.out.println("Список покупателей по алфавиту:");
		v.printByName(result1);
		System.out.println();
		
		System.out.println("Cписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
		v.printCustomerName(result2);
		
		
	}

}
