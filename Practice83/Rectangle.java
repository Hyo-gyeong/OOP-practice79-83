//��ǻ���а� 20190975 ��ȿ��
public class Rectangle extends Shape{
	private int length;
	private int width;
	
	void setLength(int l) {
		this.length = l;
	}
	int getLength() {
		return this.length;
	}
	
	void setWidth(int w) {
		this.width = w;
	}
	int getWidth() {
		return this.width;
	}
	
	@Override
	public double calcArea() {
		return getLength()*getWidth();
	}
	
	Rectangle(int x, int y, String t){
		super(x, y, t);
	}
	@Override
	public String toString() {
		return baseInfo+", ����: "+getWidth()+", ����: "+getLength()+", ����: "+calcArea();
	}
}