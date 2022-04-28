package by.epam.training.module4;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		if (a == null || b == null || c == null || (a.getX()-c.getX())*(b.getY()-c.getY())-(b.getX()-c.getX())*(a.getY()-c.getY())==0) {
        	throw new IllegalArgumentException("Создание такого треугольника невозможно");
        } else {
        	this.a = a;
        	this.b = b;
        	this.c = c;
        }
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		result = 31*result + (a == null ? 0 : a.hashCode());
		result = 31*result + (b == null ? 0 : b.hashCode());
		result = 31*result + (c == null ? 0 : c.hashCode());
		return result;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
		    return false;
		
		Triangle t = (Triangle) obj;
		return this.a.equals(t.a) && this.b.equals(t.b) && this.c.equals(t.c); 
	}
	
	@Override
	public String toString() {
		return "Triangle [a = "+a.toString()+", b = "+b.toString()+", c = "+c.toString()+"]";
	}
	
	public Point centroid(){
        double x;
        double y;
        Point p;
        
        x = (a.getX()+b.getX()+c.getX())/3;
        y = (a.getY()+b.getY()+c.getY())/3;
        
        p = new Point(x,y);
        
        return p;  
    }
	
	public double area() {
        double area;
        
        area = Math.abs((a.getX()-c.getX())*(b.getY()-c.getY())-(b.getX()-c.getX())*(a.getY()-c.getY()))/2;
        
        return area;
    }
	
	private double distanceBetweenPoints(Point d, Point f) {
		return Math.sqrt(Math.pow(d.getX()-f.getX(), 2)+Math.pow(d.getY()-f.getY(), 2));
	}
	
	public double perimeter() {
		double p;
		
		p = distanceBetweenPoints(a,b)+distanceBetweenPoints(b,c)+distanceBetweenPoints(a,c);
		
		return p;
	}
	
	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}
	
	
	
	
}
