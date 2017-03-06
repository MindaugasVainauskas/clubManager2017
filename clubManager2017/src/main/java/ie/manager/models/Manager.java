//This is a bean class for club manager object
package ie.manager.models;

import javax.persistence.*;

@Entity
@Table(name = "manager")
public class Manager {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int manId;
	private String name;
	private String password;
	
	public Manager(String name, String password) {		
		this.name = name;
		this.password = password;
	}

	// ------------------------ Getter and setter methods ---------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getManId() {
		return manId;
	}

	@Override
	public String toString() {
		return "Manager [manId=" + manId + ", name=" + name + ", password=" + password + "]";
	}
	
}
