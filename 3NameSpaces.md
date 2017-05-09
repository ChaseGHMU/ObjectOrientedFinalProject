# Name Spaces
### Topics Discussed
* How are name spaces implemented?
* How are name spaces used?
### Background
In programming, namespaces are areas of code that have the same scope of identifiers. Namespaces are used to organize code by separating groups of types, functions, variables, and other code elements. They also prevent name collisions by making sure there is only one declaration of a name for a given element.

------
### Java
Name spaces in Java are handled through the use of packages. A package provides access protection and name management for a group of classes and interfaces.

**Implementing a package**

To create a package, you must put the statement *package* with the name of the package at the top of every file that contains the types you want to include. For example, assume you wish to create a package with the name "decisions." You would need to include *package decisions;* at the top of each source file.

```java
//In the Regrettable.java file
package decisions;
public interface Regrettable {
  ...
}

//In the Action.java file
package decisions;
public abstract class Choice {
  ...
}

//In the Choice.java file
package decisions;
public class Action extends Choice implements Regrettable {
  ...
}
```

All of the types contained in a package are called package members.

**Using Package Members**

Members from the same package can use each other freely. However, if you want to use a  public member from outside of the package you must either refer to the member by its full qualified name, import the member, or import the member's entire package.

A qualified name consists of the member's simple name and the package name. The qualified name for *Action* is *decisions.Action*
```java
//The following is a valid use of Action using its qualified name
decisions.Action myAction = new decisions.Action();
```

Using qualified names is not recommended since it is tedious and can make code difficult to read. As an alternative, it is recommended to either import the specific member or import the member's entire package.

```java
//Import specific member decisions.Action
import decisions.Action;
Action myAction = new Action();
```
or
```java
//Import entire decisions package
import decisions.*;
Action myAction = new Action();
```
------
### C#
Name spaces in C# are handled through the use of literal "namespaces." Namespaces are used in the .NET framework to organize classes and control the scope of a class and method names.

**Implementing a namespace**

In C#, you may implement a namespace by using the *namespace* keyword to declare scope.

```csharp
namespace Decisions
{
  class Choice {
    ...
  }

  class Action {
    ...
  }
}
```

You may also have nested name spaces to further help organize your code.

```csharp
namespace Decisions {
  class Choice {
    ...
  }

  class Action {
    ...
  }

  namespace GoodDecisions {
    class Choice {
      ...
    }

    class Action {
      ...
    }
  }

  namespace BadDecisions {
    class Choice {
      ...
    }

    class Action {
      ...
    }
  }
}
```

**Using a namespace**

You can access a namespace in C# by implementing the *using* directive. Most C# applications begin with a section declaring all of the namespaces to be used. You may  also use qualified names similar to Java, but again it is not recommended do to it being tedious.

For example, to use the Decisions namespace, you would include the following at the beginning of your application:

```csharp
using Decisions;
```

You would then have access to all of the types developed within the Decisions name space.

```csharp
//For example without nested namespaces
using Decisions;
Action myAction = new Action();
```

If you want to use a nested namespace in particular, you may either refer to the fully qualified name or assign an alias.

```csharp
//Consider the Decisions namespace with nested namespaces
using Alias = Decisions.GoodDecisions;

//Then, the following would refer to the class in GoodDecisions
Action myAction = new Action();
```

You could also always use the qualified names, which work exactly like Java. But again, it is not recommended.

```csharp
Decisions.Action myActionOne = new Decisions.Action();

Decisions.GoodDecisions.Action myActionTwo = new Decisions.GoodDecisions.Action();

Decisions.BadDecisions.Action myActionThree = new Decisions.BadDecisions.Action();
```

------

### Previous Page 

[2. Unique Features](2UniqueFeatures.md)

### Next Page

[4. Types](4Types.md)
