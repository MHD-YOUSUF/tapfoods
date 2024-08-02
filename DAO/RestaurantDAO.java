package com.tapfoods.DAO;

import java.util.ArrayList;

import com.tapfoods.model.Restaurant;

public interface RestaurantDAO {
	int addRestaurant(Restaurant r);
	ArrayList<Restaurant> getAllRestaurant();
	Restaurant getRestaurant(int restaurantid);
	int updateRestaurant(Restaurant r);
	int deleteRestaurant(int restaurantid);
}
