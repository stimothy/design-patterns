package com.steventimothy.design.patterns.behaviors;

public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak Squeak");
  }
}
