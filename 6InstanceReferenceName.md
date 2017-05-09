# Instance Reference Name in Data Type (class)
### Topics Discussed
* this/self

### Background
Sometimes is useful to be able to reference variable to a current object from within itself. By using a reference variable, an instance can invoke current class methods, the current class constructor (for constructor chaining), pass current object fields, and eliminate ambiguity in constructor calls.

---

### Java
In Java, a reference can be made to the current object  using the **this** keyword.

Consider my previous Penguin class example:

```java
public Penguin(int age, String gender, String type) {
  isInitialized = true;
  this.age = age;
  this.gender = gender;
  this.type = type;
}
```

---

### C#

In C#, a reference can be made to the current object using the same keyword as Java, **this**.

Consider the same example for C#

```csharp
public Penguin(int age, string gender, string type) {
  isInitialized = true;
  this.Age = age;
  this.Gender = gender;
  this.Type = type;
}
```

---
#### Previous Page
[5. Classes](5Classes.md)

#### Next Page
[7. Properties](7Properties.md)
