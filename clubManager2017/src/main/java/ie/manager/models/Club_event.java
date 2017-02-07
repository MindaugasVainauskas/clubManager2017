//This is a bean class for club event object
package ie.manager.models;

//need this import as this bean will deal with date setting of events
import java.util.Date;

import javax.persistence.*;

@Entity(name = "events")
public class Club_event{

	//eventId is the primary key of the events table. As such it is used as Id for this Entity
	@Id
	@GeneratedValue
	private Long eventId;
	
	private String eventName;
	//for date might need to add Temporal type. will investigate for now.
	private Date eventDate;
	private String eventDesc;
	
	//null constructor
	public Club_event(){
		
	}
	
	//overloaded constructor
	public Club_event(String eventName, Date eventDate, String eventDesc) {
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

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
}
