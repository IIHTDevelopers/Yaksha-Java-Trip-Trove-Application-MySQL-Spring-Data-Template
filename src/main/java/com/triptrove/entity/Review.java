package com.triptrove.entity;

public class Review {
	private Long id;

	private User user;

	private Tour tour;

	private String comment;

	private Double rating;

	public Review() {
		super();
	}

	public Review(Long id, User user, Tour tour, String comment, Double rating) {
		super();
		this.id = id;
		this.user = user;
		this.tour = tour;
		this.comment = comment;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}
}
