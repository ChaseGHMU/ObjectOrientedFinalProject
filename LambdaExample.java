/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexample;

/**
 *
 * @author Aaron
 */
public class LambdaExample {
    
    //This method demonstrates how to construct an anonymous class.
    public void anonymousClassTest(){
        WalkingBird penguin = new WalkingBird() {
        public void walk() {
            System.out.println("The penguin waddles");
        }
        };
        penguin.walk();
    }
    
    //If 
    public void lambdaTest(){
        WalkingBird penguin = () -> {
            System.out.println("The penguin waddles");
        };
        penguin.walk();
    }
    
    public static void main(String[] args) {
        LambdaExample example = new LambdaExample();
        example.anonymousClassTest();
        example.lambdaTest();
    }

}
