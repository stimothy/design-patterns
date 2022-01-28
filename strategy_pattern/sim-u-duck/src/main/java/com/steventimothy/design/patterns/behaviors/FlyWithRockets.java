package com.steventimothy.design.patterns.behaviors;

public class FlyWithRockets implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("The Duck is flying with rockets");
  }
}
