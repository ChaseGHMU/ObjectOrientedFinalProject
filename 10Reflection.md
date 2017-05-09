#Reflection
###Topics Discussed
* What reflection abilities are supported?
* How is reflection used?

###Background

Reflection refers to the ability of a language to examine and manipulate its own parts at runtime. Reflection can be used to monitor code and make modifications if necessary. Reflection can inspect classes, interfaces, fields, and methods and can instantiate new objects, invoke methods, and manipulate field values.

###Java
Java boasts many reflective abilities through the Java Reflection API. The Java Reflection API is made up of objects that represent parts of a class and abilities for extracting those objects. The most important pieces of the Java Reflection API is the special class named **Class** and the **java.lang.reflect** package. All class loaders in Java return an object of type Class that keeps track of meta information to describe them. There are many methods within **Class** that can be used to study an object. Some of the more important ones include forName, getName, getConstructor, getMethod, getField, getSuperclass, getInterfaces, etc. Anything you may want to know about a class is most likely part of the Reflection API.

To use reflection in Java you must first get the class of the object you want to study. Then, you can call any of the reflective methods on it. As an example, consider the **Bird** object from the previous section:

```java
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

Using reflection, we could print out all of the methods that Bird holds (including any inherited from the superclass Object).

```java
public class ReflectionExample {

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
```

The output would return all of the **Bird** methods and methods retrieved from the superclass **Object** that all objects inherit from. This could be done for any of the other methods. You could also modify your program to invoke methods or create new instances of an object if you obtain information from reflection that you would like to trigger.

###C#
Similar to Java, C# provides classes to handle reflection capabilities. C# makes use of its **System.Reflection** and **System.Type** namespaces to obtain information about assemblies, classes, interfaces, and value types at run time. The highlighted classes of C# reflection include Assembly, Module, ConstructorInfo, MethodInfo, FieldInfo, EventInfo, PropertyInfo, ParameterInfo, and CustomAttributeData. Each includes a variety of methods that can be used to discover different information about the framework of an application. Also just like Java, C# can create instances and invoke instance methods using reflection. The class Emit has methods that enable the building of types at runtime.

It is worth noting that when using reflection in C#, you are never actually working directly with classes. When you reqeust information the CLR returns a **RunTime** type, which inherits from **Type**.

Consider an example, similar to the one above, where we use reflection to get the method names of the **Bird** class.
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

To retrieve the methods, we would use reflection to get a Type and then request its methods. Then, we would be able to print all of the methods. Consider this program class in the same namespace as Bird:

```csharp
class Program
{
    static void Main(string[] args)
    {
        //Get the Type for Bird
        Type MyType = typeof(Bird);

        //Request the methods
        MethodInfo[] m = MyType.GetMethods();

        //Print out each method
        foreach (MethodInfo method in m)
        {
            Console.WriteLine(method.Name);
        }
    }
}
```

This would successfully print out all of the Bird methods and any inherited methods by using reflection.
