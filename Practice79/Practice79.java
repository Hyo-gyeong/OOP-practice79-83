//컴퓨터학과 20190975 신효경
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
		
		System.out.print("이름을 입력하세요: ");
		bd.setName(s.next());
		System.out.print("키를 입력하세요: ");
		bd.setHeight(s.nextInt());
		System.out.print("몸무게를 입력하세요: ");
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
			System.out.println("\n키는 "+b1.getName()+"이 더 큽니다.\n");
		}
		else {System.out.println("\n키는 "+b2.getName()+"이 더 큽니다.\n");}
	}
	public static void printDietMsg(BodyData b) {
		if (b.needDiet() == true) {
			System.out.println(b.getName()+"는 다이어트가 필요합니다.");
		}
		else {System.out.println(b.getName()+"는 다이어트가 필요하지 않습니다.");}
	}

}
