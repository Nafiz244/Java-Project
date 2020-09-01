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
	public List<Student> getStudents(){
		return students;
		
	}
	public void addStudent(Student student) {
		students.add(student);
		
	}
	public  int  getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
    public void  updateTotalMoneyEarned(int MoneyEarned) {
	    totalMoneyEarned +=MoneyEarned;
     }
    public int getTotalMoneySpent() {
	    return totalMoneySpent;
	
     }
     public void updateTotalMoneySpent(int MoneySpent) {
	     totalMoneyEarned-=MoneySpent;
     }
  package school.managemen.system;
	public class Main{
        public static void main(string[] args ){		

}
