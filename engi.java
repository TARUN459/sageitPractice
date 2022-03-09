package absracctclass;

public class engi extends Abstractclass {


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
		engi n = new engi();
		engi h = new engi();
		n.setSalary(70000);
		n.setGrade("A");
		h.setSalary(50000);
		h.setGrade("B");
		n.label();
		h.label();
		

	}
	
	
}
