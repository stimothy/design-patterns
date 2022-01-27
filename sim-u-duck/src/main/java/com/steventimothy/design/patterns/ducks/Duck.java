package com.steventimothy.design.patterns.ducks;

import com.steventimothy.design.patterns.behaviors.FlyBehavior;
import com.steventimothy.design.patterns.behaviors.QuackBehavior;

public abstract class Duck {

  protected FlyBehavior flyBehavior;
  protected QuackBehavior quackBehavior;

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("The Duck is swimming");
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }
}
