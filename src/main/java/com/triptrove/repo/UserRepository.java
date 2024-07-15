package com.triptrove.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.triptrove.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	// Custom query method for finding user by username

	// Dynamic query method for finding user by email
}
