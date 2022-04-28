package by.epam.training.module4;
/*
 * 2.Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *   Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. 
 */
public class Main {

	public static void main(String[] args) {
		Wheel[] wheels = {new Wheel(15, 195, "France"), new Wheel(15, 195, "France"),new Wheel(15, 195, "France"),new Wheel(15, 195, "France")};
		Engine engine = new Engine(281, 266, 16.1);
		Car car = new Car(2016,wheels,engine, "Chevrolet", 35);
		
		car.showInfo();
		car.changeWheel(2, new Wheel(15, 195, "Germany"));
		car.ride(34);
		car.refuel(5);
		System.out.println(car.toString());

	}

}
