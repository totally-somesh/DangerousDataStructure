package Q2;

public class Student {
	
	public int student_id;
	public String student_name;
	public int student_marks;
	public int count;
	
	public Student(int student_id, String student_name, int student_marks) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_marks = student_marks;
		count++;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_marks() {
		return student_marks;
	}

	public void setStudent_marks(int student_marks) {
		this.student_marks = student_marks;
	}

	
	
	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return " | Student_id : " + student_id + " | Student_name : " + student_name + " | Student_marks : "
				+ student_marks + " | ";
	}	
	
	
}
