package com.lcwd.rating.service.services;

import com.lcwd.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {

    public Rating addRating(Rating rating);
    public List<Rating> getRatings();
    public List<Rating> getRatingByUserId(String userId);
    public List<Rating> getRatingByHotelId(String hotelId);
}
