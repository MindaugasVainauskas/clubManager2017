package ie.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.manager.services.EventService;
import ie.manager.services.MemberService;

@RestController
public class AppRestController {
	
	@Autowired
	private EventService eventService;
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/event-list")
	String eventList(){
		return eventService.listAllEvents().toString();
	}
	
	@GetMapping("/member-list")
	String memberList(){
		return memberService.listAllMembers().toString();
	}

}
