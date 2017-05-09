# Null/Nil References
### Topics Discussed
* Which does the language use? (null/nil/etc)
* Does the language have features for handling null/nil references?

### Background
In object oriented programming **null** is a reference that has no value or behavior.

---

### Java
Java uses the keyword **null**.

If the JVM hits a null reference during the runtime of an application, it will trigger a NullPointerException. So, when coding, you must either prepare for a NullPointerException using error checking with try-catch statements or check objects for null values as you code.

---

### C#
C# uses the keyword **null**.

In C# all reference types can be null. The CLR views null as zero bits and represents that there is no object. Like Java, if the CLR encounters null it will cause exceptions. Programmers should anticipate the exceptions and use if-statements to check for null values.

In C#, ordinary value types cannot be null. However, C# does provide an avenue to make something similar. C# includes Nullable Types that are instances of a struct called **System.Nullable**. Nullable Types can represent value-type variables or assigned null.

---
#### Previous Page
[12. Comparisons of References and Values](12ComparisonsOfReferencesAndValues.md)

#### Next Page
[14. Errors and Exception Handling](14ErrorsAndExceptionHandling.md)
