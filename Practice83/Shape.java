//��ǻ���а� 20190975 ��ȿ��
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
		baseInfo = "Ÿ��: "+this.type+"\n�߽���ǥ: ("+this.x+", "+this.y+")";
	}
	
	public abstract double calcArea();//ȣ���� �ʿ� �����ϱ� return�Ұ͵� ����.
	
	public abstract String toString();//ȣ���� �ʿ� �����ϱ� return�Ұ͵� ����.
	
}
