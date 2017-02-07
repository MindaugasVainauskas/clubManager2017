//This is a bean class for club event object
package ie.manager.models;

import java.io.Serializable;
//need this import as this bean will deal with date setting of events
import java.util.Date;

import javax.persistence.*;

@Entity(name = "events")
public class ClubEvent implements Serializable{

	//eventId is the primary key of the events table. As such it is used as Id for this Entity
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int eventId;
	
	private String eventName;
	//for date might need to add Temporal type. will investigate for now.
	@Temporal(TemporalType.DATE)
	private Date eventDate;
	
	private String eventDesc;
	
	//null constructor
	public ClubEvent(){
		
	}
	
	//overloaded constructor
	public ClubEvent(String eventName, Date eventDate, String eventDesc) {
		super();
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.eventDesc = eventDesc;
	}
	// --------------  mutator methods ----------
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "Club_event [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate
				+ ", eventDesc=" + eventDesc + "]";
	}
	
	
}
