package ie.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ie.manager.services.EventService;
import ie.manager.services.MemberService;


@Controller
public class IndexController {
	
	@Autowired
	private MemberService memberService;
	@Autowired
	private EventService eventService;

	@GetMapping("/")
	String index(){
		return "index";
	}	
	
	@RequestMapping("/events")
	String events(Model model){
		model.addAttribute("eventList", eventService.listAllEvents());
		return "events";
	}
	
	@RequestMapping("/members")
	String listMembers(Model model){
		model.addAttribute("memberList", memberService.listAllMembers());
		return "members";
	}
	
	@GetMapping("/listEvents")
	String eventList(){
		return eventService.listAllEvents().toString();
	}

}
