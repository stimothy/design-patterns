package com.steventimothy.design.patterns;

public abstract class Duck {

  public void quack() {
    System.out.println("Quack Quack");
  }

  public void swim() {
    System.out.println("The Duck is swimming");
  }

  public abstract void display();

  public void fly() {
    System.out.println("The Duck is flying");
  }
}
