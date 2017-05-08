#Interfaces/Protocols
###Topics Discussed
* What does the language support?
* What abilities does it have?
* How is it used?

###Background
An interface (called protocol in several languages) is a means for ensuring that objects communicate with each other appropriately. Interfaces define types of interactions that an object can have. They include empty methods that specify only parameters and return type. When implementing an interface, an object must provide a definition for all of the interface methods. Interfaces are often described as "contracts" between a class and the outside world since they enforce expected behavior.

---

###Java
Java supports interfaces. Interfaces are defined by using the "interface" keyword followed by a list of empty method definitions. Interfaces are very similar to abstract classes, however, abstract classes can include defined methods while interfaces cannot. An interface must be public and its methods are automatically assumed to be abstract. Also, a class can implement multiple interfaces while they may only extend one class. Consider the following interface definition:

```java
//An interface must be public
public interface NonFlyingBird {
  void walk();
  void swim();
}
```

An interface is an abstraction that describes behaviors a class may want to have. In this case, we have an interface for birds that cannot fly. This interface might be implemented by birds like penguins or ducks. If a class implements this interface, it must provide method definitions for walking and for swimming. Consider the following examples:

Penguin Example:
```java
public class Penguin implements NonFlyingBird {
  public int age = 1;
  public String type = "Emperor";

  //Since Penguin implements the interface, it must include its methods
  public void walk() {
    System.out.println("The penguin waddles");
  }

  public void swim() {
    System.out.println("The penguin swims like a champion");
  }
}
```

Duck Example:
```java
public class Duck implements NonFlyingBird {
  public int age = 1;
  public String type= "Normal";

  //Since the Duck implements the interface, it must include its methods

  public void walk() {
    System.out.println("The duck walks like a normal bird");
  }

  public void swim() {
    System.out.println("The duck swims, but not as well as the penguin");
  }

  //You can have more methods than just the interface ones
  public void quack() {
    System.out.println("Quack");
  }
}
```

When implementing an interface, a class is promising to perform certain behaviors with expected output.

---

###C#
C# follows the same scheme for interfaces as Java does. In C# an interface only contains the signatures of a method and return type and any class or struct that implements the interface must agree to define them. One difference is that you are allowed to include property signatures in a C# interface. For an explanation on properties see _______________. Technically, property signatures are only a collection of the getter and setter methods. Thus, C# interfaces still only allow for undefined methods. Consider the following examples:

```csharp
//C# interfaces can include methods and property signatures
public interface NonFlyingBird {
    void walk();
    void swim();

    int Age {
        get;
        set;
    }
}
```

Interfaces are used by implementing them with ":"

Penguin Example:
```csharp
public class Penguin : NonFlyingBird {
    private int penguinAge = 1;
    public int Age {
        get{
            return penguinAge;
        }
        set {
            penguinAge = value;
        }
    }
    public void walk() {
        Console.WriteLine("The penguin waddles");
    }

    public void swim() {
        Console.WriteLine("The penguin swims like a champion");
    }
}
```
Duck Example:
```csharp
public class Duck : NonFlyingBird {
    private int duckAge = 2;
    public int Age {
        get{
            return duckAge;
        }
        set {
            duckAge = value;
        }
    }
    public void walk() {
        Console.WriteLine("The duck walks like a normal bird");
    }

    public void swim() {
        Console.WriteLine("The duck swims, but not as well as the penguin");
    }
}
```

----
