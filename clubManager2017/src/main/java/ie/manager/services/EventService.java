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
	
	public void addEvent(String eName, Date eDate, String eDesc){
		
		Event newEvent = new Event(eName, eDate, eDesc);
	}
	

}
