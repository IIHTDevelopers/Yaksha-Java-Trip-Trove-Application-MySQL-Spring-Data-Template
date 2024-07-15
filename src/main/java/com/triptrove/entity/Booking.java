package com.triptrove.entity;

import java.time.LocalDate;

public class Booking {
	private Long id;

	private User user;

	private Tour tour;

	private LocalDate bookingDate;

	private LocalDate tourDate;

	public Booking() {
		super();
	}

	public Booking(Long id, User user, Tour tour, LocalDate bookingDate, LocalDate tourDate) {
		super();
		this.id = id;
		this.user = user;
		this.tour = tour;
		this.bookingDate = bookingDate;
		this.tourDate = tourDate;
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

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDate getTourDate() {
		return tourDate;
	}

	public void setTourDate(LocalDate tourDate) {
		this.tourDate = tourDate;
	}
}
