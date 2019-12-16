//20190975 컴퓨터학과 신효경
public class BodyData {
	private int weight; 
	private int height;
	private String name;

	void setWeight(int weight) { this.weight = weight;}
	int getWeight() { return weight; }
	void setHeight(int height) { this.height = height; }
	int getHeight() {return height; }
	void setName(String name) {this.name = name;}
	String getName() {return name;}
	
	public int idealWeight() { return height-110;}
	
	public boolean isTallerThan(BodyData b) {
		if (getHeight() > b.height)
			return true;
		else return false;
	}
	
	public boolean needDiet() {
		if (getWeight() > idealWeight())
			return true;
		else return false;
	}
}
