//컴퓨터학과 20190975 신효경
public class VisitingStudent extends Student {
	
	public VisitingStudent(int id, int tuition, double gpa) {
		super(id, tuition, gpa);
	}
	@Override
	public int calcScholarship() {
		return 0;
	}
}
