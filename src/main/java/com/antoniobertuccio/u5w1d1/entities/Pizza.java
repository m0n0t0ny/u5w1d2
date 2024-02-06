package com.antoniobertuccio.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pizza extends Item{

  public List<String> toppings;

  public Pizza(String name, int calories, double price, List<String> toppings) {
    super(name, calories, price);
    this.toppings = toppings;
  }
}
