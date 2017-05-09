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
public class PenguinSingleton {
      public final static PenguinSingleton INSTANCE = new PenguinSingleton();
      public String name = "Larry";
      private PenguinSingleton() {
          
      }
}
