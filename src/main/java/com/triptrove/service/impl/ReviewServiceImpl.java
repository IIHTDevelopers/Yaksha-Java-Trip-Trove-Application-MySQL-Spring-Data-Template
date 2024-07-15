package com.triptrove.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triptrove.dto.ReviewDTO;
import com.triptrove.service.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Override
	public ReviewDTO addReview(ReviewDTO reviewDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<ReviewDTO> getReviewsByTourId(Long tourId) {
		// write your logic here
		return null;
	}

	@Override
	public ReviewDTO updateReview(Long reviewId, ReviewDTO reviewDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean deleteReview(Long reviewId) {
		// write your logic here
		return null;
	}

	@Override
	public List<ReviewDTO> getReviewsByUserId(Long userId) {
		// write your logic here
		return null;
	}
}
