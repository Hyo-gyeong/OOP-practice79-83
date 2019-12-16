//컴퓨터학과 20190975 신효경
public class Triangle extends Shape{
	private int base;
	private int height;
	
	void setBase(int b) {
		this.base = b;
	}
	int getBase() {
		return this.base;
	}
	
	void setHeight(int h) {
		this.height = h;
	}
	int getHeight() {
		return this.height;
	}
	
	@Override
	public double calcArea() {
		return getBase()*getHeight()/2;
	}
	
	@Override
	public String toString() {
		return super.toString()+", 밑변: "+getBase()+", 높이: "+getHeight()+", 면적: "+calcArea();
	}
}
