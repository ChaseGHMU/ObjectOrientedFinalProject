/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penguin;

/**
 *
 * @author Aaron
 */
public class Penguin {

    /**
     * @param args the command line arguments
     */
    public int age = 1;
    public String gender = "Male";
    public String type = "Emperor";

    public Penguin(int age, String gender, String type) {
      this.age = age;
      this.gender = gender;
      this.type = type;
    }

    public void growUp(){
      age += 1;
    }

    public void waddle() {
      System.out.println("The penguin waddles");
    }
  
    public static void main(String[] args) {
                    //Make an instance of the Penguin class as an object
            Penguin myPenguinPablo = new Penguin(1,"Male","Royal");
            System.out.println("The penguin is " + myPenguinPablo.age + " years old");
            myPenguinPablo.growUp();
            System.out.println("A year from now, the penguin will be " + myPenguinPablo.age);

            //Have the penguin waddle
            myPenguinPablo.waddle();
    }
    
}
