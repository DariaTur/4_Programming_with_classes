package by.epam.training.module4;

public class Main {

	public static void main(String[] args) {
		Time t = new Time(0,34,54);
		
		System.out.println(t.getInfo());
		
		t.changeHours(25);
		System.out.println(t.getInfo());
		
		t.changeMinutes(56);
		System.out.println(t.getInfo());
		
		t.changeSeconds(6);
		System.out.println(t.getInfo());

	}

}
