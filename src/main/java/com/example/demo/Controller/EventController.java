package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EventService;
import com.example.demo.eventDetails.EventDetails;
import com.example.demo.eventsModel.EventsModel;

@RestController
@RequestMapping("/eventApi")
public class EventController {
   
	@Autowired
	public EventService EventController;
	
	@PostMapping(path="/addEvent")
	//@PostMapping(path = "/addEvent", produces = MediaType.APPLICATION_JSON_VALUE)
	//@PostMapping(path = "/beneficiary/create/", produces = MediaType.APPLICATION_JSON_VALUE)
	public void  addEmployee(@RequestBody List<EventsModel> events) {
		//TODO: process POST request
		
		 EventController.saveEvent(events);
	}
	@GetMapping(path="/eventById{id}")
	  public EventDetails getById(@PathVariable int id) {
		return EventController.getEventById(id);
	}
}
