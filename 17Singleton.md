# Singleton
### Topics Discussed
* How is a singleton implemented?
* Can it be made thread-safe?
* Can the singleton instance be lazily instantiated?

### Background
A singleton pattern is a restriction placed on a class such that only one object can be instantiated for it. To be thread-safe would mean that multiple threads would not be able to create more than one instance of the object. Often this is attempted through a lazily instantiated object, in which instantiation is delayed until it is absolutely needed.

---

### Java
In Java, singletons are implemented by using a private static constructor called by a static method that returns an a reference for a singleton object **if** there is not already an object of that type. Consider the following code for the typical singleton:

```java
public class PenguinSingleton {
  //Use this field to keep track of whether there is already one
  private static PenguinSingleton instance = null;

  //Have an empty constructor;
  protected PenguinSingleton() {
  }

  //Make a method for returning a singleton reference.
  public static PenguinSingleton getSingleton() {
    if(instance == null) {
      instance = new PenguinSingleton();
    }
    return instance;
  }
}
```

In this case, the PenguinSingleton is kept track of through the instance reference. If the getSingleton() method was to be used again, a new PenguinSingleton would not be returned since the value of instance would not be null.

The current structure of this singleton is NOT thread safe. If a thread were to begin in a separate execution environment before the singleton was created, it would not be told if the value of instance changed from null. It is possible to make a singleton thread safe using synchronization or by using a public final static variable to handle it.

By synchronizing the method, the singleton would be thread safe. When using synchronize on a method, when one thread is executing it, all other threads that invoke the method for the same object are suspended until it is done. This would ensure that multiple versions of the singleton would not develop:

```java
public class PenguinSingleton {
  //Use this field to keep track of whether there is already one
  private static PenguinSingleton instance = null;

  //Have an empty constructor;
  protected PenguinSingleton() {
  }

  //Make a method for returning a singleton reference.
  public synchronized static PenguinSingleton getSingleton() {
    if(instance == null) {
      instance = new PenguinSingleton();
    }
    return instance;
  }
}
```

Another way to make sure the Singleton is thread safe would be to use a public final static variable:
```java
public class PenguinSingleton {
  public final static PenguinSingleton INSTANCE = new PenguinSingleton();

  private PenguinSingleton() {
  }
}

//Initialize the object like this:
PenguinSingleton penguin = PenguinSingleton.INSTANCE;
```

The reason that this works is that the static member would only be created the first time it is accessed.

Each of these methods support *lazy instantiation*, since the singleton is not created until either the **getSingleton()** method is called or until the INSTANCE is requested. So, the object is not created until it is needed.

---

###C#
In C# singletons are implemented by using a private static constructor called by a static method that returns an a reference for a singleton object **if** there is not already an object of that type. Consider the following code for the typical singleton in C#:
```csharp
//The singleton code in C# is very similar to Java
public class PenguinSingleton
{
   private static PenguinSingleton instance;

   private PenguinSingleton() {}

   public static PenguinSingleton Instance
   {
      get
      {
         if (instance == null)
         {
            instance = new PenguinSingleton();
         }
         return instance;
      }
   }
}
```
Since nothing is formed until an object asks for the instance, this is lazy instantiation. However, this singleton, much like the first Java example, is not thread safe. Luckily C# has its own way to handle this through either static initialization or through double-check locking.

In Static Initialization, the instance is created the first time it is referenced and the class is marked as being *sealed* to prevent adding more instances of it. It is also marked *read-only*. The singleton instance is not instantiated until it is first referenced by a call to its Instance property, so it is once again considered lazy instantiation. The following code block represents the creation of a thread safe singleton through Static Initialization:
```csharp
//The Penguin class is called sealed
public sealed class PenguinSingleton
{
  //The variable will be set to read only
   private static readonly PenguinSingleton instance = new PenguinSingleton();

   private PenguinSingleton(){}

   //There will be no instance until a call is made to Instance
   public static PenguinSingleton Instance
   {
      get
      {
         return instance;
      }
   }
}
```

Another way to make a thread safe singleton in C# is to use Double-Check Locking. Double-Check Locking keeps threads from creating new instances of a singleton at the same time. A **lock** block identifies a critical area of code that only a single thread can enter when no instance has been created.

```csharp
public sealed class PenguinSingleton
{
   //A volatile variable ensures assignment is complete before it can be addressed
   private static volatile PenguinSingleton instance;
   private static object syncRoot = new Object();

   private PenguinSingleton() {}

   public static PenguinSingleton Instance
   {
      get
      {
         if (instance == null)
         {
           //Lock area only accessible to first thread
            lock (syncRoot)
            {
               if (instance == null)
                  instance = new PenguinSingleton();
            }

         return instance;
      }
   }
}
```
Like the others, this method also delays instantiation until the object is first accessed.

---
#### Code
[SingletonExample.java](SingletonExample.java)

[PenguinSingleton.java](PenguinSingleton.java)

[SingletonExample.cs](SingletonExample.cs)

#### Previous Page
[16. Implementation of Listeners and Event Handlers](16ImplementationOfListenersAndEventHandlers.md)

#### Next Page
[18. Procedural Programming](18ProceduralProgramming.md)
