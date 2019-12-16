//컴퓨터학과 20190975 신효경
public class Graduate extends Student{
	private String lab;
	
	Graduate() {	//초기화
		super();
		this.lab = "";
	}
	Graduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	@Override
	public int calcScholarship() {
		if (getGpa() >= 3.5) {
			return (int)(getTuition() * 0.5);
		}
		else {
			return (int)(getTuition() * 0.3);
		}
	}
	public String toString() {
		return super.toString()+", 연구실: "+lab;
	}
}
