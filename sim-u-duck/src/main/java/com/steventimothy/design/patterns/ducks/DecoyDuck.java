package com.steventimothy.design.patterns.ducks;

import com.steventimothy.design.patterns.behaviors.FlyNoWay;
import com.steventimothy.design.patterns.behaviors.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    this.quackBehavior = new MuteQuack();
    this.flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("I am a Decoy Duck");
  }
}
