package school.management.system;

public class School {
	private List<Teacher> teachers;
	private List<Student> students;
	private int totalMoneyEarned;
	private int totalMoneySpent;
      public School(List<Teacher> teachers, List<Student> students){
	        this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpent=0;
}
	public List<Teacher> getTeachers(){
		return teachers;
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	

}
