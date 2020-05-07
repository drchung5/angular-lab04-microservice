package com.service.restaurantservice.data.repos;

import com.service.restaurantservice.data.Restaurant;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepository
    extends CrudRepository<Restaurant, Long> {
}
