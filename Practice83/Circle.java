//��ǻ���а� 20190975 ��ȿ��
public class Circle extends Shape{
	private int radius;
	
	void setRadius(int r) {
		this.radius = r;
	}
	int getRadius() {
		return this.radius;
	}
	Circle(int x, int y, String t){
		super(x, y, t);
	}
	
	@Override
	public double calcArea() {
		return getRadius()*getRadius()*3.14;
	}
	
	@Override
	public String toString() {
		return baseInfo+", ������: "+getRadius()+", ����: "+calcArea();
	}
}
