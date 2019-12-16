//컴퓨터학과 20190975 신효경
public class Practice80 {

	public static void main(String[] args) {
		Circle c = new Circle(4, 5, 10);
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder(10, 20, 5, 3);
		
		System.out.println("Circle 객체에 대한 정보입니다.");
		System.out.println(c.toString());
		
		System.out.println("\nCylinder 객체 1에 대한 정보입니다.");
		System.out.println(cy1.toString());
		
		System.out.println("\nCylinder 객체 2에 대한 정보입니다.");
		System.out.println(cy2.toString());
	}

}
