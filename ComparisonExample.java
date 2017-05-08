/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparisonexample;

/**
 *
 * @author Aaron
 */
public class ComparisonExample {
    
    public static String firstName = "Aaron";
    public static String lastName = "Smith";
    public static String name = "Aaron";
    
    public static void main(String[] args) {
        //This example is to show how to make comparisons in Java
        Bird a = new Bird();
        Bird b = new Bird();
        Bird c = a;
        
        if(a == b){
            System.out.println("Bird a and Bird b references are equal");
        }
        else {
            System.out.println("Bird a and Bird b references are not equal");
        }
        
        if(a == c){
            System.out.println("Bird a and Bird c references are equal");
        }
        else {
            System.out.println("Bird a and Bird c references are not equal");
        }
        
        if(firstName.equals(name)) {
            System.out.println("The values are equal");
        }
        else if(!firstName.equals(name)) {
            System.out.println("The values are not equal");
        }
        
        if(firstName.equals(lastName)) {
            System.out.println("The values are equal");
        }
        else if(!firstName.equals(lastName)) {
            System.out.println("The values are not equal");
        }
    }
}
