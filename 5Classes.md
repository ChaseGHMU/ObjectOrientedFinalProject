# Classes
### Topics Discussed
* Defining
* Creating new instances
* Constructing/initializing
* Destructing/de-initializing

### Background

Classes are the bread and butter of object oriented programming. Classes are templates for creating these objects, which are collections of related state and behavior. Classes provide a description of state through member variables and description of behavior through methods. Classes are often considered to be "blueprints" that are instantiated into objects which perform tasks in code.

---
### Java
#### Defining
A class is made up of member variables called *fields* and methods that interact with other code. A class may or may not contain a "main" method. There are several different types of fields including local variables, instance variables, and class variables. Instance variables are fields that are defined inside of methods or constructors. They are initialized and destroyed within those methods. Instance variables are fields within the class but outside of methods. Class variables are fields within the class, outside of methods, and with the "static" keywords.

Classes also have modifiers that can limit outside access. In Java, these modifiers are public, protected, private, and default. Public means access from anywhere. Protected indicates access limited to the class or subclasses. Private means that only the current class can make use of it. Default limits access to the package.

The following is an example of a class definition in Java centered around a penguin object.
```java
//This code defines a class called Penguin
public class Penguin {
  public int age = 1;
  public String gender = "Male";
  public String type = "Emperor";

  public void growUp(){
    age += 1;
  }

  public void waddle() {
    System.out.println("The penguin waddles");
  }
}
```
##### Creating new instances
A new instance of a class can be created using the "new" keyword. A variable name is provided and then "new" calls the class constructor to initialize a new object as an instance of the class.
```java
//To initialize an object, we make an instance of a class.
Penguin myPenguinPablo = new Penguin();
```

##### Constructing/initializing
When the "new" keyword is used, a call is made to the constructor for the class. The constructor is a method that is purposed for the initialization of the instance fields of that class. A class can have multiple constructors and the one called will be dependent upon the parameters given when calling "new".

```java
public class Penguin {
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
}
```

A constructor will be called depending on the parameters given when instantiating an object.
```java
Penguin myPenguinPeach = new Penguin(3,"Female","Galapagos");
```

##### Destructing/de-initializing
In Java, all garbage collection is done for you. There is no destructing objects manually. When the Java garbage collector determines the object is done being used, it destroys the object and frees that memory. This happens when there is no longer a reference to the object.

---
### C# (almost identical)

##### Defining
A class is made up of member variables called *fields* and methods that interact with other code. A class may or may not contain a "main" method. There are several different types of fields including local variables, instance variables, and class variables. Instance variables are fields that are defined inside of methods or constructors. They are initialized and destroyed within those methods. Instance variables are fields within the class but outside of methods. Class variables are fields within the class, outside of methods, and with the "static" keywords.

Classes also have modifiers that can limit outside access. In C#, these modifiers are public, protected, private, internal, and protected internal. Public means access from anywhere. Protected indicates access limited to the class or subclasses. Private means that only the current class can make use of it. Internal means that only the same assembly can use it and protected internal means only the current assembly or types derived from the class can use it.

The following is an example of a class definition in C# centered around a penguin object.
```csharp
//This code defines a class called Penguin
public class Penguin {
  public int Age = 1;
  public string Gender = "Male";
  public string Type = "Emperor";

  public void GrowUp(){
    age += 1;
  }

  public void Waddle() {
    Console.WriteLine("The penguin waddles");
  }
}
```
##### Creating new instances
A new instance of a class can be created using the "new" keyword. A variable name is provided and then "new" calls the class constructor to initialize a new object as an instance of the class.
```csharp
//To initialize an object, we make an instance of a class.
Penguin MyPenguinPablo = new Penguin();
```
##### Constructing/initializing
When the "new" keyword is used, a call is made to the constructor for the class. The constructor is a method that is purposed for the initialization of the instance fields of that class. A class can have multiple constructors and the one called will be dependent upon the parameters given when calling "new".

```csharp
public class Penguin {
  public bool IsInitialized;
  public int Age = 1;
  public string Gender = "Male";
  public string Type = "Emperor";

  //C# can also use the "this" keyword
  public Penguin(int age, string gender, string type) {
    isInitialized = true;
    this.Age = age;
    this.Gender = gender;
    this.Type = type;
  }

  public void GrowUp(){
    Age += 1;
  }

  public void Waddle() {
    Console.WriteLine("The penguin waddles");
  }
}
```

A constructor will be called depending on the parameters given when instantiating an object.
```csharp
Penguin MyPenguinPeach = new Penguin(3,"Female","Galapagos");
```

##### Destructing/de-initializing
Similar to Java, in C# all garbage collection is done for you. There is no destructing objects manually. When the Java garbage collector determines the object is done being used, it destroys the object and frees that memory. This happens when there is no longer a reference to the object.

---
#### Code
[Penguin.java](Penguin.java)

[CSharpClassExample.cs](CSharpClassExample.cs)

#### Previous Page

[4. Types](4Types.md)

#### Next Page

[6. Instance Reference Name](6InstanceReferenceName.md)

