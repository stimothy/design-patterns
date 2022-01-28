package com.steventimothy.design.patterns.ducks;

import com.steventimothy.design.patterns.behaviors.FlyWithWings;
import com.steventimothy.design.patterns.behaviors.Quack;

public class RedheadDuck extends Duck {

  public RedheadDuck() {
    this.flyBehavior = new FlyWithWings();
    this.quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I am a Redhead Duck");
  }
}
