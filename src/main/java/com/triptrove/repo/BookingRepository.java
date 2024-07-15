package com.triptrove.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triptrove.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	// Custom query method for finding all upcoming bookings by user id

	// Dynamic query method for finding all bookings by user id and tour date

	// Find bookings by user ID for finding all booking by user id
}
