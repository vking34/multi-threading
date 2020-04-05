# Chapter 10: Thread Pool

In Java, threads are mapped to system-level threads which are OS's resources.  
If you create threads uncontrollably, you may run out of resources quickly.  
The context switching between threads is done by OS in order to emulate parallelism.
So the more threads you create, the less time each thread spends doing actual work.

The Thread Pool pattern helps to __save resources__ in a multithreaded application, and also to contain the parallelism in __certain predefined limits__.

![Thread Pool](threadpool.png)

When you use a thread pool, you write your concurrent code in the form of parallel tasks and submit them for execution to an instance of a thread pool.
This instance controls several re-used threads for executing these tasks.
The pattern allows you to control the number of threads the application is creating, their lifecycle, as well as to schedule tasks' execution and keep incoming tasks in a queue.


Read more: https://www.baeldung.com/thread-pool-java-and-guava