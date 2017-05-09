#Lambda Expressions, Closures, or Functions as Types
###Topics Discussed
* Lambda Expressions, Closures, or Functions as Types

###Background
Lambda expressions, closures, and functions as types are topics that related to functional programming. A closure is a term for storing a method as a variable. Java supports closure through the use of functional interfaces and lambda expressions. C# supports closure through the use of delegates and lambda expressions.

---

###Java
Java closures come in the form of lambda expressions. In Java, lambda expressions are a concise way to represent using functional interfaces with anonymous inner classes.

Anonymous classes are expressions that allow for declaring and instantiating classes all at once. An anonymous class declaration includes the **new** keyword, the name of an interface to implement or class to extend, arguments to a constructor (not needed for interface), and a class declaration. (When a class is defined within another class, it is called an "inner class" So, when a lambda expression is used within another class, it is precise representation of an anonymous "inner" class)

Consider an interface called **WalkingBird**
```java
public interface WalkingBird {
    public void walk();
}
```
An anonymous class expression would look like the following:
```java
WalkingBird penguin = new WalkingBird() {
  public void walk() {
      System.out.println("The penguin waddles");
  }
};
```
As an anonymous class, it is both defined and instantiated at the same time.

An interface with only one method is considered a **functional interface**, and can be represented by a lambda expression. Since **WalkingBird** is a functional interface, the same anonymous class could be shortened to the following lambda expression:

```java
WalkingBird penguin = () -> {
    System.out.println("The penguin waddles");
};
```

Lambda expressions allow programmers to be more concise with code and eliminate bulky writing of anonymous classes. Lambda expressions and anonymous inner classes can also be assigned to variables and can be passed as parameters to methods or returned from them.

---

###C#
In C#, lambda expressions are anonymous functions that can be used to create **delegates**. A **delegate** is a type in C# that can hold method signatures and can be passed as arguments or returned from function calls similar to the way lambda expressions and anonymous inner classes behave in Java. Delegates in C# are derived from a class in the .NET framework suitably named **Delegate**. Delegate types cannot be inherited.

Consider the following creation of a delegate:
```csharp
namespace DelegateExample
{
    //Delegate provides a signature
    delegate void Walk();

    class Program
    {
      static void Main(string[] args)
      {
          //Delegate encapsulates a method
          Walk PenguinWalk = delegate() {
              Console.WriteLine("Walking slowly");
          };

          //Method is used
          PenguinWalk();
      }
    }
}
```
When running this example, it would print "Walking slowly". A similar example could make use of a lambda expression:
```csharp
namespace LambdaExample
{
    //Delegate provides a signature
    delegate void Run();
    class Program
    {
        static void Main(string[] args)
        {
            //A lambda expression is used to create the delegate
            Run PenguinRun = () => {
                Console.WriteLine("Penguins don't run");
            };

            //Method is used
            PenguinRun();
        }
    }
}
```
This example would print "Penguins don't run". By using lambda expressions to create delegates, C# provides a similar methodology to Java's lambda expression replacement of functional interfaces.


---
