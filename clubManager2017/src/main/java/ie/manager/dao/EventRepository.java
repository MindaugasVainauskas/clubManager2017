package ie.manager.dao;

import org.springframework.data.repository.CrudRepository;

import ie.manager.models.Event;

//this repository is same as member repository. CrudRepository already contains most basic methods to use
//Implementation of this interface happens in runtime.
public interface EventRepository extends CrudRepository<Event, Integer>{
	

}
