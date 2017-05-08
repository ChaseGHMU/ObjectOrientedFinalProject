/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexample;

/**
 *
 * @author Aaron
 */
public class IntPenguin implements NonFlyingBird {
  public int age = 1;
  public String type = "Emperor";

  //Since Penguin implements the interface, it must include its methods
  @Override
  public void walk() {
    System.out.println("The penguin waddles");
  }
  @Override
  public void swim() {
    System.out.println("The penguin swims like a champion");
  }
}
