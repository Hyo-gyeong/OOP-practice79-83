//컴퓨터학과 20190975 신효경
public class Undergraduate extends Student{
	private int year;
	
	void setYear(int year) {
		this.year = year;
	}
	int getYear() {
		return this.year;
	}
	
	Undergraduate(){//초기화
		super();
		this.year = 0;
	}
	Undergraduate(int id, int tuition, double gpa, int year){
		super(id, tuition, gpa);
		this.year = year;
	}
	@Override
	public int calcScholarship() {
		return (int)(getTuition() * 0.4);
	}
	public String toString() {
		return super.toString()+", 학년 : "+year;
	}
}
