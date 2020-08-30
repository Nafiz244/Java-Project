package school.management.system;

public class Student {
	private int id;
	private String name;
	private double grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id,String name,double grade) {
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
		
		
	}
   public void setGrade(double grade)
   {
	   this.grade=grade;
   }
   public void updateFessPaid(int fees) {
	   feespaid+=fees;
	   
	 
    }

}
