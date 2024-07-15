package com.triptrove.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triptrove.entity.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {
	// Custom query method for finding all tours by title or description

	// Dynamic query method for finding all tours by location and price between
	// range
}
