package com.example.demo.eventRepository;

//import java.util.List;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.eventDetails.EventDetails;

public interface  EventRepository extends JpaRepository<EventDetails, Integer> {

	EventRepository findByName(String name);

	//void saveAll(List<EventDetails> events);

}