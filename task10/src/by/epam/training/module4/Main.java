package by.epam.training.module4;
/*
 * 10.Создать класс Airline, спецификация которого приведена ниже.
 *    Определить конструкторы, set-и get- методы и метод  toString().
 *    Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 *    Задать критерии выбора данных и вывести эти данные на консоль.
 *    Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 *    Найти и вывести: 
 *    a) список рейсов для заданного пункта назначения;
 *    b) список рейсов для заданного дня недели; 
 *    c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Main {

	public static void main(String[] args) {
		AirlineList airlines = new AirlineList();
		AirlineLogic logic = AirlineLogic.getInstance();
		View view = View.getInstance();
		
		airlines.addAirline(new Airline("Minsk", 9273, "Boeing", new Time(23,40), "Monday"));
		airlines.addAirline(new Airline("Moskow", 9864, "Maize", new Time(11,45), "Saturday"));
		airlines.addAirline(new Airline("New-York", 1342, "Boeing", new Time(13,32), "Saturday"));
		airlines.addAirline(new Airline("Paris", 9683, "Jet", new Time(12,23), "Thurstday"));
		airlines.addAirline(new Airline("Washington", 7684, "Boeing", new Time(17,56), "Sunday"));
		airlines.addAirline(new Airline("Paris", 6574 , "Boeing", new Time(10,20), "Monday"));
		
		System.out.println("Cписок рейсов для заданного пункта назначения");
		System.out.println();
		view.printAirlineList(logic.searchByDestination(airlines, "New-York"));
		System.out.println("Cписок рейсов для заданного дня недели");
		System.out.println();
		view.printAirlineList(logic.searchByDayOfWeek(airlines, "Monday"));
		System.out.println("Cписок рейсов для заданного дня недели, время вылета для которых больше заданного");
		System.out.println();
		view.printAirlineList(logic.searchByDayOfWeekAndTime(airlines, "Monday", new Time(12,0)));
		
		
		
	}

}
