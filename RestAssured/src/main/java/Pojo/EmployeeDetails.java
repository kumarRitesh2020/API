package Pojo;

public class EmployeeDetails {
	
	//STEP 1-DECLARE ALL THE VARIABLES GLOBALLY
		String eName;
		String eId;
		int phoneNo;
		String address;
		String MailId;
		
		//STEP 2-create constructor for Initialization
		
		public EmployeeDetails(String eName, String eId, int phoneNo, String address, String mailId) {
			super();
			this.eName = eName;
			this.eId = eId;
			this.phoneNo = phoneNo;
			this.address = address;
			MailId = mailId;
		}
		
		public EmployeeDetails() {
			
		}

		//STEP 3-create getter & setter
		
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

		public int getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(int phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getMailId() {
			return MailId;
		}

		public void setMailId(String mailId) {
			MailId = mailId;
		
		
		}

}
