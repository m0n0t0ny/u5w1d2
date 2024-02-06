package com.antoniobertuccio.u5w1d2.Restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Menu {
  private List<Pizza> pizzas;
  private List<Drink> drinks;
  private List<Topping> toppings;
  private double coverCharge;
  private List<Table> tables;
}
