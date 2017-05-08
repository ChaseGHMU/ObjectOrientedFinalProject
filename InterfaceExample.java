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

public class InterfaceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            IntPenguin MyPenguin = new IntPenguin();

            IntDuck MyDuck = new IntDuck();

            System.out.println("Check first method:");
            MyPenguin.swim();
            MyDuck.swim();

            System.out.println("Check second method:");
            MyPenguin.walk();
            MyDuck.walk();

            System.out.println("The penguin is " + MyPenguin.age + " years old");
            System.out.println("The duck is " + MyDuck.age + " years old");
    }
}