package school.management.system;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	
	public Teacher(int id,String Name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		return this.name;
	}

}
