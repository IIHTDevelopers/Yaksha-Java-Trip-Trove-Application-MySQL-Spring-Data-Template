package com.triptrove.dto;

public class ReviewDTO {
	private Long id;

	private Long userId;

	private Long tourId;

	private String comment;

	private Double rating;

	public ReviewDTO() {
		super();
	}

	public ReviewDTO(Long id, Long userId, Long tourId, String comment, Double rating) {
		super();
		this.id = id;
		this.userId = userId;
		this.tourId = tourId;
		this.comment = comment;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getTourId() {
		return tourId;
	}

	public void setTourId(Long tourId) {
		this.tourId = tourId;
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
