//��ǻ���а� 20190975 ��ȿ��
public class Cylinder extends Circle{
	private double height;
	
	public Cylinder() { 
		this.height = 0; 
	}
	public Cylinder(double radius) { 
		super(radius);
	}
	public Cylinder(double radius, double height) { 
		super(radius);
		this.height = height;
	}
	public Cylinder(int x, int y, double radius, double height) {
		super(x, y, radius);
		this.height = height;
	}
	public double getHeight() { 
		return height;
	}
	public double getVolume() {
		return getArea() * getHeight();
	}
	public String toString() {
		return super.toString()+"\n����: "+getHeight()+"\n����: "+getVolume();
	}
}
