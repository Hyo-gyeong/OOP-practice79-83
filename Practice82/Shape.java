//컴퓨터학과 20190975 신효경
public class Shape {
	private int x;
	private int y;
	
	void setX(int x) {
		this.x = x;
	}
	int getX() {
		return this.x;
	}
	
	void setY(int y) {
		this.y = y;
	}
	int getY() {
		return this.y;
	}
	
	public double calcArea(){
		return -1;
	}
	
	public String toString() {
		return "타입: 도형\n중심좌표: "+positionStr();
	}
	
	public String positionStr() {
		return "("+getX()+", "+getY()+")";
	}
}
