/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectionexample;

import java.lang.reflect.Method;

/**
 *
 * @author Aaron
 */
public class ReflectionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize a Bird object
        Bird bird = new Bird();
        
        //Retrieve the class of the object
        Class c = bird.getClass();
        
        //Use reflection to get methods of the Bird object
        Method[] methods = c.getMethods();
        
        //Print the methods
        for(Method method : methods) {
            System.out.println(method.getName());
        }
        
    }
}
