package design_pattern.ch01_check03;

public class TestMain {
	public static void main(String[] args) {
		
		Course c1 = new Course("Java");
		Course c2 = new Course("android");
		Course c3 = new Course("Database");
		Course c4 = new Course("Html");
		
		Student std1 =new Student("Astu");
		Student std2 =new Student("Bstu");
		Student std3 =new Student("Cstu");
		
		std1.registerCourse(c1);
		std1.registerCourse(c2);
		std1.registerCourse(c3);
		
		std2.registerCourse(c1);
		std2.registerCourse(c3);
		
		std3.registerCourse(c2);
		std3.registerCourse(c3);		
		
		
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

	
}
