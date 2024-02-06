package com.antoniobertuccio.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Topping  extends Item{

  public Topping(String name, int calories, double price) {
    super(name, calories, price);
  }
}
