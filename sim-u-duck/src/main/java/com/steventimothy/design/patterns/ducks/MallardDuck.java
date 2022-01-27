package com.steventimothy.design.patterns.ducks;

import com.steventimothy.design.patterns.behaviors.FlyWithWings;
import com.steventimothy.design.patterns.behaviors.Quack;

public class MallardDuck extends Duck {

  public MallardDuck() {
    this.flyBehavior = new FlyWithWings();
    this.quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am a Mallard Duck");
  }
}
