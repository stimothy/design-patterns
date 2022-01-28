package com.steventimothy.design.patterns.characters;

import com.steventimothy.design.patterns.behaviors.WeaponBehavior;

public abstract class Character {

  protected WeaponBehavior weaponBehavior;

  public void fight() {
    this.weaponBehavior.useWeapon();
  }

  public void setWeapon(WeaponBehavior weaponBehavior) {
    this.weaponBehavior = weaponBehavior;
  }
}
