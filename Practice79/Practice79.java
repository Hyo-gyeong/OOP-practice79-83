//��ǻ���а� 20190975 ��ȿ��
import java.util.Scanner;
public class Practice79 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BodyData b1 = getBodyDataInstance(s);
		BodyData b2 = getBodyDataInstance(s);		
		
		printHeightMsg(b1, b2); 
		printDietMsg(b1);
		printDietMsg(b2);
		s.close();
	}

	public static BodyData getBodyDataInstance(Scanner s) {
		BodyData bd = new BodyData();
		
		System.out.print("�̸��� �Է��ϼ���: ");
		bd.setName(s.next());
		System.out.print("Ű�� �Է��ϼ���: ");
		bd.setHeight(s.nextInt());
		System.out.print("�����Ը� �Է��ϼ���: ");
		bd.setWeight(s.nextInt());	
		
		return bd;
	}
	private static BodyData compareHeight(BodyData b1, BodyData b2) {
		if (b1.isTallerThan(b2)) {
			return b1;
		}
		else {return b2;}
	}
	public static void printHeightMsg(BodyData b1, BodyData b2) {
		if (compareHeight(b1, b2) == b1) {
			System.out.println("\nŰ�� "+b1.getName()+"�� �� Ů�ϴ�.\n");
		}
		else {System.out.println("\nŰ�� "+b2.getName()+"�� �� Ů�ϴ�.\n");}
	}
	public static void printDietMsg(BodyData b) {
		if (b.needDiet() == true) {
			System.out.println(b.getName()+"�� ���̾�Ʈ�� �ʿ��մϴ�.");
		}
		else {System.out.println(b.getName()+"�� ���̾�Ʈ�� �ʿ����� �ʽ��ϴ�.");}
	}

}
