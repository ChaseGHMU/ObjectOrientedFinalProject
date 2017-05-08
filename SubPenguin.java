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
public class SubPenguin extends Bird {
    //We can then extend functionality by adding more methods
    public String type = "Emperor";

    public void waddle() {
      System.out.println("The penguin waddles");
    }

    public void swim() {
      System.out.println("The penguin swims like a champion");
    }
}
