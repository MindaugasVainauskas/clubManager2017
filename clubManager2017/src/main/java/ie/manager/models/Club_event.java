//This is a bean class for club event object
package ie.manager.models;

//need this import as this bean will deal with date setting of events
import java.util.Date;

public class Club_event {

	private String eventName;
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
}
