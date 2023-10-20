package d5;

public class Person {
	public Student getStudent(String name) {
//		SimpleFive five = (n) -> {
//			return new Student(n);
//		};
		
		SimpleFive five = Student::new;
		
		return five.createStudent(name);
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		Student student = p.getStudent("hong");
		
		System.out.println(student.getName() + 
				" : " + student.getAddr());
	}
	
//	public Student getStudent(String name, String addr) {
//		SimpleFive five = (name,addr) -> {
//			return new Student(name,addr);
//		};
//		
//		return five.createStudent(name,addr);
//	}
}
