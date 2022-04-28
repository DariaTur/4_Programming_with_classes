package by.epam.training.module4;

/*
 * 7.Описать класс, представляющий треугольник.
 *   Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */
public class Main {

	public static void main(String[] args) {
		Triangle tr1 = new Triangle(new Point(0, 0), new Point(4, 0), new Point(0, 3));
	
		System.out.println(tr1.centroid());
		System.out.println(tr1.area());
		System.out.println(tr1.perimeter());
		System.out.println(tr1);

	}

}
