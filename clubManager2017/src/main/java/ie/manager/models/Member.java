//This is a bean class for club member object
package ie.manager.models;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "members")
public class Member implements Serializable{
	
	//studentId is a primary key for members table in database. As such it is used as Id for this Entity.
	@Id
	private String studentid;
	
	private String name;
	
	private String surname;
	
	private String phone;
	
	private String email;
	
	//null constructor
	protected Member(){
		
	}
	
	//overloaded constructor
	public Member(String studentId, String sName, String sSurname, String sPhoneNo, String sEmail) {
		this.studentid = studentId;
		this.name = sName;
		this.surname = sSurname;
		this.phone = sPhoneNo;
		this.email = sEmail;
	}
	//mutator methods for member details
	public String getStudentId() {
		return studentid;
	}
	public void setStudentId(String studentId) {
		this.studentid = studentId;
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
	public String getsPhoneNo() {
		return phone;
	}
	public void setsPhoneNo(String sPhoneNo) {
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
		return "Club_member [studentId=" + studentid + ", name=" + name + ", surname=" + surname + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
	

}
