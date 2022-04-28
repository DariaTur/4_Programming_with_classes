package by.epam.training.module4;

public class Main {

	public static void main(String[] args) {
		Test2 test1 = new Test2();
		Test2 test2 = new Test2(2,3);
		
		test1.setA(4);
		test1.setB(7);
		
		System.out.println("Объект test1: a = "+test1.getA()+"; b = "+test1.getB());
		System.out.println("Объект test2: a = "+test2.getA()+"; b = "+test2.getB());
		
	}

}
