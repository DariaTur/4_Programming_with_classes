package by.epam.training.module4;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 4.Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 *   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
 *   Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 *   Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 *   упорядочены по времени отправления.
 */
public class Main {
	
	public static int readFromConsole(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(">>");
		}
		int num = sc.nextInt();
		return num;
	}
	
	public static void main(String[] args) {
		Train[] trains = new Train[5];
		trains[0] = new Train("Brest", 654, "6:10");
		trains[1] = new Train("Grodno", 567, "12:30");
		trains[2] = new Train("Minsk", 345, "00:45");
		trains[3] = new Train("Gomel", 546, "2:00");
		trains[4] = new Train("Vitebsk", 476, "23:25");
		
		System.out.println(Arrays.toString(Train.sortByNumbers(trains)));
		System.out.println(Arrays.toString(Train.sortByDestination(trains)));
		System.out.println("Введите номер поезда: "+trains[0].getNumber()+", "+trains[1].getNumber()
				+", "+trains[2].getNumber()+", "+trains[3].getNumber()+", "+trains[4].getNumber());
		int num = readFromConsole();
		
		Train.printTrainByNumber(trains, num); 
	}

}
