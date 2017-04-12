package ie.manager.controllers;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ie.manager.models.Event;
import ie.manager.models.Member;
import ie.manager.services.EventService;
import ie.manager.services.MemberService;


@Controller
public class IndexController {
	
	@Autowired
	private MemberService memberService;
	@Autowired
	private EventService eventService;
	
	@RequestMapping("/login")
	String login(){
		return "login";
	}

	@GetMapping("/")
	String index(Model model){		
		model.addAttribute("memberCount", memberService.countMembers());
		model.addAttribute("eventCount", eventService.countEvents());
		return "index";
	}	
	
	// ---------------------------- Methods for event manipulation ----------------------------------------------
	//show list of all upcoming events
	@RequestMapping("/events")
	String events(Model model){
		model.addAttribute("eventList", eventService.listAllEvents());
		return "events";
	}
	
	//show event management form
	@GetMapping("/eventMgmt")
	String eventMgmt(@ModelAttribute Event event){			
		return "eventMgmt";
	}
	
	//add new upcoming event	
	@PostMapping("/addEvent")//will look into transferring current id from event entity
	String addEvent(@ModelAttribute Event event, @RequestParam int eventid, @RequestParam String eventname, @RequestParam Date eventdate, @RequestParam String eventdesc){		
		if(!(eventService.entityExists(eventid))){			
			event = new Event(eventname, eventdate, eventdesc);
			eventService.save(event);
		}else{
			//if event exists I just need to update it
			Event ev = eventService.getEvent(eventid);				
			ev.seteventname(event.geteventname());
			ev.seteventdate(event.geteventdate());
			ev.seteventdesc(event.geteventdesc());
			eventService.save(ev);
		}
		
		return "redirect:/eventMgmt";
	}	
	
	
	//edit member's details
	@PostMapping("/editEvent")
	String editEvent(@ModelAttribute Event event, Model model, @RequestParam int eventid){			
		model.addAttribute("event", eventService.getEvent(eventid));				
		return "eventMgmt";
	}
	//delete event from the list
	@PostMapping("/deleteEvent")
	String deleteEvent(@RequestParam int eventid){		
		eventService.deleteEvent(eventid);		
		return "redirect:/events";//redirect refreshes page
	}
	
	// ------------------ Member methods --------------------------------------------------------
	//show list of all members
	@RequestMapping("/members")
	String listMembers(Model model){
		model.addAttribute("memberList", memberService.listAllMembers());
		return "members";
	}
	
	//show member management form
	@GetMapping("/memberMgmt")
	String memberMgmt(@ModelAttribute Member member){			
		return "memberManagement";
	}
	
	//edit member's details
	@PostMapping("/editMember")
	String editMember(@ModelAttribute Member member, Model model, @RequestParam String sId){			
		model.addAttribute("member", memberService.getMember(sId));				
		return "memberManagement";
	}
	
	//add new member. 
	@PostMapping("/addMember")
	String addMember(@ModelAttribute Member member, @RequestParam String studentid, @RequestParam String name, @RequestParam String surname, @RequestParam String phone, @RequestParam String email){
		member = new Member(studentid, name, surname, phone, email);
		memberService.save(member);
		return "redirect:/memberMgmt";
	}
	
	//delete member from the list
	@PostMapping("/deleteMember")
	String deleteMember(@RequestParam String sId){		
		memberService.delete(sId);		
		return "redirect:/members";//redirect refreshes page
	}
	
	// ---------------------------- Logout method -------------------------------------
	//logs user out of the application
	@GetMapping("/logout")
	String logout(HttpServletRequest request, HttpServletResponse response){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		
		if(authentication != null){
			new SecurityContextLogoutHandler().logout(request, response, authentication);
		}
		
		return "redirect:/login";
	}
}
