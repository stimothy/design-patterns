package com.steventimothy.design.patterns.behaviors;

public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack Quack");
  }
}
