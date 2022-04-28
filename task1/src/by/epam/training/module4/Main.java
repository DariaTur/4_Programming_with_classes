package by.epam.training.module4;

public class Main {

	public static void main(String[] args) {
		Test1 test = new Test1();
		test.setA(10);
		test.setB(16);
		test.printAll();
		System.out.println("Sum = "+test.sum());
		System.out.println("Max = "+test.max());
	}

}
