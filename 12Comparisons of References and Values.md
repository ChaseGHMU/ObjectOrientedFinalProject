#Comparisons of References and Values
###Topics Discussed
* How are values compared? (i.e. comparing two strings)

###Background
In programming, logic decisions are often employed to determine how a program should run. This makes comparing objects extremely important.

###Java
In Java, there are two types of equality, reference and value. When making comparisons in Java, you should first decide the type of comparison you would like to make. Reference equality is when two references point to the same object. If two objects have the same reference, they would be considered equal under comparisons using "==". Value equality is when two objects actually have the same value. In order to check for value equality, you must use the "equals()" method. All objects have an equals() method since it belongs to the Object class that all objects inherit from.

Example of proper use of "==" using the **Bird** class
```java
Bird a = new Bird();
Bird b = new Bird();
Bird c = a;

if(a == b){
    System.out.println("Bird a and Bird b references are equal");
}
else {
    System.out.println("Bird a and Bird b references are not equal");
}

if(a == c){
    System.out.println("Bird a and Bird c references are equal");
}
else {
    System.out.println("Bird a and Bird c references are not equal");
}
```

Example of proper use of ".equals()" method using Strings
```java
public static String firstName = "Aaron";
public static String lastName = "Smith";
public static String name = "Aaron";

public static void main(String[] args) {
    if(firstName.equals(name)) {
        System.out.println("The values are equal");
    }
    else if(!firstName.equals(name)) {
        System.out.println("The values are not equal");
    }

    if(firstName.equals(lastName)) {
        System.out.println("The values are equal");
    }
    else if(!firstName.equals(lastName)) {
        System.out.println("The values are not equal");
    }
}
```
###C#
C# also has multiple ways to compare. However, they are the exact opposite as Java. In C# reference equality is compared using the **ReferenceEquals** method to determine if their object reference is the same. If **ReferenceEquals** is used on value types, it will always return false.

Value equality in C# is compared using '==' and '!='. They will check whether two objects contain the same values. These can also be used for primitive data types. When comparing, you should always type of consider what comparison you want so that you choose the correct comparison method.

Example of proper use of **ReferenceEquals**
```csharp
//Initialize objects for comparison
Bird a = new Bird();
Bird b = new Bird();
Bird c = a;

//Compare references
if(System.Object.ReferenceEquals(a,b)) {
    Console.WriteLine("Bird a and Bird b have the same reference");
}
else {
    Console.WriteLine("Bird a and Bird b have different references");
}

//Compare references
if(System.Object.ReferenceEquals(a,c)) {
    Console.WriteLine("Bird a and Bird c have the same reference");
}
else {
    Console.WriteLine("Bird a and Bird c have different references");
}
```

Example of proper use of '=='
```csharp
public static string FirstName = "Aaron";
public static string LastName = "Smith";
public static string Name = "Aaron";

static void Main(string[] args) {
    if(FirstName == Name) {
        Console.WriteLine("The values are equal");
    } else {
        Console.WriteLine("The values are not equal");
    }

    //Compare strings
    if(FirstName == LastName) {
        Console.WriteLine("The values are equal");
    }
    else {
        Console.WriteLine("The values are not equal");
    }
}
```
