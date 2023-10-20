package d5;

public class Student {
	private String name;
	private String addr;
	
	public Student(String name) {
		this(name, "seoul");
	}
	public Student(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + "]";
	}
	
	
}
