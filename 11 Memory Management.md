#Memory Management
###Topics Discussed
* How is it handled?
* How does it work?
* Garbage collection?
* Automatic reference counting?

###Background
In object oriented programming, memory management refers to the way a program handles allocating memory for new objects and how it clears up space for them. Some languages handle the process automatically while other languages require users to handle the allocation and freeing of memory themselves. This section will provide an overview for how Java and C# handle memory allocation when running applications.

###Java
For Java, memory allocation and garbage collection are handled automatically by the Java Virtual Machine. When the JVM is activated to run an application an area called "the heap" is created. The heap is divided into two sections that Oracle calls the "nursery" and the "old space". All objects are allocated into the nursery section of heap until it becomes full. Once the nursery is full, a round of garbage collection clears objects which no longer have a reference and promotes others to the old space. Once the old space fills up, another round of garbage collection takes place.

When using threads, Java deploys what are called "thread local areas", which are areas of data kept apart from the heap that can be given to threads for their own use. Only small objects can be put into a thread local area. Larger objects are put onto the heap.

Garbage collection in Java is done through a Mark and Sweep Model. The JVM first marks objects that are reachable as alive. The rest can be considered no longer in use. Next, a sweep phase finds data gaps between the live objects. The free space is recorded as usable for new objects. Thus, all unused objects can have their space rewritten. Java does not utilize automatic reference counting.

###C#
In C# automatic memory management is handled by the Common Language Runtime (CLR) during execution of an application. The CLR has a garbage collector that handles allocation and memory release.

Similar to Java, C# handles memory allocation with a managed heap. When an application begins to run, space is reserved for a heap and a pointer is maintained for the address where the next object will be placed. All reference types will get placed on the heap as long as there is available space.

The CLR garbage collector releases memory for objects that are no longer in use by an application. When an object is made, a root is refers to that object in the application. The garbage collector determines if any objects are no longer being used by examining the object's root. The garbage collector frees the memory if the object is no longer reachable by an active root. (Same as Java, once there is no reference it can be free)

When a garbage collection is performed, the collector might compact reachable objects in memory so that the active objects remain contiguous in memory. It will only do this if there are many unreachable objects.

C# also does not utilize automatic reference counting.
