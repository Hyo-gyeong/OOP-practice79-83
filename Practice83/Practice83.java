//��ǻ���а� 20190975 ��ȿ��
public class Practice83 {

	public static void main(String[] args) {		
		
		Rectangle r = new Rectangle(30, 35, "�簢��");
		Triangle t = new Triangle(40, 45, "�ﰢ��");
		Circle c = new Circle(50, 53, "��");
		
		r.setLength(32);
		r.setWidth(31);
		System.out.println(r.toString());
		
		t.setBase(50);
		t.setHeight(60);
		System.out.println("\n"+t.toString());
		
		c.setRadius(10);
		System.out.println("\n"+c.toString());
		
	}

}
