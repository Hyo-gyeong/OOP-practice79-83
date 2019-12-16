//컴퓨터학과 20190975 신효경
public class Circle extends Shape{
	private double radius;

	public Circle() { 
		this(0, 0, 0); 
	}//11회차 강의자료 끝
	
	public Circle(double radius) { 
		this(0, 0, radius); 
	}
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	public double getRadius() { 
		return radius;
	}
	public double getArea() {
		return (3.14*radius*radius); 
	}
	public String toString() {
		return super.toString()+"반지름 : "+getRadius()+"\n단면적 : "+getArea();
	}
}
