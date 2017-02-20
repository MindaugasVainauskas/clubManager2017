//This is a bean class for club event object
package ie.manager.models;

import java.io.Serializable;
//need this import as this bean will deal with date setting of events
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "events")
public class Event implements Serializable{

	//eventId is the primary key of the events table. As such it is used as Id for this Entity
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)		
	private int eventid;
	
	private String eventname;
	//for date might need to add Temporal type. will investigate for now.
	
	private Date eventdate;
	
	private String eventdesc;
	
	//null constructor
	public Event(){
		
	}
	
	//overloaded constructor
	public Event(String eventName, Date eventDate, String eventDesc) {
		super();
		this.eventname = eventName;
		this.eventdate = eventDate;
		this.eventdesc = eventDesc;
	}
	// --------------  mutator methods ----------
	public String geteventname() {
		return eventname;
	}
	public void seteventname(String eventName) {
		this.eventname = eventName;
	}
	public Date geteventdate() {
		return eventdate;
	}
	public void seteventdate(Date eventDate) {
		this.eventdate = eventDate;
	}
	public String geteventdesc() {
		return eventdesc;
	}
	public void seteventdesc(String eventDesc) {
		this.eventdesc = eventDesc;
	}

	public int geteventid() {
		return eventid;
	}

	public void seteventid(int eventId) {
		this.eventid = eventId;
	}

	@Override
	public String toString() {
		return "ClubEvent [eventId=" + eventid + ", eventName=" + eventname + ", eventDate=" + eventdate
				+ ", eventDesc=" + eventdesc + "]";
	}
	
	
}
