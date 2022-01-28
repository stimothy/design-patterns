package com.steventimothy.design.patterns.ducks;

import com.steventimothy.design.patterns.behaviors.FlyNoWay;
import com.steventimothy.design.patterns.behaviors.Squeak;

public class RubberDuck extends Duck {

  public RubberDuck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Squeak();
  }

  @Override
  public void display() {
    System.out.println("I Am a Rubber Duck");
  }
}
