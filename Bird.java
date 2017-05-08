/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author Aaron
 */
public class Bird {
  //Fields
  public int age = 1;
  public boolean alive = true;

  //Methods
  public void eat() {
    System.out.println("The bird eats");
  }

  public void breathe() {
    System.out.println("The bird breathes");
  }

  public void sleep() {
    System.out.println("The bird sleeps");
  }

  public void die() {
    this.alive = false;
  }
}
