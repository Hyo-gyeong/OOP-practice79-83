//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice82 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		
		System.out.print("������ X��ǥ�� �Է��ϼ���: ");
		s.setX(input.nextInt());
		System.out.print("������ Y��ǥ�� �Է��ϼ���: ");
		s.setY(input.nextInt());
		
		System.out.print("\n�簢���� X��ǥ�� �Է��ϼ���: ");
		r.setX(input.nextInt());
		System.out.print("�簢���� Y��ǥ�� �Է��ϼ���: ");
		r.setY(input.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		r.setWidth(input.nextInt());
		System.out.print("�簢���� ���θ� �Է��ϼ���: ");
		r.setLength(input.nextInt());
		
		System.out.print("\n�ﰢ���� X��ǥ�� �Է��ϼ���: ");
		t.setX(input.nextInt());
		System.out.print("�ﰢ���� Y��ǥ�� �Է��ϼ���: ");
		t.setY(input.nextInt());
		System.out.print("�ﰢ���� �غ��� �Է��ϼ���: ");
		t.setBase(input.nextInt());
		System.out.print("�ﰢ���� ���̸� �Է��ϼ���: ");
		t.setHeight(input.nextInt());
		
		System.out.println("\n"+s.toString());
		System.out.println("\n"+r.toString());
		System.out.println("\n"+t.toString());
		
		input.close();
	}

}
