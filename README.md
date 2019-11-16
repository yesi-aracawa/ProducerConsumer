# <center> ProducerConsumer </center>
Explainataion of Producer and Consumer problem, threads.

## <center> Introduction </center>
<div style="text-align: justify">
Mainly it is important to understand some concepts that join with the theme of Threads, it is a very extensive subject however to understand how the problem of Producer and Consumer, it is important to know what is behind the Threads and thus understand by example how they work.
</div>

### <center> Concepts and Explaination </center>

<div style="text-align: justify">
    <p>
    **Thread:** Threads are asynchronous processes, which allows concurrency, this means that objects and resources can be accessed through many separate sub-processes or there can be multiple sub-processes within a process, running simultaneously and sharing resources such as memory, while different processes do not share these resources.
    </p>
    <p>
    Each thread is associated with an instance of the Thread class. Threads can be managed directly using Thread objects or using abstract mechanisms such as Executors and concurrent collections and each Java thread is created and controlled by the class.
        <div style="text-align: center">
            `java.lang.Thread.`
        </div>
    </p>
    <p>
    * focus on the example: Producer and Consumer extend Thread, also in some cases it is possible to implement the runnable interface but in this case will be instantiated in the main and used in Place (class of the object they use) and which will carry its flow.</p>

![Thread of Producer](images/prodthread.png)
![Thread of Consumer](images/consthread.png)

</div>
<div style="text-align: justify">
    <p>
    **Process:**Computer instances using multiple threads. A process is very similar to a thread because it acts in this way.</p>
    <p>In the example it is possible to see which producer and consumer will be the processes that will be executed, but the use of yarns is asynchronous in such a way that if the correct control is not taken over them some risk can occur for example a</p>

**Deadlock:** happens when two or more resources depend on another and this becomes a cycle as the first depends on a task that is not completed while the threads that follow depend on the previous one.
For these reasons it usually keeps track of the status of the threads by means of a variable that works as a flag to indicate which process has the resource and be able to correctly assign the waiting time of the other threads.

**Status:** Form or pocision in which an object is in a certain time.

* In the example the control is carried out by means of the variable:
    
    <code>
   
    >private boolean available = false 
    
    </code>
</div>

<div style="text-align: justify">
There are two ways to create java threads:
<code>

* Implement the Runnable interface (java.lang.Runnable)
* By Extending the Thread class (java.lang.Thread)

</code>
In the implementation of runnable you need to instantiate a thread to contain it. While the thread already contains the ability to generate a thread.

<p>
These are methods used in Object and Thread Class:
</p>

![Thread of Producer](images/methods.png)

<p>
 Also the run method which this method is called if this thread was built using a separate Runnable run object, otherwise this method does nothing and returns.
</p>

![Thread of Producer](images/run.png)
![Thread of Producer](images/consumflow.png)
![Thread of Consumer](images/prodflow.png)

<p>
The synchronized method is very helpful and fundamental for the management of the threads because through these methods is solved the problem of using the same resource with different actions and instances.
When a thread starts to execute a synchronized instance method, it automatically obtains a logical block in the object that contains the synchronized method. This lock will remain as long as that thread is running that synchronized method. When the lock is present, no other thread will be allowed to enter that object. The lock will be released automatically when that thread completes the execution of that synchronized method.

![Thread of Producer](images/sinc.png)

</p>
As seen in the producer and consumer code in their Place class which in this case is the yarn handler, they are different synchronization methods and both use the methods:

**wait()**: In charge of making the thread wait until it is notified again to wake up. The time in which it remains in wait depends on the implementation that is applied, either for an indefinite time or depending on the management that takes in the program for its activation.

**notifyAll()**: In charge of notifying all the threads that were waiting for the resource, about the availability of this and the first to activate depends on the management of the system, but unlike notify that only activates a thread, this calls everyone.

But if both methods use the same then, what is the difference, the difference is that the method that uses get and returns an integer will change the availability of the thread first, to know that the resource has been taken, then notifies all threads about the status and returns the content, which in the case of the example are numbers. While the other method takes the content first, since the resource would already be available and in this way also changes its state to tell all interested threads that the resource is already available.

![Thread of Producer](images/flow.png)

[Prod-Cons-Repo-Git-YS](https://github.com/yesi-aracawa/ProducerConsumer)
</div>



