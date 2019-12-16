//��ǻ���а� 20190975 ��ȿ��
public class Undergraduate extends Student{
	private int year;
	
	void setYear(int year) {
		this.year = year;
	}
	int getYear() {
		return this.year;
	}
	
	Undergraduate(){//�ʱ�ȭ
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
		return super.toString()+", �г� : "+year;
	}
}
