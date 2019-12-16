//컴퓨터학과 20190975 신효경
public class Practice81 {

	public static void main(String[] args) {
		Undergraduate u = new Undergraduate(2222, 100, 4.1, 3);
		Graduate g1 = new Graduate(3333, 100, 3.4, "SE");
		Graduate g2 = new Graduate(5555, 100, 4.0, "OS");
		VisitingStudent v = new VisitingStudent(4444, 100, 2.5);
		
		//System.out.println(s.toString()); //추상클래스 생성자 만들 수 없어서
		System.out.println(u.toString());
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(v.toString());
	}

}
