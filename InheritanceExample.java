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
public class InheritanceExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This example is meant to show how the Penguin class will have both the members from Penguin and Bird
        SubPenguin myPenguin = new SubPenguin();
        
        //A Penguin only method
        myPenguin.waddle();
        
        //An inherited method
        myPenguin.breathe();
    }
    
}
