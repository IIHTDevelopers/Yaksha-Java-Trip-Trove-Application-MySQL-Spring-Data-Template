package com.triptrove.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triptrove.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	// Custom query method for finding all reviews by tour id

	// Dynamic query method for finding all review by user id
}
