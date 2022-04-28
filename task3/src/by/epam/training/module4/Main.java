package by.epam.training.module4;

import java.util.Random;
/*
 * 3.Создайте классс именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 *   Создайте массив из десяти элементов такого типа.
 *   Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Main {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		Random r = new Random();
		String[] names = {"Иванов И.И.", "Петров П.Г.","Иванова А.Л.", "Смирнов О.Д.", 
				"Кузнецов Т.О.", "Попов П.Л.","Васильев Е.Т.",
				"Петрова О.В.", "Соколов И.И.", "Михайлов Н.З."};
		int k = 0;
		
		for(int j = 0; j<10; j++) {
			int[] marks = new int[5];
			
			for(int i = 0; i<5; i++) {
				marks[i] = r.nextInt(10)+1;
			}
			
			students[j] = new Student(names[k], r.nextInt(5)+1,marks);
			k++;
		}
		
		students[4].setMarks(new int[]{9,9,9,9,9});
		students[8].setMarks(new int[]{9,10,9,10,9}); // для проверки метода isExcellentStudent
		
		System.out.println("Все студенты");
		for(Student s: students) {
			s.view();
		}
		System.out.println();
		System.out.println("Cтуденты, имеющие оценки, равные только 9 или 10");
		for(Student s: students) {
			if(s.isExcellentStudent()) {
				s.view();
			}
		}
		Student s = students[0];
		System.out.println(students[0].equals(students[1]));
		System.out.println(s.equals(students[0]));
	}

}
