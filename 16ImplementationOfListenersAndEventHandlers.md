# Implementation of Listeners and Event Handlers
### Topics Discussed
* Listeners and Event Handlers

### Background
Any proper app responds to user input. However, in order to respond to users, a program needs some way to know that input has occurred. This is where listeners and event handlers come in. Listeners and event handlers notify applications when something happens in a GUI interface and perform actions assigned to them.

---

### Java
In Java, events are handled using event classes and listener interfaces. In many cases, the listener is a functional interface that can be replaced by a lambda expression as described **here**. A listener interface includes the signature methodology for handling the desired event. To use a listener, you must implement the interface in the class you would like to trigger it or extend from a class that implements it. The class to use it should include methods for adding and removing the listener.

As an example, consider the following example of a NetBeans JavaFX startup template:
```java
public void start(Stage primaryStage) {
    Button btn = new Button();
    btn.setText("The Button");
    btn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            System.out.println("You clicked the button! Congratulations!");
        }
    });

    StackPane root = new StackPane();
    root.getChildren().add(btn);

    Scene scene = new Scene(root, 300, 250);

    primaryStage.setTitle("Event Example");
    primaryStage.setScene(scene);
    primaryStage.show();
}
```
In this example, a **Button** object is created and assigned an **EventHandler** as an anonymous inner class. Whenever the button is pressed, an **ActionEvent** object is formed that holds information about the event that occurred and what made it occur. The ActionEvent triggers its **EventHandler** handle() method, which prints out a message to show the user that the program responded to input.

---

### C#
C#  uses **events** and **delegates** to build event handlers and listeners and respond to input by users or changes in the system. In C#, delegates are used to bind events to methods that can handle them. When an event occurs, it is up to the delegate to call the handler method. A cool feature of C# is that a delegate can have multiple events bind to the same method so that different actions can have the same results.

There are two event situations in C#; implementing an event without specific data and implementing an event with specific data.

If you are implementing an event without specific data required, you can define a public event member, a protected method to raise the event, and determine when to raise it.

If you are implementing an event th at needs specific data, you can create your own event. When defining an event in C#, you must create a class that can provide data for the event and have it inherit from **EventArgs**, which is the base class for event data. Then, declare a delegate that accepts an object and your class as arguments. Once you have the delegate, you can define a public event and set the type to the event delegate. Finally, you can prepare a method that raises the event on a certain action.

Event handlers can also be prepared at run time. In order to make a comparison with the Java example above, this example will involve a Windows Form (an app) that holds one button and prints "You clicked the button!" when pressed.

C# makes implementing events very simple. All that needs to be done in this case is provision of a method with the same signature as an event we want to use and adding the EventHandler to take care of it.

Consider the code for this button:
```csharp
private void button1_Click(object sender, EventArgs e)
{
    Console.WriteLine("Congratulations! You have clicked the button!");
}
```
This method holds the method signature for handling a **Click** event. After adding the method, all that needs to be done is adding the EventHandler to the Button, which is done in the Form class in the InitializeComponent() method.
```csharp
private void InitializeComponent()
{
    this.button1 = new System.Windows.Forms.Button();
    this.SuspendLayout();
    //
    // button1
    //
    this.button1.Location = new System.Drawing.Point(148, 130);
    this.button1.Name = "button1";
    this.button1.Size = new System.Drawing.Size(75, 23);
    this.button1.TabIndex = 0;
    this.button1.Text = "The Button";
    this.button1.UseVisualStyleBackColor = true;
    this.button1.Click += new System.EventHandler(this.button1_Click);
    //
    // Form1
    //
    this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
    this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
    this.ClientSize = new System.Drawing.Size(384, 329);
    this.Controls.Add(this.button1);
    this.Name = "Form1";
    this.Text = "Form1";
    this.ResumeLayout(false);

}
```

When the button is pressed, a Click event is triggered and the button1_Click() method occurs, which writes the message to Console.

---
#### Code
[EventExample.java](EventExample.java)

[C# Event Form1.Designer.cs](Form1.Designer.cs)

[C# Event Form1.cs](Form1.cs)

#### Previous Page
[15. Lambda Expressions, Closures, or Functions as Types](15LambdaExpressions.md)

#### Next Page
[17. Singletons](17Singleton.md)
