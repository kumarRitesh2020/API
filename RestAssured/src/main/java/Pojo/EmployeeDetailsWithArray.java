package Pojo;

public class EmployeeDetailsWithArray {
	
	String eName;
	String eId;
	int[] phoneNo;
	int salary;
	
	public EmployeeDetailsWithArray(String eName, String eId, int[] phoneNo, int salary) {
		this.eName = eName;
		this.eId = eId;
		this.phoneNo = phoneNo;
		this.salary = salary;
	}
	public EmployeeDetailsWithArray() {
		
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

	public int[] getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	

}
