//��ǻ���а� 20190975 ��ȿ��
public class Circle extends Shape{
	private double radius;

	public Circle() { 
		this(0, 0, 0); 
	}//11ȸ�� �����ڷ� ��
	
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
		return super.toString()+"������ : "+getRadius()+"\n�ܸ��� : "+getArea();
	}
}
