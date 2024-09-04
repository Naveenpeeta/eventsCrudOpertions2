package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.eventDetails.EventDetails;
import com.example.demo.eventRepository.EventRepository;
import com.example.demo.eventsModel.EventsModel;

@Service
public class EventService {
      @Autowired
      private EventRepository EventjpaRepository;
      
      public  void saveEvent(List<EventsModel> events) { 
    	  List<EventDetails> eventDetailss = new ArrayList<>();
    	  events.stream().forEach(event->{
    		  EventDetails eventss = new EventDetails();
    		  eventss.setName(event.getName());
    		  eventss.setEventDate(event.getEventDate());
    		  eventss.setEventCost(event.getEventCost());
    		  
    		  eventDetailss.add(eventss);
    	  });
    	  EventjpaRepository.saveAll(eventDetailss);
      }
      
      public  EventDetails getEventById(int id) {
    	  return EventjpaRepository.findById(id).orElse(null);
      }
      public EventDetails getEventByName(String name) {
    	  return (EventDetails) EventjpaRepository.findByName(name);
      }
}
