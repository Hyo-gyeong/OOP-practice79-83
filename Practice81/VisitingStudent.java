//��ǻ���а� 20190975 ��ȿ��
public class VisitingStudent extends Student {
	
	public VisitingStudent(int id, int tuition, double gpa) {
		super(id, tuition, gpa);
	}
	@Override
	public int calcScholarship() {
		return 0;
	}
}
