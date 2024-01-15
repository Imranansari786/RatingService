package com.lcwd.rating.service.controller;

import com.lcwd.rating.service.entities.Rating;
import com.lcwd.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating/v1/api")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //add rating http://localhost:8083/rating/v1/api/addRating
    @PostMapping("/addRating")
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating)
    {
        Rating rating1=ratingService.addRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    //get All hotel ratings http://localhost:8083/rating/v1/api/getAllRatings
    @GetMapping("/getAllRatings")
    public ResponseEntity<List<Rating>> getAllRatings()
    {
        List<Rating> getAllRatings=ratingService.getRatings();
        return ResponseEntity.ok(getAllRatings);
    }
    //get All hotel ratings http://localhost:8083/rating/v1/api/getAllRatingsByUserId/1
    @GetMapping("/getAllRatingsByUserId/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable("userId") String userId)
    {
        List<Rating> getAllRatingsByUserId=ratingService.getRatingByUserId(userId);
        return  ResponseEntity.ok(getAllRatingsByUserId);
    }
    //get All hotel ratings http://localhost:8083/rating/v1/api/getAllRatingsByHotelId
    @GetMapping("/getAllRatingsByHotelId/{hotelId}")
    public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable("hotelId") String hotelId)
    {
        List<Rating> getAllRatingsByHotelId=ratingService.getRatingByHotelId(hotelId);
        return  ResponseEntity.ok(getAllRatingsByHotelId);
    }


}
