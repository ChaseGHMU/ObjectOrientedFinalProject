# Inheritance/Extension
### Topics Discussed
* Object Oriented Inheritance

### Background
Inheritance is an object oriented paradigm that involves allowing classes to *inherit* states and/or behavior from other classes. If a new class requires all of the members of a previously established one, it could inherit them. Inheritance helps with code reuse by allowing programmers to extend and modify behaviors that already exist without having to rewrite the entire behaviors.

 Any class that inherits from another is considered a subclass and the class it inherits from is called a superclass or parent. When a class inherits from another class it gains all of the members of the base class except for any constructors. The subclass can then extend its functionality by adding more members.

---

### Java
In Java, inheritance is simple to achieve. A subclass can be formed using the **extends** keyword. When a class extends, it inherits from a superclass. Each class can only extend from one other class. Consider the following example:

First, we create a superclass called **Bird**
```java
//The Bird class includes methods that all birds may have
public class Bird {
  //Fields
  public int age = 1;
  public boolean alive = true;

  //Methods
  public void eat() {
    System.out.println("The bird eats");
  }

  public void breathe() {
    System.out.println("The bird breathes");
  }

  public void sleep() {
    System.out.println("The bird sleeps");
  }

  public void die() {
    this.alive = false;
  }
}
```

Now consider we want to make a class called **Penguin**. We know that penguins eat, breathe, sleep, and die. However, we do not want to have to go through the trouble of writing these methods again. We also don't want to add Penguin style methods to the Bird class. Not all birds swim or waddle. So, we use **extends** to inherit the bird members into the **Penguin** subclass.

```java
//The Penguin will inherit all of the members of Bird
public class Penguin extends Bird {
    //We can then extend functionality by adding more methods
    public String type = "Emperor";

    public void waddle() {
      System.out.println("The penguin waddles");
    }

    public void swim() {
      System.out.println("The penguin swims like a champion");
    }
}
```
At this point, any instances of the **Penguin** class will have access to members from both **Penguin** and **Bird**.

---
### C#
In C#, a subclass can be formed using the symbol **:** . Just like Java, when a class uses **:** it inherits all of the members from a superclass. Also just like Java, C# does not support multiple inheritance. You may only inherit from one superclass. Consider the same example from above coded in C#:

First, we create the same superclass called **Bird**
```csharp
public class Bird {
     //Fields
     public int Age = 1;
     public bool Alive = true;

     //Methods
     public void Eat() {
         Console.WriteLine("The bird eats");
     }

     public void Breathe() {
         Console.WriteLine("The bird breathes");
     }

     public void Sleep() {
         Console.WriteLine("The bird sleeps");
     }

     public void Die() {
         this.Alive = false;
     }
}
```

Now we make the subclass **Penguin**

```csharp
//Make the Penguin class inherit from Bird
public class Penguin : Bird {
    //Define special Penguin members
    public string Type = "Emperor";

    public void Waddle() {
        Console.WriteLine("The penguin waddles");
    }

    public void Swim() {
        Console.WriteLine("The penguin swims like a champion");
    }
}
```

At this point, any instances of the **Penguin** class will have access to members from both **Penguin** and **Bird**.

---
#### Code
[InheritanceExample.java](InheritanceExample.java)

[NonFlyingBird.java](NonFlyingBird.java)

[Bird.java](Bird.java)

[SubPenguin.java](SubPenguin.java)

[InheritanceExample.cs](InheritanceExample.cs)

#### Previous Page
[8. Interfaces and Protocols](8InterfacesAndProtocols.md)

#### Next Page
[10. Reflection](10Reflection.md)
