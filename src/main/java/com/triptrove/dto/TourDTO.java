package com.triptrove.dto;

public class TourDTO {
	private Long id;

	private String title;

	private String description;

	private String location;

	private Double price;

	private Double rating;

	public TourDTO() {
		super();
	}

	public TourDTO(Long id, String title, String description, String location, Double price, Double rating) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.location = location;
		this.price = price;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
}
