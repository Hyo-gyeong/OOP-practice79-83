//��ǻ���а� 20190975 ��ȿ��
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
		return "Ÿ��: ����\n�߽���ǥ: "+positionStr();
	}
	
	public String positionStr() {
		return "("+getX()+", "+getY()+")";
	}
}
