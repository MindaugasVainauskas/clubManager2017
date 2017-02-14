package ie.manager.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ie.manager.models.Member;
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
	
	//show list of all upcoming events
	@RequestMapping("/events")
	String events(Model model){
		model.addAttribute("eventList", eventService.listAllEvents());
		return "events";
	}
	
	//show list of all members
	@RequestMapping("/members")
	String listMembers(Model model){
		model.addAttribute("memberList", memberService.listAllMembers());
		return "members";
	}
	
	//show list of all members
	@RequestMapping("/memberMgmt")
	String memberMgmt(){		
		return "memberManagement";
	}
	
	//add new member. 
	@PostMapping("/addMember")
	String addMember(@RequestParam String sId, @RequestParam String name, @RequestParam String surname, @RequestParam String phone, @RequestParam String email){
		Member member = new Member(sId, name, surname, phone, email);
		memberService.save(member);
		return "memberManagement";
	}
	
	//delete member from the list
	@PostMapping("/deleteMember")
	String deleteMember(@RequestParam String sId){		
		memberService.delete(sId);		
		return "redirect:/members";//redirect refreshes page
	}
}
