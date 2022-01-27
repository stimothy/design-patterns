package com.steventimothy.design.patterns;

public class RubberDuck extends Duck {

  @Override
  public void quack() {
    System.out.println("Squeak Squeak");
  }

  @Override
  public void display() {
    System.out.println("I Am a Rubber Duck");
  }
}
