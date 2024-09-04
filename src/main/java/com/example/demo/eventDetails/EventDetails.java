package com.example.demo.eventDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="eventDetails")
public class EventDetails {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	  @Column(name = "name")
    private String name;
	  @Column(name = "eventDate")
    private String eventDate;
	  @Column(name = "eventCost")
	    private Integer eventCost;
	  
	
	  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public Integer getEventCost() {
		return eventCost;
	}
	public void setEventCost(Integer eventCost) {
		this.eventCost = eventCost;
	}
	  
}
