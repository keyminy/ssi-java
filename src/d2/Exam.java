package d2;

public class Exam implements Comparable<Exam>{
	private String name;
	private int age;
	
	public Exam() {}
	public Exam(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Exam [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Exam o) {
		return this.name.compareTo(o.getName());
	}
	
}
