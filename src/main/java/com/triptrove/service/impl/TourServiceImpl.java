package com.triptrove.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.triptrove.dto.TourDTO;
import com.triptrove.service.TourService;

@Service
public class TourServiceImpl implements TourService {

	@Override
	public TourDTO createTour(TourDTO tourDTO) {
		// write your logic here
		return null;
	}

	@Override
	public List<TourDTO> getAllTours() {
		// write your logic here
		return null;
	}

	@Override
	public TourDTO getTourById(Long tourId) {
		// write your logic here
		return null;
	}

	@Override
	public TourDTO updateTour(Long tourId, TourDTO tourDTO) {
		// write your logic here
		return null;
	}

	@Override
	public Boolean deleteTour(Long tourId) {
		// write your logic here
		return null;
	}

	@Override
	public List<TourDTO> searchTours(String query) {
		// write your logic here
		return null;
	}

	@Override
	public List<TourDTO> filterTours(String location, String priceRange, Double rating) {
		// write your logic here
		return null;
	}
}
