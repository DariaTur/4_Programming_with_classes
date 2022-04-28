package by.epam.training.module4;

public class Point {
	private double x;
	private double y;
	
	public Point() {};
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result+Double.hashCode(x);
		result = 31*result+Double.hashCode(y);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Point p = (Point) obj;
		return this.x == p.x && this.y == p.y;
	}
	
	public String toString() {
		return "Point [x = "+x+", y = "+y+"]";
	}
}
