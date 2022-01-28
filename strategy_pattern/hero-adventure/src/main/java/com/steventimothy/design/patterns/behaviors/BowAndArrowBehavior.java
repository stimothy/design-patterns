package com.steventimothy.design.patterns.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Shooting a bow and Arrow");
  }
}
