package ie.manager.services;

import ie.manager.dao.ManagerRepository;

public class LoginService {
	private final ManagerRepository managerRepo;
	
	public LoginService(ManagerRepository managerRepo){
		this.managerRepo = managerRepo;
	}

}
