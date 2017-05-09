/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadexample;

/**
 *
 * @author Aaron
 */
public class PenguinRunnable implements Runnable {
    int number = 0;
    
    PenguinRunnable(int number) {
        this.number = number;
    }
    
    @Override
    public void run() {
        try {
            for(int i = 30; i > 0; i--) {
                System.out.println("The penguin waddles in thread" + number);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
        System.out.println("Exiting the penguin thread");
    }

}
