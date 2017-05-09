/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonexample;

/**
 *
 * @author Aaron
 */
public class SingletonExample {
    public static void main(String[] args) {
        PenguinSingleton penguin = PenguinSingleton.INSTANCE;
        System.out.println(penguin.name);
        
        PenguinSingleton anotherPenguin = PenguinSingleton.INSTANCE;
    
        if(anotherPenguin == penguin) {
            System.out.println("They are the same object");
        }
        
        //Note this is not allowed since the constructor is private:
        //PenguinSingleton newPenguin = new PenguinSingleton();
    }
}
