package absracctclass;

public abstract class Abstractclass {

	   int salary;
	   String grade;

	    public abstract int getSalary();

	    public abstract void setSalary(int salary);

	    public abstract String getGrade();

	    public abstract void setGrade(String grade);
	     
	    void label(){
	      
	     System.out.println("Employee's data:\n" );

	     }
}

	class Engineer extends Abstractclass{
		private  int salary; 
		private  String grade;
		@Override
		public int getSalary() {
			return salary;
			 
		}

		@Override
		public void setSalary(int salary) {
			this.salary = salary;
			
		}

		@Override
		public String getGrade() {			
			return grade;
		}

		@Override
		public void setGrade(String grade) {
			this.grade = grade;
			
		}
	


	}
	
	
	class Manager extends Abstractclass{

		@Override
		public int getSalary() {
			return salary;
		}

		@Override
		public void setSalary(int salary) {
			this.salary = salary;
		}

		@Override
		public String getGrade() {	
			return grade;
		}

		@Override
		public void setGrade(String grade) {
			this.grade = grade;
		}
		
	}
	
	