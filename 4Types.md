# Types
### Topics Discussed
* What types does the language support?
* Are both reference and value types supported?
* Can new value types be created?

### Background

In programming, data types are a classification tool that tell compilers how to interpret data used in code. Types define the values a variable may take and the operations that it can be used for. Two of the main families of data types are the primitive value data types and reference data types. Primitive data types *(types like int, char, long)* are predefined. When a primitive value type is used by a function, the value is copied. Reference types can be created using constructors and are used to reference variables stored in memory. When reference types are used in functions, the address is used. A consequence is that when using reference types,  you can change the original type and not just a copy of it.

 Some languages like C let programmers create their own types.

------

### Java
Java supports both primitive and reference types.

##### Primitive Types
Java supports 8 primitive data types including byte, short, int, long, float, double, boolean, and char.

###### byte
* 8 bit signed two's complement integer.
* Values: -128 < x < 127

###### short
 - 16 bit signed two's complement integer.
 * Values: -32,768 < x < 32,767

###### long
 - 64 bit signed two's complement.
 - Values: -2^63 < x < 2^63 - 1

###### int
- 32 bit signed two's complement.
- Values: -2,147,483,648 < x < 2,147,483,647.

###### float
- Single precision 32-bit  IEEE 754 floating point.
- Values: -3.4E+38 < x < 3.4E+38

###### double
 - double precision 64-bit IEEE
 - Values: 4.9E-324 < x < 1.8E+308

###### boolean
- One bit of information
- Values: true or false

###### char
- Single 16-bit Unicode character
- Values: All Unicode characters

###### Code Example
```java
byte  a = 10;
short b = 10;
long  c = 10L;
int   d = 10;
float e = 10f;
double  f = 10.10;
boolean g = true;
char    h = 'H';
```

##### Reference Types
In Java, reference variables can be created by using class constructors to instantiate objects. When an object is instantiated, a variable receives a reference to it. From that point forward, the object can be passed by reference as it is used.

```java
class Example{
  public static void main(String[] args){
    //Instantiate an object as a reference data type
    Dog dog = new Dog();
  }
}
```
##### Can you create your own types?
At this moment, Java does not support the ability to create your own value types. You can make your own classes and construct them to be close to a value type, but it would still be a reference type.

---
### C#
C# supports both primitive and reference types.

##### Primitive Types
C# supports all of the same data types that are available for Java and then provides support for unsigned numbers. All primitive data types in C# are actually objects in the "System" namespace such that they have

###### byte (System.Byte)
* 8 bit unsigned integer.
* Values: 0 < x < 255

###### sbyte (System.SByte)
* 8 bit signed integer.
* Values: -128 < x < 127

###### int (System.Int32)
- 32 bit signed integer.
- Values: -2,147,483,648 < x < 2,147,483,647

###### uint (System.UInt32)
- 32 bit unsigned integer.
- Values: 0 < x < 4,294,967,295

###### short (System.Int16)
- 16 bit signed integer.
* Values: -32,768 < x < 32,767

###### ushort (System.UInt16)
- 16 bit unsigned integer.
* Values: 0 < x < 65,535

###### long (System.Int64)
- 64 bit signed integer.
- Values: -2^63 < x < 2^63 - 1

###### ulong (System.UInt64)
- 64 bit unsigned integer.
- Values: 0 < x < 18,446,744,073,709,551,615

###### float (System.Single)
- Single precision 32-bit floating point.
- Values: -3.4E+38 < x < 3.4E+38

###### double (System.Double)
 - double precision 64-bit floating point.
 - Values: -1.79E+308 < x < 1.79E+308

###### bool (System.Boolean)
- Information for logic with 8 bit width
- Values: true or false

###### char (System.Char)
- Single 16-bit Unicode character
- Values: All Unicode characters

##### Code Example
```csharp
byte    a = 10;
short   b = -10;
long    c = -10L;
int     d = -10;
float   e = 10f;
double  f = 10.10;
bool    g = true;
char    h = 'H';
sbyte   i = -10;
ushort  j = 10;
ulong   k = 10;
uint    l = 10;
```
##### Reference Types
Reference types in C# include classes, interfaces, delegates, and arrays. Similar to Java, in C# an object reference is returned when an instance of a class is created.

```csharp
namespace Example
{
    class Program
    {
        static void Main(string[] args)
        {
            //Instantiate an object as a reference data type
            Dog dog = new Dog();
        }
    }
}
```

In C#, a delegate is also a reference type. Delegates hold a reference to a method with a particular parameter list and return type and they can be used to pass methods as arguments. To declare a delegate, you must describe the number and types of arguments and the type of the return to encapsulate.

```csharp
public delegate void ExampleDelegate(Object thing);
```

By using a method called boxing, any value type can be converted into a reference type. Boxing a variable wraps the value inside a System.Object and stores it on the managed heap. The value can then be extracted by unboxing.

```csharp
int a = 1; //this integer is not boxed
object box = a; //this is a boxed integer
a = (int)box;   //unboxed
```
##### Can you create your own types?
Yes, C# does allow for the creation of types. However, there are many restrictions for it. When making a value type, users create a class that is not passed by reference. Users must extend from System.ValueType and declare their class final. Value types types can't be abstract, and members cannot be declared *protected*. Instantiation would look the same as for objects, but the value type is allocated on the stack and not the managed heap.

C# also allows for the creation of struct types, which lets users create their own desired encapsulation of variables.

---
#### Previous Page

[3. Name Spaces](3NameSpaces.md)

#### Next Page

[5. Classes](5Classes.md)
