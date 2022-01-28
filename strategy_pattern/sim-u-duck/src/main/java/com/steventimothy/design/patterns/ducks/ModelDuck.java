package com.steventimothy.design.patterns.ducks;

import com.steventimothy.design.patterns.behaviors.FlyNoWay;
import com.steventimothy.design.patterns.behaviors.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    this.flyBehavior = new FlyNoWay();
    this.quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a model duck");
  }
}
