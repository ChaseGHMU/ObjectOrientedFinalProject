#Properties
###Topics Discussed
* Getters and setters...write your own or built in?
* Backing variables?
* Computed properties?

###Background
A property is a special class member type that is similar to a field, but must be handled through special functions called "getters" and "setters." Practically, a property is a private field that may be updated and read through method calls. This helps protect data integrity and validation, makes it easy to update data, and allows for read-only fields.

Properties usually make use of backing variables, which is the a special name given to the private field which can be retrieved by getter or modified by some other computing accessor.

Properties also make use of computed properties. Computed properties do not store values, but instead provide the getter and setter used to retrieve or set information about a property's backing variable.

---

###Java
Congratulations, you have made it to the part of our tale where C# and Java are different. Unlike C#, Java does not innately support properties through built in getters and setters. You can, however, create your own. You can include a private field in a class that can be retrieved and modified through your own public get and set methods. In Java, a self created property would look something like the following:

```java
public class Penguin {
  //age is the property variable
  private int age = 1;

  //getter
  public int getAge() {
    return age;
  }

  //setter
  public void setAge(int newAge) {
    age = newAge;
  }
}
```

Java also provides a Properties class that can manage key/value pairs. Each key and value is a String and can be retrieved using a getProperty() or set using a setProperty() method. It's weird.

---

###C#
C# has full support of properties with getter and setters built in. A get accessor can be used to return property values, and a set accessor can be used to assign new values. A "value" keyword is also used to define the value being given in the set accessor. You can modify the get and set accessors if you want to implement a computed property, or you can let C# auto-implement the get and set definitions.

```csharp
public class Penguin {
  //backing variable
  private int age  = 1;

  //property
  public int Age {
    get {
      return age;
    }
    set {
      age = value;
    }
  }
}
```

Alternatively, you might make use of a computed property:
```csharp
public class Penguin {
  //backing variable
  private int age  = 1;

  //computed property
  public int AgeNextYear {
    get {
      return age + 1;
    }
    set {
      age = value + 1;
    }
  }
}
```

First introduce in C# 7, you can also use auto-implemented properties. If there is no additional logic other than getting or setting a value you can have the C# compiler provide the backing field for you.
```csharp
public class Penguin {
  //Auto implemented property
  public int Age
  {get; set;}
}
```
