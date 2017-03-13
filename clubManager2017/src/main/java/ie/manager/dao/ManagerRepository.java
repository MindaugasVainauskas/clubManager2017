package ie.manager.dao;

import org.springframework.data.repository.CrudRepository;

import ie.manager.models.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Integer>{
	
	Manager findByName(String name);

}
