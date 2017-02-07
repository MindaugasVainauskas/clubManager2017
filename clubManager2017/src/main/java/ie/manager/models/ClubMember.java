//This is a bean class for club member object
package ie.manager.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity(name = "members")
public class ClubMember implements Serializable{
	
	//studentId is a primary key for members table in database. As such it is used as Id for this Entity.
	@Id
	private String studentId;
	
	private String name;
	
	private String surname;
	
	private int phone;
	
	private String email;
	
	//null constructor
	protected ClubMember(){
		
	}
	
	//overloaded constructor
	public ClubMember(String studentId, String sName, String sSurname, int sPhoneNo, String sEmail) {
		this.studentId = studentId;
		this.name = sName;
		this.surname = sSurname;
		this.phone = sPhoneNo;
		this.email = sEmail;
	}
	//mutator methods for member details
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getsName() {
		return name;
	}
	public void setsName(String sName) {
		this.name = sName;
	}
	public String getsSurname() {
		return surname;
	}
	public void setsSurname(String sSurname) {
		this.surname = sSurname;
	}
	public int getsPhoneNo() {
		return phone;
	}
	public void setsPhoneNo(int sPhoneNo) {
		this.phone = sPhoneNo;
	}
	public String getsEmail() {
		return email;
	}
	public void setsEmail(String sEmail) {
		this.email = sEmail;
	}

	@Override
	public String toString() {
		return "Club_member [studentId=" + studentId + ", name=" + name + ", surname=" + surname + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
	

}
