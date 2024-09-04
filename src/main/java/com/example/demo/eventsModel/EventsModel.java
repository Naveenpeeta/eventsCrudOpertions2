package com.example.demo.eventsModel;

public class EventsModel {

  private Integer id;
  private String name;
  private String eventDate;
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
