#Errors and Exception Handling
###Topics Discussed
* Errors and Exceptions

###Background
Sometimes programs don't work out the way we hope they will. Errors are commonplace at runtime. If they are not handled properly, errors can disrupt the flow of an application. Nowadays most programming languages have ways to handle errors so that they will not turn programs into a complete trainwreck. Both Java and C# use *exceptions* to handle error events. Exceptions are any events that occur that disrupt the normal process of a program.

---

###Java
When an error occurs within a method of a Java application, the method creates an *exception object* that contains the error type and state of the program when it happened. This event is referred to as *throwing an exception*. If an exception occurs, the JVM will look for a way to handle it. There are blocks of code that users can create to take care of exceptions called *exception handlers*. An exception handler will be chosen as long as it matches the type for the exception object. When an exception handler triggers, it is called *catching*. If an exception occurs and is not caught, then the application will terminate and the user will be sad.

There are three types of exceptions including *checked exceptions*, *errors*, and *runtime exceptions*. Checked exceptions are ones that applications can anticipate and handle. Errors are external to the application and cannot be recovered from. Although an application could check for them, it makes more sense to just terminate the program. The final exception type is a runtime exception and is internal to the application but not possible to recover from. These types of errors should be dealt with by fixing bugs instead of catching. Errors and runtime exceptions are often called *unchecked exceptions* since it makes less sense to check for them.

In order to handle exceptions properly, any method that can throw an checked exception should be surrounded by a *try-catch* statement. Also, when defining method, any exceptions the method could throw should be specified in a *throws* clause.

The breath of life for handling exceptions in Java are the *try*, *catch*, and *finally* blocks. In a *try* block, the application will attempt to perform method functions. If an exception occurs, it will search the *catch* blocks for a catch statement that matches the exception object type. If a catch statement is triggered, whatever code that would happen in that block happens. A *finally* code block will trigger regardless of what happens in the try and catch blocks.

A try, catch, finally block looks like this:
```java
try
{
    // try this.
}
catch (Exception ex)
{
    // this happens if an exception occurs.
}
finally
{
    // this part happens regardless
}
```
As an example, consider the following example of try, catch, and finally blocks being used to handle an input/output exception while reading a file.

```java
Path file = Paths.get("/fakefile.txt");
try (InputStream in = Files.newInputStream(file);
    BufferedReader reader =
      new BufferedReader(new InputStreamReader(in))) {
    String line = null;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException x) {
    System.err.println(x);
} catch (Exception ex) {
    System.err.println(ex);
}
  finally {
  System.out.println("This finally block will always happen");
}
```
This code will attempt to read input from a file. If it cannot read it for whatever reason (in this case, the file does not exist) then it will throw an IOException and search the catch statements for a matching exception handle. The first catch statement should be triggered. System.out.println(x) will print the exception error. After the catch, the finally block will occur.

In Java, exception types are part of a heirarchy. All exception types inherit from **Exception**. When writing catch statements you should always start with the most specific exception and then include more general ones afterwards, ending with Exception. Exception is capable of catching any exception type.

---

###C#
Similar to Java, exceptions are created when a method interrupts at runtime. Exceptions are created by the CLR, third-party libaries, or application code using the *throw* keyword. When an exception occurs, the CLR looks for a recent method with a *catch* block that matches the exception type. If a catch block matches, the CLR will run that code. If not, the program will terminate and the user will be sad.

C# handles exceptions in the same way as Java. It uses *try*,*catch*, and *finally* statements to find and deal with exceptions. The program will attempt to run code in a try block. If an exception is thrown, the catch blocks will be examined to determine if there is a matching exception type. Finally will trigger regardless of whether an exception is caught or not.

In C#, all exceptions are derived from **System.Exception**. You can use multiple catch blocks, and should begin with the most specific exception type before using more general ones.

The try, catch, finally blocks look identical to Java:
```csharp
try
{
    // try this.
}
catch (Exception ex)
{
    // this happens if an exception occurs.
}
finally
{
    // this part happens regardless
}
```

Consider the following example with try, catch, and finally blocks being used to handle exceptions for opening a fake file:
```csharp
FileInfo file = new FileInfo("/fakefile.txt");

try {
    StreamReader read = file.OpenText();
}
catch (IOException e) {
    Console.WriteLine(e.ToString());
}
catch (Exception ex) {
    Console.WriteLine(ex.ToString());
}
finally {
    Console.WriteLine("This will happen no matter what");
}
```

This code will attempt to open a file. If it is unable to do so, it will trigger an exception and search for a catch block to handle it. If a catch block with a matching exception type is found, the catch block code will trigger and print out the exception information to the console. Regardless of whether an exception is caught, a finally block will trigger.
