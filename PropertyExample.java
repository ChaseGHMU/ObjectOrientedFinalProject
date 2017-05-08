/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertyexample;

/**
 *
 * @author Aaron
 */
public class PropertyExample {

    private int propertyValue = 10;
    
    public int getPropertyValue() {
        return propertyValue;
    }
    
    public void setPropertyValue(int value) {
        propertyValue = value;
    }
    
    public static void main(String[] args) {
        //Initialize the object
       PropertyExample example = new PropertyExample();
       
       //Print the value using the get method
       System.out.println(example.getPropertyValue());
       
       //Use the set method to change the property value
       example.setPropertyValue(62);
       
       //Print the value using the get method
       System.out.println(example.getPropertyValue());
    }
}
