//event service class to process queries related to events table in database.
package ie.manager.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ie.manager.dao.EventRepository;
import ie.manager.models.Event;

@Service
@Transactional
public class EventService {
	
	private final EventRepository eventRepository;

	public EventService(EventRepository eventRepository) {
		this.eventRepository = eventRepository;
	}
	
	//list to return all events found in the events table in database
	public List<Event> listAllEvents(){
		List<Event> eventList = new ArrayList<>();
		for(Event event :eventRepository.findAll()){		
			eventList.add(event);
		}
		
		return eventList;
	}
	
	
	//Call repo to delete event by ID
	public void deleteEvent(int eventId) {
		eventRepository.delete(eventId);		
	}

	//save new event into DB
	public void save(Event event) {
		eventRepository.save(event);		
	}	
	
	public Event getEvent(int eventid) {		
		return eventRepository.findOne(eventid);
	}	
	
	public boolean entityExists(int eventid){
		return eventRepository.exists(eventid);
	}

}
