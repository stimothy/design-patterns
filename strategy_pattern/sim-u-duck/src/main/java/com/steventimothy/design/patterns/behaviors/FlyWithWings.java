package com.steventimothy.design.patterns.behaviors;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("The Duck is flying");
  }
}
