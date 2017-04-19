package design_pattern.ch01_check03;


import java.util.Vector;

public class Course {
	private String name;
	private Vector<Student> students;
	
	public Course() {		
		students = new Vector<>();
	}

	public Course(String name) {
		this();
		this.name = name;
	}

	public void addStudent(Student student){
		if (!students.contains(student)){
			students.add(student);
		}
	}
	
	public void dropStudent(Student student){
		if (students.contains(student)){
			students.remove(student);
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Course)obj).name);
	}*/

	/*@Override
	public String toString() {
		return  name;
	}*/
	@Override
	public String toString() {
		return String.format("%s %s", name, students);
	}

	public Vector<Student> getStudents() {
		return students;
	}
	

}
