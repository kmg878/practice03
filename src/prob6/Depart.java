package prob6;

public class Depart extends Employee {
	private String department;
	
	public Depart(String name, int salary, String department) {
		setName( name );
		setSalary( salary );
		this.department = department;
				
	}


	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void getInformation() {
		System.out.printf( "이름: %s   연봉: %d\n 부서: %s\n  ", getName(), getSalary(),department );
	}

}
