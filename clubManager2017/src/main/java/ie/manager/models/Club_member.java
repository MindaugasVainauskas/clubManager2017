//This is a bean class for club member object
package ie.manager.models;

public class Club_member {
	
	private String studentId;
	private String sName;
	private String sSurname;
	private int sPhoneNo;
	private String sEmail;
	
	//null constructor
	public Club_member(){
		
	}
	
	//overloaded constructor
	public Club_member(String studentId, String sName, String sSurname, int sPhoneNo, String sEmail) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.sSurname = sSurname;
		this.sPhoneNo = sPhoneNo;
		this.sEmail = sEmail;
	}
	//mutator methods for member details
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSurname() {
		return sSurname;
	}
	public void setsSurname(String sSurname) {
		this.sSurname = sSurname;
	}
	public int getsPhoneNo() {
		return sPhoneNo;
	}
	public void setsPhoneNo(int sPhoneNo) {
		this.sPhoneNo = sPhoneNo;
	}
	public String getsEmail() {
		return sEmail;
	}
	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

}
