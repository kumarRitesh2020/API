package Pojo;

public class EmployeeDetailsWithStringArray {
	
	String eName;
	String eId;
	int salary;
    Object spouse;

    public EmployeeDetailsWithStringArray(String eName, String eId, int salary, Object spouse) {
		super();
		this.eName = eName;
		this.eId = eId;
		this.salary = salary;
		this.spouse= spouse;
	}
     public EmployeeDetailsWithStringArray(String string, String string2, int i) {
    	 
     }
    

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Object getSpouse() {
		return spouse;
	}

	public void setSpouse(Object spouse) {
		this.spouse = spouse;
	}
	

}