//��ǻ���а� 20190975 ��ȿ��
public class Practice81 {

	public static void main(String[] args) {
		Undergraduate u = new Undergraduate(2222, 100, 4.1, 3);
		Graduate g1 = new Graduate(3333, 100, 3.4, "SE");
		Graduate g2 = new Graduate(5555, 100, 4.0, "OS");
		VisitingStudent v = new VisitingStudent(4444, 100, 2.5);
		
		//System.out.println(s.toString()); //�߻�Ŭ���� ������ ���� �� ���
		System.out.println(u.toString());
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		System.out.println(v.toString());
	}

}
