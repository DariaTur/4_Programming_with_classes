package by.epam.training.module4;

import java.util.Arrays;

public class Student {
	private String name;
	private int number;
	private static final int numberOfExams = 5;
	private int[] marks = new int[numberOfExams];
	
	public Student() {};
	
	public Student(String name, int number, int[] marks ) {
		this.name = name;
		this.number = number;
		this.marks = marks;
	}
	
	public boolean isExcellentStudent() {
		boolean check = true;
		for(int i : marks) {
			if(i!=9 && i!=10) {
				check = false;
			}
		}
		return check;
	}
	
	public void view() {
		System.out.println("Фамилия и инициалы: "+name+", номер группы: "+number);
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName()+"[name = " +name+", group = "+number+", marks = "+Arrays.toString(marks)+"]";
	}
	
	@Override
	public int hashCode() {
        int result = 17;
        result = 31 * result + (name!=null? name.hashCode() : 0);
        result = 31 * result + number;
        result = 31 * result + (marks!=null? marks.hashCode() : 0);
        return result;
    }
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
			return false;
		if(this.getClass() != obj.getClass())
			return false;
		Student object = (Student) obj;
		return this.name.equals(object.name) && this.number == object.number && Arrays.equals(this.marks, object.marks);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	
}
