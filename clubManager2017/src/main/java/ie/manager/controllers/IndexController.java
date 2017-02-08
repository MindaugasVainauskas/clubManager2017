package ie.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.manager.services.EventService;
import ie.manager.services.MemberService;


@RestController
public class IndexController {
	
	@Autowired
	private MemberService memberService;
	@Autowired
	private EventService eventService;

	@GetMapping("/")
	String index(){
		return "index";
	}
	
	@GetMapping("/member-list")
	String memberList(){
		return memberService.listAllMembers().toString();
	}
	
	@GetMapping("/event-list")
	String eventList(){
		return eventService.listAllEvents().toString();
	}

}
