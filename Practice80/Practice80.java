//��ǻ���а� 20190975 ��ȿ��
public class Practice80 {

	public static void main(String[] args) {
		Circle c = new Circle(4, 5, 10);
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder(10, 20, 5, 3);
		
		System.out.println("Circle ��ü�� ���� �����Դϴ�.");
		System.out.println(c.toString());
		
		System.out.println("\nCylinder ��ü 1�� ���� �����Դϴ�.");
		System.out.println(cy1.toString());
		
		System.out.println("\nCylinder ��ü 2�� ���� �����Դϴ�.");
		System.out.println(cy2.toString());
	}

}
