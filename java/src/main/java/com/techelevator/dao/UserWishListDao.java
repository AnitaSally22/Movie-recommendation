package com.techelevator.dao;

import com.techelevator.model.Movie;

import java.util.List;

public interface UserWishListDao {
    List<Movie> getUserWishList(String username);
    void addToWishList(int userId, int movieId);
    int deleteFromWishList(int movieId , int userId);
}
