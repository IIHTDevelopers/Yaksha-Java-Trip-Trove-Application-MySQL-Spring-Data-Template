package com.triptrove.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triptrove.dto.BookingDTO;
import com.triptrove.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	@Override
	public BookingDTO bookTour(BookingDTO bookingDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<BookingDTO> getUserBookings(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public BookingDTO getBookingById(Long bookingId) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean cancelBooking(Long bookingId) {
		// write your logic here
		return null;
	}

	@Override
	public List<BookingDTO> getUpcomingBookings(Long userId) {
		// write your logic here
		return null;
	}

	@Override
	public List<BookingDTO> getPastBookings(Long userId) {
		// write your logic here
		return null;
	}
}
