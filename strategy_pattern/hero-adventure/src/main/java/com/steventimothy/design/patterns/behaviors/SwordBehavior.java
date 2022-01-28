package com.steventimothy.design.patterns.behaviors;

public class SwordBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Swings a sword");
  }
}
