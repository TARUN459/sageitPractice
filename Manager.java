package absracctclass;

public class Manager extends Abstractclass{

	

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String getGrade() {
		// TODO Auto-generated method stub
		return grade;
	}

	@Override
	public void setGrade(String grade) {
		this.grade = grade;
		
	}
	 void label(){
		 System.out.println(this.salary + " " + this.grade);
	 }
	public static void main(String[] args) {
	    Manager m  = new Manager();
		m.setSalary(80000);
		m.setGrade("B");
		m.label();

	}
	
	
}
