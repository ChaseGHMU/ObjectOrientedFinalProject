#Multithreading
###Topics Discussed
* Threads or thread-like abilities?
* How is multitasking accomplished?

###Background
Many applications will need to be able to do more than one action at a single time. Examples of this include audio streaming and downloading or reading files. If an application cannot multitask, it will likely have a poor user experience. An app should always seem responsive, even when it is hard at work. Without the ability to multitask, buttons in GUI interfaces would seem to freeze and users would be forced to wait for functions to finish before they could continue. People enjoy pushing buttons, and they hate waiting. Many programming languages solve this problem with the use of threads or thread-like abilities. A thread is a lightweight process that with a self-contained execution environment. Both Java and C# use threads to perform multitasking.

---

###Java
In Java, each thread must associated be the class **Thread**. In order to create a thread, a class must either implement the **Runnable** interface or extend the **Thread** class. In either case, the class should provide an implementation of the **run()** method. Consider the following examples on creating threads:

The first example implements the **Runnable** functional interface
```java
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
```

The second example extends from the **Thread** class:
```java
public class PenguinThread extends Thread {
  int number = 0;

  PenguinThread(int number) {
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
```

The Thread method **start()** causes the **run()** method to occur. A thread can be suspended for an amount of type using the **sleep()** method. If a thread is interrupted, it will throw an **InterruptedException**.

Multiple threads can be run at the same time, each with different methods and goals. Consider the following example in which multiple threads are used:
```java
public class MultiThreadExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        //Set up the first thread
        Button btn = new Button();
        btn.setText("Run Penguin Runnable");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                //start thread
                (new Thread(new PenguinRunnable(1))).start();
            }
        });

        //Set up the second thread
        Button btnTwo = new Button();
        btnTwo.setText("Run Penguin Thread");
        btnTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //Start thread
                (new PenguinThread(2)).start();
            }
        });

        HBox root = new HBox();
        VBox buttons = new VBox();
        buttons.getChildren().add(btn);
        buttons.getChildren().add(btnTwo);

        root.getChildren().add(buttons);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Thread Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
```
In this application, you can press both buttons and have a threads output at the same time.

---

###C#
C# also uses threads to handle multiple interactions at a time. Each C# has a main thread that executes at runtime and ends with the Main method. For using multiple threads beyond the main, C# includes the **System.Threading** namespace. **System.Threading** includes classes for handling threads. Threads created and executed outside of the primary thread are called *worker threads*.

To create a thread in C#, you must start with an object with a method you want to run in the thread. Once you have that object, you can create a thread to reference its method. Consider the following object:
```csharp
class ThreadPenguin
{
    public void Walk()
    {
        int x = 0;
        while(x < 5000)
        {
            Console.WriteLine("The penguins waddles in the thread");
            x++;
        }
    }

    public void Swim()
    {
        int x = 0;
        while(x < 5000)
        {
            Console.WriteLine("The penguin swims like a champion through the thread");
            x++;
        }
    }
}
```

Threads can be prepared to run either method. They can also be used simultaneously:

```csharp
class Program
{
    static void Main(string[] args)
    {
        ThreadPenguin MyPenguin = new ThreadPenguin();

        Thread MyThread = new Thread(new ThreadStart(MyPenguin.Walk));
        Thread MySecondThread = new Thread(new ThreadStart(MyPenguin.Swim));

        MyThread.Start();
        MySecondThread.Start();
    }
}
```

By using **Thread** and **ThreadStart**, the methods defined in the **Penguin** object can be used simultaneously and separate from the main thread. Notice that the threads begin with a **Start()** method, similar to Java. You can also base multiple threads off of one object.

---
