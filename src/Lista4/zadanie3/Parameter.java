package Lista4.zadanie3;


public class Parameter {
	private String name;
	private int height;
	private int weight;
	
	public Parameter(String name, int height, int weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void printInfo() {
		System.out.printf("Imi�: %s, wzrost: %d, waga: %d", getName(), getHeight(), getWeight());
	}
	
}
