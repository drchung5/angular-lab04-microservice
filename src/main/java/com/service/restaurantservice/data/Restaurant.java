package com.service.restaurantservice.data;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Restaurant {

  protected Restaurant(){}

  public Restaurant(
      @NotNull String name,
      @NotNull String cuisine,
      @NotNull String description) {
    this.name = name;
    this.cuisine = cuisine;
    this.description = description;
  }

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long restaurant_id;

  @NotNull
  private String name;

  @NotNull
  private String cuisine;

  @NotNull
  private String description;



}