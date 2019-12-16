//컴퓨터학과 20190975 신효경
public abstract class Shape {
	private int x;
	private int y;
	protected String type;
	protected String baseInfo;
	
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}
	
	Shape(int x, int y, String t){
		setX(x);
		setY(y);
		this.type = t;
		baseInfo = "타입: "+this.type+"\n중심좌표: ("+this.x+", "+this.y+")";
	}
	
	public abstract double calcArea();//호출할 필요 없으니까 return할것도 없음.
	
	public abstract String toString();//호출할 필요 없으니까 return할것도 없음.
	
}
