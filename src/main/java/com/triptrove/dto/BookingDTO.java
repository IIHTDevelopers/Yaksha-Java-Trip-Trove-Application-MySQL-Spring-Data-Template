package com.triptrove.dto;

import java.time.LocalDate;

public class BookingDTO {
	private Long id;

	private Long userId;

	private Long tourId;

	private LocalDate bookingDate;

	private LocalDate tourDate;

	public BookingDTO() {
		super();
	}

	public BookingDTO(Long id, Long userId, Long tourId, LocalDate bookingDate, LocalDate tourDate) {
		super();
		this.id = id;
		this.userId = userId;
		this.tourId = tourId;
		this.bookingDate = bookingDate;
		this.tourDate = tourDate;
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
