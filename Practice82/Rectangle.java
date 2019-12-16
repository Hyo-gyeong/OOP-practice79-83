//컴퓨터학과 20190975 신효경
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
	
	@Override
	public String toString() {
		return super.toString()+", 가로: "+getWidth()+", 세로: "+getLength()+", 면적: "+calcArea();
	}
}
