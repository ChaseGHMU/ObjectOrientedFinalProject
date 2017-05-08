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
public class IntDuck implements NonFlyingBird {
  public int age = 2;
  public String type= "Normal";

  //Since the Duck implements the interface, it must include its methods
  @Override
  public void walk() {
    System.out.println("The duck walks like a normal bird");
  }
  @Override
  public void swim() {
    System.out.println("The duck swims, but not as well as the penguin");
  }

  //You can have more methods than just the interface ones
  public void quack() {
    System.out.println("#Quack");
  }
}
