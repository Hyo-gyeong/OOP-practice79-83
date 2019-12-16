//��ǻ���а� 20190975 ��ȿ��
public abstract class Student {
	private int id, tuition;
	private double gpa;
	
	int getId() {return id;}
	void setTuition(int tuition) { this.tuition = tuition;}
	int getTuition() {return tuition;}
	void setGpa(double gpa) { this.gpa = gpa;}
	double getGpa() { return gpa; }
	
	Student(){//�ʱ�ȭ
		this.id = 0;
		this.tuition = 0;
		this.gpa = 0;
	}
	Student(int id) {
		this.id = id;
	}
	Student(int id, int tuition, double gpa){
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	public abstract int calcScholarship();
	
	public String toString() {
		return "�й�: "+getId()+", ��ϱ�: "+getTuition()+", ��յ��: "+getGpa()
				+", ���б�: "+calcScholarship();
	}
}
